package massimomauro.S5L2SpringComponents.entities;

import massimomauro.S5L2SpringComponents.Enums.TableStatus;

public class Table {
    private long id;
    private int seatingCapacity;

    private TableStatus status;

    public Table(long id, int seatingCapacity) {
        this.id = id;
        this.seatingCapacity = seatingCapacity;

    }
}
