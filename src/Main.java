import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите вид ввода данных (из файла, рандомный выбор, ввод вручную) нажав соответствующую букву f/r/c");
        String choice = in.next();
        System.out.print("Введите длину массива");
        int massLength = Integer.parseInt(in.next());

    }
}