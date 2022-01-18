import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 =(HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        boolean comprassion = bean == bean2;
        Cat bean11 = (Cat) applicationContext.getBean("cat");
        System.out.println(comprassion);

        Cat bean22 = (Cat) applicationContext.getBean("cat");
        boolean comprassion2 = bean11 == bean22;
        System.out.println(bean22.getMessage());
        System.out.println(bean11.getMessage());
        System.out.println(comprassion2);

    }
}