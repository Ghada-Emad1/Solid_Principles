package Interface_segregation_principle.bad;

public class Robot implements WorkerInterface{
    @Override
    public void work() {
        System.out.println("Human Working");
    }

    @Override
    public void eat() {
       //so robot is not eating
       throw new UnsupportedOperationException("Robots don't eat");
    }
}
//here is a bad behaviour , we have to override to the two function
// even we know that eat not have meaning here for robots
// so our interface should be role specific