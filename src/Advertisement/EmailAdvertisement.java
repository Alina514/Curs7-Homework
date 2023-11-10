package Advertisement;
import Interface.Advertisement;
public class EmailAdvertisement implements Advertisement {
    private String content;
    private String recipient;

    public EmailAdvertisement(String content) {
        this.content = content;
        this.recipient = recipient;
    }

    @Override
    public void createAdvertisement() {
        System.out.println("Create email advertisement: " + content + " for " + recipient);
    }

    @Override
    public void displayAdvertisement() {
        System.out.println("Display email advertisement: " + content + " to " + recipient);
    }
}

