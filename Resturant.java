import java.util.Scanner;

public class Resturant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome RD resturant");
        System.out.println("Enter your adhar num:");
        int n = in.nextInt();
        System.out.println("Enter your mobile number:");
        int a = in.nextInt();
        System.out.println("Your table number= 7");
        System.out.println("Enter your name");
        String s = in.next();
        System.out.println("welcome to " + s + " and your table number 7");
        System.out.println("1 breakfast \n 2.Lunch \n 3.Dinner");
        System.out.println("Enter your choice:");
        int ch = in.nextInt();
        switch (ch) {
            case 1:

                System.out.println("1.tea...rs 50 \n 2.coffee.....rs 100");
                System.out.println("enter your person  ");
                int f = in.nextInt();
                System.out.println(" please choice any one  ");
                int F = in.nextInt();
                switch (F) {
                    case 1:
                        System.out.println(" your amount is " + 50 * f);
                        break;
                    case 2:
                        System.out.println(" your amunt is " + f * 100);
                        break;
                    default:
                        break;
                }
                System.out.println("your total amount=" + f);

                break;
            case 2:
                System.out.println("1.chola bhatura...rs 80 \n 2.chwal rajma...rs 80");
                System.out.println("enter your person  ");
                int g = in.nextInt();
                System.out.println(" please choice any one  ");
                int G = in.nextInt();
                switch (G) {
                    case 1:
                        System.out.println(" your amount is " + 80 * g);
                        break;
                    case 2:
                        System.out.println(" your amunt is " + g * 80);
                        break;
                    default:
                        break;
                }
                System.out.println("your total amount=" + g);
                break;
            case 3:
                System.out.println(" 1.fried rice...100 \n 2.daal makhni...100");
                System.out.println("enter your person  ");
                int l = in.nextInt();
                System.out.println(" please choice any one  ");
                int L = in.nextInt();
                switch (L) {
                    case 1:
                        System.out.println(" your amount is " + 100 * l);
                        break;
                    case 2:
                        System.out.println(" your amunt is " + l * 100);
                        break;
                    default:
                        break;
                }
                System.out.println("your total amount=" + l);
                break;
            case 4:
                break;

            default:
                System.out.println("Your choice is invalid:");
        }

    }
}
