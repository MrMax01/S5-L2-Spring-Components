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

    public Order(long id, Table table, List<MenuElement> orderList, OrderStatus status, LocalTime time, int personNum) {
        this.id = id;
        this.table = table;
        this.orderList = orderList;
        this.status = status;
        this.time = time;
        this.personNum = personNum;

    }

    public void setTotalCost() {
        this.totalCost= this.orderList.stream().mapToDouble(MenuElement::getPrice).sum();
    }
}
