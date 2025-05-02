package Interface_segregation_principle.bad;

public class Human implements WorkerInterface{
    @Override
    public void work() {
        System.out.println("Human Working");
    }

    @Override
    public void eat() {
        System.out.println("Human Eating");
    }
}
