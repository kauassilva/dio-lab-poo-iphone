import browser.Safari;
import music.IPod;
import music.Music;
import phone.Phone;

public class Main {

    public static void main(String[] args) {
        Music music1 = new Music("Laughing on the outside", "Bernadette Carroll", 140);

        IPhone iPhone = new IPhone(new IPod(), new Phone(), new Safari());

        iPhone.getIPod().getMusicList().add(music1);

        System.out.println("\n--- iPod ---");
        iPhone.getIPod().selectMusic(music1);
        iPhone.getIPod().pause();
        iPhone.getIPod().play();

        System.out.println("\n--- Phone ---");
        iPhone.getPhone().call("22 55555-4444");
        iPhone.getPhone().answer();
        iPhone.getPhone().startVoiceMail();

        System.out.println("\n--- Safari ---");
        iPhone.getSafari().addNewTab("https://www.linkedin.com/in/kaua-santos/");
        iPhone.getSafari().displayPage("https://github.com/kauassilva");
        iPhone.getSafari().refreshPage();
    }

}