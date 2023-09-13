import java.util.Scanner;

public class B02 {
    public static void main(String[] args) {
        //Hình vuông
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter length: ");
//        int height = Integer.parseInt(sc.nextLine());
//        System.out.print("Enter width: ");
//        int width = Integer.parseInt(sc.nextLine());
//
//        for (int i = 0; i < width; i++) {
//            for (int j = 0; j < height; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //Hình tam giác vuông
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter height: ");
//        int height = Integer.parseInt(sc.nextLine());
//        for (int i = 1; i <= height; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
        //Hình tam giác cân
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i ; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i * 2 -1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    }
}
