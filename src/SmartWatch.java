public class SmartWatch extends SmartDevice{
    boolean countSteps;
    boolean pulsometer;

    public SmartWatch() {}

    public SmartWatch(boolean bluetooth, boolean wifi, boolean touchable, String software, boolean countSteps, boolean pulsometer) {
        super(bluetooth, wifi, touchable, software);
        this.countSteps = countSteps;
        this.pulsometer = pulsometer;
    }
}
