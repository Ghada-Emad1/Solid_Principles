package Dependency_inversion.good;

public class Main {
    public static void main(String[] args) {
        SwitchableInterface lightbulb = new LightBulb();
        Switch sw = new Switch(lightbulb);
        sw.operate();
    }
}
