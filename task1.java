import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Введите число : ");
        int a = Input.nextInt();
        Input.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }

    public static int Triangle(int num) {
        if (num == 1) {
            return 1;
        }
        return Triangle(num - 1) + num;
    }
}