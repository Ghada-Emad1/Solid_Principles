package Dependency_inversion.bad;

public class Main {
    public static void main(String[] args) {
        LigthBulb ligthBulb = new LigthBulb();
        Switch lightswitch = new Switch(ligthBulb);
        lightswitch.operate();
    }
}
