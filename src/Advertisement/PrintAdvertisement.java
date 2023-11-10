package Advertisement;

import Interface.Advertisement;

public class PrintAdvertisement implements Advertisement {
    private String content;
    private int numberOfCopies;

    public PrintAdvertisement(String content, int i) {
        this.content = content;
        this.numberOfCopies = numberOfCopies;
    }
    @Override
    public void createAdvertisement() {
        System.out.println("Creating print advertisement: " + content + " - " + numberOfCopies + " copies");
    }
    @Override
    public void displayAdvertisement() {
        System.out.println("Displaying print advertisement: " + content + " - " + numberOfCopies + " copies");
    }

}
