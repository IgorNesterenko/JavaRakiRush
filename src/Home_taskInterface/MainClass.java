package Home_taskInterface;

/**
 * Created by user on 13.04.2017.
 */
public class MainClass {
    public static void main(String[] args) {
        QA qa = new QA("Igor", "Nes", 27, "QA", 4);

        System.out.println(qa.getName());
        System.out.println(qa.getLastName());
        System.out.println(qa.getAge());
        System.out.println(qa.work);
        System.out.println(qa.workExperiance);
        qa.kindOfWork();
        qa.getSalery();


    }


}
