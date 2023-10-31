package massimomauro.S5L2SpringComponents.entities;

public abstract class MenuElement {

        private String name;
        private long calories;
        private double price;

        public MenuElement(String name, long calories, double price) {
            this.name = name;
            this.calories = calories;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public long getCalories() {
            return calories;
        }

        public void setCalories(long calories) {
            this.calories = calories;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return
                    "{ name='" + name + '\'' +
                            ", calories=" + calories +
                            ", price=" + price +
                            '}';
        }

}
