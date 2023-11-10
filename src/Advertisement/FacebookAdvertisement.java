package Advertisement;

import Interface.Advertisement;

public class FacebookAdvertisement implements Advertisement {
    private String content;

    public FacebookAdvertisement(String content) {
        this.content = content;
    }
    @Override
    public void createAdvertisement() {
        System.out.println("Create Facebook advertisement: " + content);
    }
    @Override
    public void displayAdvertisement() {
        System.out.println("Display Facebook advertisement: " + content);
    }
}






