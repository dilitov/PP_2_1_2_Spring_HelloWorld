import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworlds");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworlds");
        Cat one =
                (Cat) applicationContext.getBean("cat");
        Cat two =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean == bean1);
        System.out.println(one == two);
    }
}