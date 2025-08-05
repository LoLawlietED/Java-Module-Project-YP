import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++){
            System.out.println("Введите данные для автомобиля " + (i + 1) + ":");

            System.out.println("Название: ");
            String name = scanner.nextLine();


            boolean validSpeed = false;
            while (!validSpeed){

                System.out.println("Введите скорость от 1 до 250 км/ч: ");
                String scanner1 = scanner.nextLine().trim();
                int speed = Integer.parseInt(scanner1);
                if (speed > 0 && speed < 250){
                    validSpeed = true;
                    cars[i] = new Car(name, speed);
                    break;
                }else {
                    System.out.println("Скорость должна быть от 1 до 250 км/ч. Попробуйте еще раз. ");
                }
            }

        }
        Race race = new Race(cars);
        Car leader = race.getLeader();

        System.out.println("Победититель: " + leader.getName());

    }

}