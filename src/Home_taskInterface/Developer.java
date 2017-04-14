package Home_taskInterface;

/**
 * Created by user on 14.04.2017.
 */
public class Developer extends Coworkers implements ICoWorkers {

    public Developer(String name, String lastName, int age, String work, int workExperiance) {
        super(name, lastName, age, work, workExperiance);
    }

    @Override
    public void kindOfWork() {
        System.out.println("Write code");
    }

    @Override
    public void getSalery() {
    int sel = 700*workExperiance;
        System.out.println("Selary of developer is: " + sel);
    }
}
