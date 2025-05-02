package Dependency_inversion.good;

public class Switch {
    private SwitchableInterface device;

    public Switch(SwitchableInterface _device) {
        this.device = _device;
    }

    public void operate(){
        device.turnOn();
    }
}
// now also switch depend on the abstraction