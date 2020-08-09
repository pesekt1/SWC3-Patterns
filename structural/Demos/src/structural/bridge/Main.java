package structural.bridge;

public class Main {
    public static void main(String[] args) {
        var samsungTV = new SamsungTV();
        var remote = new RemoteControl(samsungTV);
        remote.turnOff();

        var advancedRemote = new AdvancedRemoteControl(samsungTV);
        advancedRemote.setChannel(2);
        advancedRemote.turnOff();
    }
}