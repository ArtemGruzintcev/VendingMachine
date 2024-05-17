import java.util.*;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args, Object Main) {
        List<DrinkVendingMachine> Product = new ArrayList<>();
        Product.add(new DrinkVendingMachine("Сезонные напитки"));
        Product.add(new DrinkVendingMachine("Горячие напитки"));
        Product.add(new DrinkVendingMachine("Холодные напитки"));

        Scanner scanner = new Scanner(System.in);

        int choiceProduct;
        while (true) {
            System.out.println("Выберете категорию напитков:");
            System.out.println("1 - Сезонные напитки");
            System.out.println("2 - Горячие напитки");
            System.out.println("3 - Холодные напитки");
            System.out.println("0 - Завершить выбор");
            choiceProduct = scanner.nextInt();
            if (choiceProduct == 0) {
                break;
            }
            switch (choiceProduct) {
                case 1:
                    List<DrinkVendingMachine> filters = Product.stream()
                            .filter(drinkVendingMachine -> drinkVendingMachine.getProduct().equals("Сезонные напитки"))
                            .toList();
                    for (DrinkVendingMachine drinkVendingMachine : filters) {
                        SeasonDinksMain myClassObject = new SeasonDinksMain() {
                            @Override
                            public String toString() {
                                return super.toString();
                            }

                            @Override
                            public boolean equals(Object obj) {
                                return super.equals(obj);
                            }
                        };
                        SeasonDinksMain.main(Main);
                    }
            }
            break;
        }
    }
}

