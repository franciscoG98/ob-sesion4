public abstract class SmartDevice {
    boolean bluetooth;
    boolean wifi;
    boolean touchable;
    String software;

    public SmartDevice(){}

    public SmartDevice(boolean bluetooth, boolean wifi, boolean touchable, String software) {
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.touchable = touchable;
        this.software = software;
    }
}
