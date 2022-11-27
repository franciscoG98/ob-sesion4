public class Main {
    public static void main(String[] args) {
        SmartWatch garminForerunner = new SmartWatch(true, true, true, "Android", true, true);
        SmartWatch samsungGalaxyWatch5 = new SmartWatch();

        System.out.println("Garmin Forerunner");
        System.out.println("bluetooth " + garminForerunner.bluetooth);
        System.out.println("wifi " + garminForerunner.wifi);
        System.out.println("touchable " + garminForerunner.touchable);
        System.out.println("software " + garminForerunner.software);
        System.out.println("countSteps " + garminForerunner.countSteps);
        System.out.println("pulsometer " + garminForerunner.pulsometer);

        System.out.println("\nSamsung Galaxy Watch5");
        System.out.println("bluetooth " + samsungGalaxyWatch5.bluetooth);
        System.out.println("wifi " + samsungGalaxyWatch5.wifi);
        System.out.println("touchable " + samsungGalaxyWatch5.touchable);
        System.out.println("software " + samsungGalaxyWatch5.software);
        System.out.println("countSteps " + samsungGalaxyWatch5.countSteps);
        System.out.println("pulsometer " + samsungGalaxyWatch5.pulsometer);

        SmartPhone iPhone5 = new SmartPhone(true, true, true, "iOs", true, false, true, true, "Apple");
        SmartPhone samsungA10 = new SmartPhone();
        samsungA10.brand = "Samsung";

        System.out.println("\niPhone5");
        System.out.println("bluetooth " + iPhone5.bluetooth);
        System.out.println("wifi " + iPhone5.wifi);
        System.out.println("touchable " + iPhone5.touchable);
        System.out.println("software " + iPhone5.software);
        System.out.println("camera " + iPhone5.camera);
        System.out.println("fingerprint " + iPhone5.fingerprint);
        System.out.println("phonecalls " + iPhone5.phonecalls);
        System.out.println("textMessages " + iPhone5.textMessages);
        System.out.println("brand " + iPhone5.brand);


        System.out.println("\nSamsung A10");
        System.out.println("bluetooth " + samsungA10.bluetooth);
        System.out.println("wifi " + samsungA10.wifi);
        System.out.println("touchable " + samsungA10.touchable);
        System.out.println("software " + samsungA10.software);
        System.out.println("camera " + samsungA10.camera);
        System.out.println("fingerprint " + samsungA10.fingerprint);
        System.out.println("phonecalls " + samsungA10.phonecalls);
        System.out.println("textMessages " + samsungA10.textMessages);
        System.out.println("brand " + samsungA10.brand);

    }
}