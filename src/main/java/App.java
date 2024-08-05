import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean3 = applicationContext.getBean("cat", Cat.class);
        Cat bean4 = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean1 == bean2);
        System.out.println(bean3 == bean4);
    }
}