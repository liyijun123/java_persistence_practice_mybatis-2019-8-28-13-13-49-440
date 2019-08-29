package tws.respository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface EmployeeMapper<employee> {

	@Select("select id,name ,age from employee")
	public List<employee> selectAll();
}
