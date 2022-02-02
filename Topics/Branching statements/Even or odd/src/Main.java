import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        while (num > 0) {
            System.out.println(num % 2 == 0 || num == 0 ? "even" : "odd");
            num = scanner.nextInt();
        }
    }
}
