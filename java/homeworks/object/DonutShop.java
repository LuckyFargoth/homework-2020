package homeworks.object;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class DonutShop {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Donut vanilla = new Donut("Ванильный");
        Donut chocolate = new Donut("Шоколадный");
        Donut strawberry = new Donut("Клубничный");

        ArrayList<Object> cart = new ArrayList<>();
        ArrayList<Object> items = new ArrayList<>(Arrays.asList(vanilla, chocolate, strawberry));


        menuInput(items, reader, cart);
    }

    static void printMenu() {
        System.out.println("Пончишная: ");
        System.out.println("Меню:\n" +
                "1. Список пончиков и покупка\n" +
                "2. Добавить пончик в меню.\n" +
                "3. Удалить пончик из меню.\n" +
                "4. Корзина.\n" +
                "0. Выход\n");
    }

    public static void menuInput(ArrayList<Object> items, BufferedReader reader, ArrayList<Object> cart) throws Exception { //Put it to main?
        while (true) {
            System.out.println("\n");
            printMenu();
            System.out.println("Введите номер нужного действия: ");
            int menuNum = Integer.parseInt(reader.readLine());
            if (menuNum == 1) {
                printDonutsList(items);
                buyDonuts(items, reader, cart);
            } else if (menuNum == 2) {
                addItem(items, reader);
            } else if (menuNum == 3) {
                removeItem(items, reader);
            }  else if (menuNum == 4) {
                printCartContent(cart);
                cashCounter(cart);
            } else if (menuNum == 0) {
                System.out.println("До свидания!\n" +
                        "Мы любим вас так же сильно, как пончики!");
                System.exit(0);
            }

        }
    }


    public static void printDonutsList(List<Object> items) {
        System.out.println("Все пончики по 50 рублей! :)");
        System.out.println("Меню доступных пончиков: ");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i) + "." + items.get(i));
        }
        System.out.println();
    }


    static void addItem(ArrayList<Object> items, BufferedReader reader) throws Exception {
        System.out.println("Добавление нового пончика.");
        System.out.println("Введите название нового пончика или нажмите");
        String input = reader.readLine();
        Donut customDonut = new Donut(input);
        items.add(customDonut);
        System.out.println("Пончик добавлен в меню.");

    }


    public static void removeItem(ArrayList<Object> items, BufferedReader reader) throws Exception {
        System.out.println("Введите название пончика, который хотите удалить из меню");
        String input = reader.readLine();
        if (items.contains(input)) {
            items.remove(input);
            System.out.println("Пончик удален из меню.");
        } else if (!items.contains(input)) {
            System.out.println("Такого пончика в меню нет!");
        }
    }


    public static void buyDonuts(List<Object> items, BufferedReader reader, ArrayList<Object> cart) throws Exception {
        while (true) {
            System.out.println("Купить пончик?\n" +
                    "1.Да 2.Нет");
            int input = Integer.parseInt(reader.readLine());
            if (input == 1) {
                System.out.println("Введите номер пончика который вы хотите купить. ");
                input = Integer.parseInt(reader.readLine());
                    System.out.println(items.get(input) + " пончик добавлен в корзину");
                    addToCart(items.get(input), cart);
            } else if (input == 2) {
                return;
            }
        }
    }




    public static void cashCounter(ArrayList<Object> cart) {
        double total = 0;
        for (Object ignored : cart) {
            total += 50;
        }
        System.out.println("Стоимость товаров: " + total + " рублей.");
    }

    public static void printCartContent(ArrayList<Object> cart) {
        for (Object crt: cart) {
            System.out.println(crt);
        }
    }


    public static void addToCart(Object item, ArrayList<Object> cart) {
        cart.add(item);
    }


}

