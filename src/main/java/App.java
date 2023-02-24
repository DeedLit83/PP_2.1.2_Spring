import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Пара \"helloworld\" - " + (bean1 == bean2));

        Cats cat1 = (Cats) applicationContext.getBean("cat");
        Cats cat2 = (Cats) applicationContext.getBean("cat");
        System.out.println("Пара \"cat\" - " + (cat1 == cat2));
    }
}