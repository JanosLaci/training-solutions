package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class PostFinder {

    List<Post> postList = new ArrayList<>(Arrays.asList(
            new Post("Csirip", LocalDate.of(2020, 12,12),
                    LocalDate.of(2020, 12,31), "Tweet", "Józsi"  ),
            new Post("Második", LocalDate.of(2020, 12,12),
                    LocalDate.of(2020, 12,31), "Tweet", "Pisti"  ),
            new Post("Második", LocalDate.of(2021, 12,12),
                    LocalDate.of(2021, 12,31), "", "Pisti"  )));




   public List<Post> findPostsFor(String user){

       List<Post> filteredPostList = new ArrayList<>();
       for (Post post: postList) {
           if (post.getOwner().equals(user)
                   & post.getPublishedAt().isBefore(LocalDate.now())
                   & (!post.getContent().isBlank())
                   & (!post.getTitle().isBlank()) ) {
               filteredPostList.add(post);
           }
       }



       return filteredPostList;
    }

    public static void main(String[] args) {
        List<Post> filteredPost = new PostFinder().findPostsFor("Józsi");
        System.out.println(filteredPost.toString());


   }

}


