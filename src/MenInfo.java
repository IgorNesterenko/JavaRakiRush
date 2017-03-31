import java.util.Scanner;

/**
 * Created by user on 17.03.2017.
 */
public class MenInfo {
    public static void main(String[] args) {
        Men men = new Men();
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter your name");
        String nameIg = scn.nextLine();
        men.setName(nameIg);


        System.out.println("Enter your Last Name");
        String nameI = scn.nextLine();
        men.setLastName(nameI);

        men.getLastName();
        men.getName();



    }
}