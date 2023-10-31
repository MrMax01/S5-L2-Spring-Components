package massimomauro.S5L2SpringComponents;


import massimomauro.S5L2SpringComponents.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    List<Pizza> getPizzas() {
        List <Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Pizza Margherita", 1104, 4.99));
        pizzas.add(new Pizza("Hawaii Pizza", 1024, 6.49));
        return pizzas;
    }
    @Bean
    List<Topping> getToppings() {
        List <Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Cheese", 92, 0.69));
        toppings.add(new Topping("Ham", 35, 0.99));
        return toppings;
    }
    @Bean
    List<Drink> getDrinks() {
        List <Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Lemonade", 128, 1.29));
        drinks.add(new Drink("Water", 0, 1.29));
        drinks.add(new Drink("Wine", 607, 7.49));
        return drinks;
    }

    @Bean
    Menu getMenu (List<Drink> d, List<Topping> t, List <Pizza> p){
        List<MenuElement> menu= new ArrayList<>();
        menu.addAll(p);
        menu.addAll(t);
        menu.addAll(d);
        return new Menu(menu);
    }

    @Bean
    List<Table> getTable (){
        List<Table> tables = new ArrayList<>();
        tables.add(new Table(1, 5));
        tables.add(new Table(2, 3));
        tables.add(new Table(3, 2));
        tables.add(new Table(4, 7));
        tables.add(new Table(5, 4));
        return tables;
    }


}