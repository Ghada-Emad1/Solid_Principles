package Interface_segregation_principle.good;

public class Human implements WorkerInterface,EatingInterface {
    @Override
    public void work() {
        System.out.println("Human Working");
    }

    @Override
    public void eat() {
        System.out.println("Human Eating");
    }
}
