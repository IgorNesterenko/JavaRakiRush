package Cycles;
import java.io.BufferedReader;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by user on 30.03.2017.
 */
public class TestJR {
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();

        while (b != 10) {

            switch (b) {

                case 1:
                    System.out.println("понедельник");
                    break;
                case 2:
                    System.out.println("вторник");
                    break;
                case 3:
                    System.out.println("среда");
                    break;
                case 4:
                    System.out.println("четверг");
                    break;
                case 5:
                    System.out.println("пятница");
                    break;
                case 6:
                    System.out.println("суббота");
                    break;
                case 7:
                    System.out.println("воскресенье");
                    break;
                default:
                    System.out.println("Нет");
                    break;

            }
            b = scn.nextInt();
        }

        }
    }
