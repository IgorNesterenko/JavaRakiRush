package Home_taskInterface;

/**
 * Created by user on 13.04.2017.
 */
public class Coworkers {
    protected  String name;
    protected String lastName;
    protected int age;
    protected String work;
    protected int workExperiance;

    public Coworkers(String name, String lastName, int age, String work, int workExperiance) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.work = work;
        this.workExperiance = workExperiance;
        }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public int getWorkExperiance() {
        return workExperiance;
    }
}
