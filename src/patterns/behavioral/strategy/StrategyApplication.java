package patterns.behavioral.strategy;

import patterns.behavioral.strategy.strategies.Order;
import patterns.behavioral.strategy.strategies.PayByCreditCard;
import patterns.behavioral.strategy.strategies.PayByPayPal;
import patterns.behavioral.strategy.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StrategyApplication {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Выберите продукт:" + "\n" +
                        "1 - Материнская плата" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - Жесткий диск" + "\n" +
                        "4 - Память" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Количество: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Продолжить выбор продуктов? Д/Н: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Д"));

            if (strategy == null) {
                System.out.println("Выберите способ платежа:" + "\n" +
                        "1 - Paypal" + "\n" +
                        "2 - Банковская карта");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            order.processOrder(strategy);

            System.out.print("Оплатить " + order.getTotalCost() + " рублей или Продолжить выбор товаров? О/П: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("О")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Оплата прошла успешно");
                } else {
                    System.out.println("Ошибка оплаты");
                }
                order.setClosed();
            }
        }
    }
}
