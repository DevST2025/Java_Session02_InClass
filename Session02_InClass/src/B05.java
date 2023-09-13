public class B05 {
    public static void main(String[] args) {
        int count = 1;
        while (!(count % 5 == 0 && count % 7 == 0 && count % 11 == 0)) {
            count++;
        }
        System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5,7 và 11: " + count);
    }
}
