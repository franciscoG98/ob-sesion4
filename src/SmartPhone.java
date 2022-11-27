public class SmartPhone extends SmartDevice{
    boolean camera;
    boolean fingerprint;
    boolean phonecalls;
    boolean textMessages;
    String brand;

    public SmartPhone() {}

    public SmartPhone(boolean bluetooth, boolean wifi, boolean touchable, String software, boolean camera, boolean fingerprint, boolean phonecalls, boolean textMessages, String brand) {
        super(bluetooth, wifi, touchable, software);
        this.camera = camera;
        this.fingerprint = fingerprint;
        this.phonecalls = phonecalls;
        this.textMessages = textMessages;
        this.brand = brand;
    }
}
