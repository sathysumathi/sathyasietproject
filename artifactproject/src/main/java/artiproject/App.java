package artiproject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Payment pay=context.getBean("payment", Payment.class);
		pay.getMessage();
        System.out.println("=======================");
        ((AbstractApplicationContext) context).registerShutdownHook();
	}

}
