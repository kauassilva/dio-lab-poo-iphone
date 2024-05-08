package browser;

public class Safari implements InternetBrowser {

    @Override
    public void displayPage(String url) {
        System.out.println("Displaying the webpage: " + url + ".");
    }

    @Override
    public void addNewTab(String url) {
        System.out.println("Opening a new tab with the URL: " + url + ".");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing the current page.");
    }

}
