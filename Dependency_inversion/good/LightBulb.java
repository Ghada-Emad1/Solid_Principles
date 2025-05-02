package Dependency_inversion.good;

public class LightBulb implements SwitchableInterface {
    @Override
    public void turnOn(){
        System.out.println("Turn on Light Bulb");
    }
}
// now lightbulb depends on the abstraction