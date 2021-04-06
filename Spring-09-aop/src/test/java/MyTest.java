import com.mf.service.UserService;
import com.mf.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mf
 * @create 2021-04-05-21:17
 */
public class MyTest {
    @Test
    public void testAPI(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);//动态代理的是接口
        userService.add();
        userService.delete();



    }
}
