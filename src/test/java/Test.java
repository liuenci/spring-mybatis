import com.cier.pojo.Emp;
import com.cier.service.EmpService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void init(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmpService empService = applicationContext.getBean("empService",EmpService.class);
        List<Emp> emps = empService.selectAllEmp();
        for (Emp emp:emps){
            System.out.println(emp);
        }
    }
}
