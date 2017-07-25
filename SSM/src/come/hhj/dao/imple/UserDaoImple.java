package come.hhj.dao.imple;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import come.hhj.dao.mapper.UserMapper;
import come.hhj.entity.User;

public class UserDaoImple implements UserMapper{
	private SqlSessionTemplate sqlSession;
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public User selectUserById(int id) {
		
		// TODO Auto-generated method stub
		return sqlSession.selectOne("come.hhj.dao.mapper.UserMapper.selectUserById",id);
	
	}
	@Override
	public void insertUser(User user) {
		sqlSession.insert("come.hhj.dao.mapper.UserMapper.insertUser",user);
	}
	public void deleteUseId(int id) {
		sqlSession.delete("come.hhj.dao.mapper.UserMapper.deleteUseId", id);
	}
	
	
}
