package Home_taskInterface;

/**
 * Created by user on 13.04.2017.
 */
public class QA extends Coworkers implements ICoWorkers {


    public QA(String name, String lastName, int age, String work, int workexperiance) {
        super(name, lastName, age, work, workexperiance);
    }


    @Override
    public void kindOfWork(){
        System.out.println("Manual testing of Software");
    }

    @Override
    public void getSalery() {
        int sel = 500 * workExperiance;
        System.out.println("Selary of QA is: " + sel);
    }


}
