package houseManagement.manage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TrySpring trySpring = (TrySpring) context.getBean("trySpring");
        trySpring.setMessage("Hello Nir!");
        trySpring.printMessage();
    }
}
