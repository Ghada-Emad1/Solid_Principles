package Interface_segregation_principle.good;

public class Robot  implements WorkerInterface{
    public void work(){
        System.out.println("Robot Working");
    }
}
