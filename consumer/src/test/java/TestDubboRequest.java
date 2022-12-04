import com.hit.lyx.dubbo.demo.api.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TestDubboRequest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/consumer.xml");
        ctx.start();
        UserService service = ctx.getBean(UserService.class);
        House house= ctx.getBean(House.class);
        HouseManager houseManager=ctx.getBean(HouseManager.class);
        UserManager userManager=ctx.getBean(UserManager.class);
        UtilData utilData=ctx.getBean(UtilData.class);
//        UserRestService userRestService = ctx.getBean(UserRestService.class);
        System.out.println(house.m());//打印出34
        Scanner in = new Scanner(System.in);
        while (true){
            Long id = in.nextLong();
            System.out.println(service.getUser(id));
        }
    }
}
