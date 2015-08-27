import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		Customer cust = (Customer) context.getBean("beanCustomer");
		System.out.println(cust.getAction());
		System.out.println(cust.getPerson().getName());

	}
}
