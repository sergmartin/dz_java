import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Input.nextInt();
        Input.close();
        System.out.println("Треугольное число = " + TriaC(a) + "\n");
    }

    public static int TriaC(int n) {
        if (n == 1) {
            return 1;
        }
        return TriaC(n - 1) + n;
    }
}