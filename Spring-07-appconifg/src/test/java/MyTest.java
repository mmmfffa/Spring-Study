import com.mf.config.MyConfig;
import com.mf.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.applet.AppletContext;

/**
 * @author mf
 * @create 2021-04-05-17:14
 */
public class MyTest {
    @Test
    public void testConfig(){
        //如果完全使用了配置文件方式去做，就只能通过AnnotationConfigApplicationContext上下文获取容器，通过配置类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.toString());

    }
}
