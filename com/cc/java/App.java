package com.cc.java;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {

        // Order order = new Order("order 1");
        // Logger.ausgabe(order.getName());

        ArrayList<Order> orders = new ArrayList<>();
        Logger.ausgabe(orders);

        // orders.add(new Order("Auftrag 1"));
        // Logger.ausgabe(orders);
        // Logger.ausgabe(orders.get(0).getName());

        Order order1 = new Order("Auftrag 1");
        orders.add(order1);
        Logger.ausgabe(orders);

        Order order2 = new Order("Auftrag 2");
        orders.add(order2);
        Logger.ausgabe(orders);

        Logger.ausgabe(orders.get(orders.size()-1).getName());
        // suche nach objekt in der AL
        Logger.ausgabe(orders.get(orders.indexOf(order1)).getName());
        Logger.ausgabe(orders.get(orders.indexOf(order2)).getName());

        orders.remove(order1);
        Logger.ausgabe(orders);

        
    }

}
