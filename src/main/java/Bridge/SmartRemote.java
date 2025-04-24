package Bridge;

public class SmartRemote extends BasicRemote{
    public SmartRemote(Device device) {
        super.device = device;
    }

    public void voiceControl(String command) {
        System.out.println("Voice command received: " + command);
        String c = command.toLowerCase().trim();
        if (c.equals("open browser") && device instanceof SmartTv) {
            ((SmartTv) device).browseInternet();
        } else {
            System.out.println("Unknown command or unsupported device.");
        }
    }
}
