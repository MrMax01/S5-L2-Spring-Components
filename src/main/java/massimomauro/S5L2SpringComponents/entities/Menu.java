package massimomauro.S5L2SpringComponents.entities;

import java.util.List;

public class Menu {

    private List<MenuElement> menu;

    public Menu(List<MenuElement> menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Menu\n");
        int i=0;
        for (MenuElement item : menu) {
            sb.append(" "+i+" ").append(item).append("\n");
            i++;
        }


        return sb.toString();
    }
}
