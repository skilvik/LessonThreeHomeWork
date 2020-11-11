import java.util.Random;
import java.util.Scanner;

public class HomeWorkLessonThree {
        public static void main(String[] args) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int counter, guess, number;
            do {
                counter = 0;
                guess = -1;
                number = random.nextInt(10);
                while (counter < 3 && guess != number) {
                    System.out.println("Введите число от 0 до 9: ");
                    guess = scanner.nextInt();
                    if (guess != number) {

                        System.out.println("Ваше число " + (guess < number ? "меньше" : "больше"));
                        counter++;
                    }
                }
                System.out.println("Вы " + (guess == number ? "выиграли!" : "проиграли. Загаданное число: " + number));
                System.out.println("Повторить игру? Да - 1, Нет - 0: ");
            } while (scanner.nextInt()==1);
        }
    }
