package com.test.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;
import com.test.domain.Employee;

@Mapper
public interface EmployeeDao {
	
	List<Employee> list(Map<String,Object> map);
	List<Employee> queryByName(Map<String,Object> map);

	int count(Map<String,Object> map);
	
	int save(Employee employee);
	
	int update(Employee employee);
	
	int remove(Integer id);
	
	int batchRemove(List<Integer> ids);
}
