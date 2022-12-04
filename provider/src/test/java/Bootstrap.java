import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Bootstrap {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/provider.xml");
        ctx.start();
        System.out.println("provider is started...");
        System.in.read();
    }
}
