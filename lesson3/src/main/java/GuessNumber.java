import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        while (true) {
            guess(a);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int repeat = scanner.nextInt();
            if (repeat == 0) {
                break;
            }
        }
    }

    public static boolean guess(int a) {
        boolean result = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("Отгадай число от 0 до 9. У тебя " + (3 - i) + " попытки (-а)");
            int x = scanner.nextInt();
            if (x == a) {
                System.out.println("Отгадал!");
                return result = true;
            } else if (x < a) {
                System.out.println("Загаданное число больше, чем " + x);
            } else {
                if (i < 2) {
                    System.out.println("Загаданное число меньше, чем " + x);
                }
            }
        }
        System.out.println("Не угадал! Было загадано число " + a);
        return result;
    }
}
