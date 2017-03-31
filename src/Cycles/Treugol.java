package Cycles;

import java.util.Scanner;

/**
 * Created by user on 30.03.2017.
 */
public class Treugol {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextByte();

        String textYes = "Треугольник существует.";
        String textNo = "Треугольник не существует.";

        if (a > (b+c)){
            System.out.println(textNo);
        } else  if (b>(a+c)){
            System.out.println(textNo);
        } else  if (c>(a+b)) {
            System.out.println(textNo);
        } else System.out.println(textYes);
    }
}
