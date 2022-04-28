import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Добрый день!");
        System.out.println("Введите через пробел размер списка и верхнюю границу значений элементов в списке:");

        String[] list = scanner.nextLine().split(" ");

        int n = Integer.valueOf(list[0]);
        int m = Integer.valueOf(list[1]);

        logger.log("Создаём и наполняем список");
        List<Integer> arrayList = new ArrayList<>(n);
        for (int i =0; i < n; i++) {
            Random random = new Random();
            arrayList.add(random.nextInt(m));
        }
        System.out.println("Вот случайный список: " + arrayList.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");

        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(f);
        List filterList = filter.filterOut(arrayList);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filterList.toString());

        logger.log("Завершаем программу");
        scanner.close();
    }
}
