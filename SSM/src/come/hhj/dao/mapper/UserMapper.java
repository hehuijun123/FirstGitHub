package come.hhj.dao.mapper;

import come.hhj.entity.User;

public interface UserMapper {
	public User selectUserById(int id);
	
	public void insertUser(User user);
	
	public void deleteUseId(int id);
}
