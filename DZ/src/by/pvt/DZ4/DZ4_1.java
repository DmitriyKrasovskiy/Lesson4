package by.pvt.DZ4;

import java.util.Scanner;

public class DZ4_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Input day");
        String day = in.nextLine();
        int d = Integer.parseInt(day);


        System.out.println("Input month");
        String month = in.nextLine();
        int m = Integer.parseInt(month);

        System.out.println("Input year");
            String year = in.nextLine();
            int y = Integer.parseInt(year);

            if (d == 31 & m == 12) {
                y++;
                System.out.println("1" + " " + "1" + " " + y + "С новым годом!");
                        }
            switch (m) {
                case 1:
                case 3:
                case 5:
                case 8:
                case 7:
                case 10:
                case 12:
                    if (d > 31 || d <= 0) {
                        System.out.println("Date mistake");
                    } else {
                        if (d + 1 == 32) {
                            System.out.println("1 " + (m + 1) + " " + y);
                        } else {
                            System.out.println((d + 1) + " " + m + " " + y);
                        }
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (d > 30 || d <= 0) {
                        System.out.println("Date mistake");
                    } else {
                        if (d + 1 == 30) {
                            System.out.println("1 " + (m + 1) + " " + y);
                        } else {
                            System.out.println((d + 1) + " " + m + " " + y);
                        }
                    }
                    break;
                case 2:
                    if (d > 29 || d <= 0) {
                        System.out.println("Date mistake");
                    } else {
                        if (d == 29) {
                            if ((((y % 4 == 0) && !(y % 100 == 0)) || (y % 400 == 0))) {
                                System.out.println(d + m + y);
                            } else {
                                System.out.println("Ошибка, год не високосеый");
                            }
                        } else {
                            if (d + 1 == 29) {
                                System.out.println("1 " + (m + 1) + y);
                            } else {
                                System.out.println((d + 1) + " " + m + " " + y);
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Date mistake");
                    break;
            }
            }
}
