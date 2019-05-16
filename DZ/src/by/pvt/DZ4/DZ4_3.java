package by.pvt.DZ4;

import java.util.Scanner;

public class DZ4_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //    while (true) {
            System.out.println("Enter number for count faktorial");
            int number = in.nextInt();

            int i = 1;
            int fakt = 1;
            while (i <= number) {
                fakt = fakt * i;
                i++;
            }

            System.out.println("Faktorial = " + fakt);
        }
    }
