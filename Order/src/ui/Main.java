package ui;

import model.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by carlorizzante on 24/08/17.
 */
public class Main {


    public static void main(String[] args) {

        List<Order> orders = new ArrayList<Order>();

        Order o1 = new Order("Jon", 'A');
        Order o2 = new Order("Janet", 'B');
        Order o3 = new Order("Drake", 'C');
        Order o4 = new Order("Kim", 'D');
        Order o5 = new Order("Julie", 'E');

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);

        o1.instructions("Extra hot");
        o3.instructions("To go");

        o1.processing();
        o2.processing();
        o4.processing();

        o2.completed();

        o5.processing();

        o1.completed();

        String ticket;
        String status;
        String instructions;

        for (Order o: orders) {

             ticket = String.valueOf(o.getTicket());

            if (o.isCompleted()) {
                String receipt = String.valueOf(o.getPrice());
                System.out.println("Receipt for order " + ticket + " - " + receipt);
            } else {
                status = o.getStatus();
                instructions = o.getInstructions();
                System.out.println("Order " + ticket + " is " + status + " - " + instructions);
            }
        }


    }

}
