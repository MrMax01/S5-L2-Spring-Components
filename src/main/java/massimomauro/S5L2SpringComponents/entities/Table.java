package massimomauro.S5L2SpringComponents.entities;

import massimomauro.S5L2SpringComponents.Enums.TableStatus;

public class Table {
    private long id;
    private int seatingCapacity;

    private TableStatus status;

    public Table(long id, int seatingCapacity) {
        this.id = id;
        this.seatingCapacity = seatingCapacity;
        this.status=TableStatus.LIBERO;

    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    //@Override
    /*public int compareTo(Table d) {
        return this.seatingCapacity - d.getSeatingCapacity();
    }
    */

    public void setStatus(TableStatus status) {
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public TableStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", seatingCapacity=" + seatingCapacity +
                ", status=" + status +
                '}';
    }
}
