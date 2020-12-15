import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld h1 = applicationContext.getBean(HelloWorld.class);
		HelloWorld h2 = applicationContext.getBean(HelloWorld.class);
        System.out.println(h1 == h2);
		Cat c1 = applicationContext.getBean(Cat.class);
		Cat c2 = applicationContext.getBean(Cat.class);
		System.out.println(c1 == c2);
    }
}