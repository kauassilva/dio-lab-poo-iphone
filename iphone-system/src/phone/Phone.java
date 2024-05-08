package phone;

public class Phone implements TelephoneDevice {

    @Override
    public void call(String number) {
        System.out.println("Calling the number " + number + ".");
    }

    @Override
    public void answer() {
        System.out.println("Answering the call.");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting the voice mail.");
    }

}
