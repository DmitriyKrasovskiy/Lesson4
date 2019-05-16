package by.pvt.DZ4;

import java.util.Scanner;

public class DZ4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {


            int l1 = 0;
            int w1 = 0;
            int l2 = 0;
            int w2 = 0;
            int l3 = 0;
            int w3 = 0;

            System.out.println("Enter lenght1 ");
            String a = scanner.nextLine();
            l1 = Integer.parseInt(a);
            if (l1 <= 0) {
                System.out.println("Сторона не может быть меньше ноля");
                System.out.println("Enter lenght1 once more");
                String a1 = scanner.nextLine();
                l1 = Integer.parseInt(a1);
            }


            System.out.println("Enter width1 ");
            String b = scanner.nextLine();
            w1 = Integer.parseInt(b);
            if (w1 <= 0){
                System.out.println("Сторона не может быть меньше ноля");
                System.out.println("Enter lenght1 once more");
                String b1 = scanner.nextLine();
                w1 = Integer.parseInt(b1);
            }

            System.out.println("Enter lenght2 ");
            String c = scanner.nextLine();
            l2 = Integer.parseInt(c);
            if (l2 <= 0){
                System.out.println("Сторона не может быть меньше ноля");
                System.out.println("Enter lenght1 once more");
                String c1 = scanner.nextLine();
                l2 = Integer.parseInt(c1);
            }


            System.out.println("Enter width2 ");
            String d = scanner.nextLine();
            w2 = Integer.parseInt(d);
            if (w2 <= 0){
                System.out.println("Сторона не может быть меньше ноля");
                System.out.println("Enter lenght1 once more");
                String d1 = scanner.nextLine();
                w2 = Integer.parseInt(d1);
            }

            System.out.println("Enter lend size1 ");
            String e = scanner.nextLine();
            l3 = Integer.parseInt(e);
            if (l3 <= 0){
                System.out.println("Сторона не может быть меньше ноля");
                System.out.println("Enter lenght1 once more");
                String e1 = scanner.nextLine();
                l3 = Integer.parseInt(e1);
            }


            System.out.println("Enter land size2 ");
            String f = scanner.nextLine();
            w3 = Integer.parseInt(f);
            if (w3 <= 0){
                System.out.println("Сторона не может быть меньше ноля");
                System.out.println("Enter lenght1 once more");
                String f1 = scanner.nextLine();
                w3 = Integer.parseInt(f1);
            }

            int min1 = Math.min(l1, w1);
            int max1 = Math.max(l1, w1);
            int min2 = Math.min(l2, w2);
            int max2 = Math.max(l2, w2);
            int minLand = Math.min(l3, w3);
            int maxLand = Math.max(l3, w3);


            if (l3 * w3 < (l1 * w1 + l2 * w2)) {
                System.out.println("Не поместится");
                continue;
            }

            if (min1 + min2 > minLand & max1 + max2 > maxLand) {
                System.out.println("Не поместится");
                continue;
            }

            if ((min1 > minLand || min2 > minLand) || (max1 > maxLand || max2 > maxLand)) {
                System.out.println("Не поместится");
                continue;
            }
            System.out.println("Поместится");
            break;
        }
    }
}

