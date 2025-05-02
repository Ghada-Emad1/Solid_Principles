package Interface_segregation_principle.good;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();

        Robot robot = new Robot();
        robot.work();
    }
}
