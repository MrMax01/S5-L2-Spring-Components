package massimomauro.S5L2SpringComponents;

import massimomauro.S5L2SpringComponents.Enums.OrderStatus;
import massimomauro.S5L2SpringComponents.Enums.TableStatus;
import massimomauro.S5L2SpringComponents.entities.Menu;
import massimomauro.S5L2SpringComponents.entities.MenuElement;
import massimomauro.S5L2SpringComponents.entities.Order;
import massimomauro.S5L2SpringComponents.entities.Table;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

@SpringBootApplication
public class S5L2SpringComponentsApplication {

	public static void main(String[] args) {

		SpringApplication.run(S5L2SpringComponentsApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S5L2SpringComponentsApplication.class);
			Random random= new Random();
			Scanner in = new Scanner(System.in);
			int personNum;
			Table tableTaken= null;


		app:
		while(true){
			askPersonNum:

				System.out.println("Buongiorno/Buonasera in quanti siete?");
				try{

					personNum = Integer.parseInt(in.nextLine());
					List<Table> tables = (List<Table>) ctx.getBean("getTables");
					List <Table> freeTable = tables.stream().filter(table -> table.getStatus()== TableStatus.LIBERO).toList();
					 long idTable = 0;
					for (int i = 0; i < freeTable.size(); i++) {
						if(freeTable.get(i).getSeatingCapacity()>= personNum){
							idTable = freeTable.get(i).getId();
							freeTable.get(i).setStatus(TableStatus.OCCUPATO);
							tableTaken=freeTable.get(i);
							break;
						}
					}
					if(idTable==0){
						System.err.println("I tavoli sono tutti occupati!");
						break app;
					}

					System.out.println("prego sedetivi pure al tavolo N°"+idTable);

					List<MenuElement> orderList= new ArrayList<>();
					Menu menu = (Menu) ctx.getBean("getMenu");
					int orderNum = random.nextInt(6)+1;
					for (int i = 0; i <orderNum ; i++) {
						orderList.add(menu.getMenu().get(random.nextInt(menu.getMenu().size())));
					}

					Order order= new Order(random.nextLong(), tableTaken, orderList, OrderStatus.IN_CORSO, LocalTime.now(), personNum);


				}catch(Exception e){
					System.err.println(e.getMessage());
				}

		}
		ctx.close();
	}

}
