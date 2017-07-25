package come.hhj.service.imple;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import come.hhj.entity.User;
import come.hhj.service.UserService;

public class UserServiceImple extends SqlSessionDaoSupport implements UserService{
	
	public User findUser(int id){
		
		User user=this.getSqlSession().selectOne("come.hhj.dao.mapper.UserMapper.selectUserById", id);
		
		return user;
	}
	

}
