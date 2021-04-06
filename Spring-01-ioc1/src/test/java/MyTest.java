import com.mf.dao.UserDaoMysqlImpl;
import com.mf.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mf
 * @create 2021-04-04-17:31
 */
public class MyTest {
    //获取ApplicationContext 拿到Spring容器
    @Test
    public void testgetUser(){
          ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//          容器在手，天下我有，需要什么就get
        UserServiceImpl userServiceImpl =(UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();

    }
}
