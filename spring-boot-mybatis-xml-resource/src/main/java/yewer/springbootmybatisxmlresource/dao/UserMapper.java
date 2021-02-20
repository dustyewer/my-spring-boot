package yewer.springbootmybatisxmlresource.dao;

import java.util.List;

//import org.apache.ibatis.annotations.Mapper;

import yewer.springbootmybatisxmlresource.model.User;

//@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    User selectByName(String name);
    
    User selectByNameAndSex(User user);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();
}