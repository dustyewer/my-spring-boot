package yewer.springbootmybatisxmljava.mapper;

//import org.apache.ibatis.annotations.Mapper;

import yewer.springbootmybatisxmljava.model.User;
//@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}