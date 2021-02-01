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


    public void starPhoto(String inputName, Quality inputQuality) {
        boolean foundAtLeastOnePhoto = false;
        for (Photo photo: photos) {
            if (photo.getName().equals(inputName)){
                photo.setQuality(inputQuality);
                foundAtLeastOnePhoto = true;
            }
            if (foundAtLeastOnePhoto = false) {
                throw new PhotoNotFoundException("No such photo found.");
            } } }


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
