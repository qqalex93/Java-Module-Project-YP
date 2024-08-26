import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название болида " + (i+1) + ":");
            String name = scanner.nextLine();

            boolean isValid = false;
            int speed = 0;
            while (!isValid) {
                System.out.println("Введите скорость болида " + (i+1) + ":" );
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();
                    if (speed > 0 && speed <= 250) {
                    isValid = true;
                    } else {
                    System.out.println("Неправильная скорость!");
                    }
                    } else  {
                        System.out.println("Неверная значение ввода. Попробуйте еще раз.");
                        scanner.next();
                    }
            }
        Cars car = new Cars(name, speed);
            race.addCar(car);
        }
        scanner.close();

        System.out.println("Самая быстрая машина: " + race.getLeader().getName());
    }
}