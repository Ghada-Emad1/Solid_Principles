package Dependency_inversion.bad;

public class Switch {
    private LigthBulb ligthBulb;

    public Switch(LigthBulb _ligthBulb) {
        this.ligthBulb = _ligthBulb;
    }

    public void operate() {
        ligthBulb.turnOn();
    }
}

// So the solution is: both the high-level module (Switch) and the low-level
// module (LightBulb/Fan)
// depend on the abstraction (SwitchableDevice). This follows the Dependency
// Inversion Principle
// because neither module depends directly on the other’s concrete
// implementation.
