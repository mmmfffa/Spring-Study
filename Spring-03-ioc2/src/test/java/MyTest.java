import com.mf.pojo.User;
import com.mf.pojo.UserT;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mf
 * @create 2021-04-04-21:03
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserT userT = (UserT) context.getBean("hhh");
        userT.show();



    }
}
