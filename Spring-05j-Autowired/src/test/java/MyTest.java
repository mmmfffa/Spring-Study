import com.mf.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author mf
 * @create 2021-04-05-11:11
 */
public class MyTest {
    @Test
    public void testPerson(){
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
        person.getCat().shout();
        person.getDog().shout();

    }
}
