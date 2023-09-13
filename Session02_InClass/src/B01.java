import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNum = Integer.parseInt(sc.nextLine());
        System.out.print("Enter last number: ");
        int lastNum = Integer.parseInt(sc.nextLine());

        int sum = 0;
        int count = (firstNum % 2 == 0) ? (firstNum) : (firstNum + 1);
        for (int i = count; i <= lastNum; i+=2) {
            sum += i;
        }
        System.out.printf("Tổng các số chẵn từ %d đến %d là %d", firstNum, lastNum, sum);
        sc.close();
    }
}
