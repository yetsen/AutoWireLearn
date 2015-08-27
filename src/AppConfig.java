import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {	

	@Bean
	public AutowiredAnnotationBeanPostProcessor processor(){
		return new AutowiredAnnotationBeanPostProcessor();
	}
	
	@Bean
	public Customer beanCustomer(){
		Customer cust = new Customer();
		cust.setAction("buy");
		cust.setType(1);
		return cust;
	}

	@Bean
	public Person beanPerson(){
		Person person = new Person();
		person.setAddress("aliev");
		person.setAge(11);
		person.setName("ali");
		return person;
	}

	@Bean
	public Person beanPerson2(){
		Person person = new Person();
		person.setAddress("veliev");
		person.setAge(15);
		person.setName("veli");
		return person;
	}
}
