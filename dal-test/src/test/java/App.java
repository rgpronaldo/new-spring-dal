
import javax.annotation.Resource;




import one.rangp.dal.test.service.BaseServices;
import one.rangp.dal.test.service.UserService;
import one.rangp.metadata.dao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring.xml")
public class App 
{
	@Resource
	private BaseServices userService;
	@Test
	public void addUser(){
		User user = new User("张三", "南京");
		user.setUserId(10);
		userService.addEntitys(10,user);
		
	}
}
