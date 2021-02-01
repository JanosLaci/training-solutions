package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {
    private List<Photo> photoList = new ArrayList<>();


    public PhotoCollection() {
    }

    public void addPhoto(String inputPhotoName){
        photoList.add(new Photo(inputPhotoName,Quality.NO_STAR));
    }

}
