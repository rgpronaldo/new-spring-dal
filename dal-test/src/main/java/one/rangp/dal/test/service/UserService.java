package one.rangp.dal.test.service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;



import one.dal.support.annotation.DataSource;
import one.rangp.metadata.dao.entity.User;
import one.rangp.metadata.dao.mapper.UserDao;
@Service
public class UserService implements BaseServices{
	
	@Resource
	private UserDao userdao;

	public void addEntitys(@DataSource(field="userId") Integer userId, User t) {
		userdao.addUser(t);
		
	}
	public static void main(String[] args) throws Exception {
		Method m = UserService.class.getMethod("addEntitys", Integer.class,User.class);
		Annotation[][] ass = m.getParameterAnnotations();
		for (int i = 0; i < ass.length; i++) {
			Annotation[] as = ass[i];
			for (int j = 0; j < as.length; j++) {
				DataSource an = (DataSource) as[j];
				System.out.println(an.field());
				
			}
			
		}
		System.out.println(m.getName());
	}


}
