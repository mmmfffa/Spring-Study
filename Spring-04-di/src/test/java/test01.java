import com.mf.pojo.Student;
import com.mf.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mf
 * @create 2021-04-04-22:19
 */
public class test01 {
    @Test
    public void testStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student)context.getBean("student");
        System.out.println(student.toString());
    }
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Userbeans.xml");
        User user2 = (User)context.getBean("user2");
        User user = (User)context.getBean("user2");
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user2 == user);

    }

}
