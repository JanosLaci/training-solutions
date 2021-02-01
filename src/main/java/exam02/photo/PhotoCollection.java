package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {
    private List<Photo> photos = new ArrayList<>();


    public PhotoCollection() {
    }

    public void addPhoto(String... inputPhotoNameVarArgs){
        for (String inputPhotoName: inputPhotoNameVarArgs) {
            photos.add(new Photo(inputPhotoName,Quality.NO_STAR));
        }
    }


    /*public void starPhoto(String inputName, Quality inputQuality) {
        boolean foundAtLeastOnePhoto = false;
        for (Photo photo: photos) {
            if (photo.getName().equals(inputName)){
                photo.setQuality(inputQuality);
                foundAtLeastOnePhoto = true;
                return;
            }
            if (foundAtLeastOnePhoto = false) {
                throw new PhotoNotFoundException("No such photo found.");
            } } }*/

    //Csak így működik:
    //https://e-learning.training360.com/courses/take/java-backend-kepzesi-anyagok/lessons/19768624-01-11-senior-csoport-junior-java-backend-fejleszto-konzultacio-2021-01-04-29-10-00-11-30-3
    public void starPhoto(String inputName, Quality inputQuality) {
        for (Photo photo: photos) {
            if (photo.getName().equals(inputName)){
                photo.setQuality(inputQuality);
                return;
            }

        }
        throw new PhotoNotFoundException("No such photo found.");
    }


/*kérdés: így sem működött
    public void starPhoto(String inputName, Quality inputQuality) {
        for (Photo photo: photos) {
            if (photo.getName().equals(inputName)){
                photo.setQuality(inputQuality);
                return;
            }
            else {
                throw new PhotoNotFoundException("No such photo found.");
            }
             }

    }*/


    //kérdés: Nem működött:
    //public void starPhoto(String inputName, Quality inputQuality) {
    //        for (Photo photo: photos) {
    //            if (photo.getName().equals(inputName)){
    //                photo.setQuality(inputQuality);
    //                return;
    //            }
    //
    //        throw new PhotoNotFoundException("No such photo found.");}
    //    }


    public int numberOfStars() {
        int starCounter=0;
        for (Photo photo:
                photos) {
            starCounter = starCounter + photo.getQuality().getValue();
        }
        return starCounter;
    }

    public List<Photo> getPhotos() {
        return photos;
    }
}
