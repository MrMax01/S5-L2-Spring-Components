package massimomauro.S5L2SpringComponents.entities;

import massimomauro.S5L2SpringComponents.Enums.OrderStatus;

import java.time.LocalTime;
import java.util.List;

public class Order {
    private long id;
    private Table table;
    private List<MenuElement> orderList;

    private OrderStatus status;
    private LocalTime time;
    private int personNum;
    private double totalCost;
}
