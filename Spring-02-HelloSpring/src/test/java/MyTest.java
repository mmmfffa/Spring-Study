import com.mf.pojo.Hello;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mf
 * @create 2021-04-04-20:07
 */
public class MyTest {
    @Test
    public void test(){
//        解析beans.xml文件,生成管理相应的Bean对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        getbean:参数即为Spring配置文件中bean的id
        Hello hello = (Hello) context.getBean("hello");
        String s = hello.toString();
        System.out.println(s);

    }
}
