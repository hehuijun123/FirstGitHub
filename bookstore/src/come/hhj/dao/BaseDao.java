package come.hhj.dao;

import java.util.List;

public interface BaseDao<T> {
	
	T select(Object object) throws Exception;
	
	List<T> selectList(Object ...objects )throws Exception;
	
	void insert(Object object);
	
	void delete(Object object );

	<V> V getSingleVal(Object object);
	
	void batch( Object[]... params);
}
