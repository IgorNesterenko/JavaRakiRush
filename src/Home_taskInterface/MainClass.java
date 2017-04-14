package Home_taskInterface;

/**
 * Created by user on 13.04.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        QA qa = new QA("Igor", "Nes", 27, "QA", 4);
        Developer developer = new Developer("Alex", "Panash", 28, "dev", 6);

        System.out.println(qa.getName());
        System.out.println(qa.getLastName());
        System.out.println(qa.getAge());
        System.out.println(qa.getWork());
        System.out.println(qa.getWorkExperiance());
        qa.kindOfWork();
        qa.getSalery();

        System.out.println("==========================");

        System.out.println(developer.getName());
        System.out.println(developer.getLastName());
        System.out.println(developer.getAge());
        System.out.println(developer.getWork());
        System.out.println(developer.getWorkExperiance());
        developer.kindOfWork();
        developer.getSalery();

    }


}
