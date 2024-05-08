import browser.Safari;
import music.IPod;
import phone.Phone;

public class IPhone {

    private IPod iPod;
    private Phone phone;
    private Safari safari;

    public IPhone(IPod iPod, Phone phone, Safari safari) {
        this.iPod = iPod;
        this.phone = phone;
        this.safari = safari;
    }

    public IPod getIPod() {
        return iPod;
    }

    public void setIPod(IPod iPod) {
        this.iPod = iPod;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Safari getSafari() {
        return safari;
    }

    public void setSafari(Safari safari) {
        this.safari = safari;
    }

}
