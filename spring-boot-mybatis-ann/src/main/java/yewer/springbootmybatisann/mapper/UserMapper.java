package yewer.springbootmybatisann.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import yewer.springbootmybatisann.model.User;

public interface UserMapper {
    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user (id, user_name, ",
        "pass_word, user_sex, ",
        "nick_name)",
        "values (#{id,jdbcType=BIGINT}, #{userName,jdbcType=VARCHAR}, ",
        "#{passWord,jdbcType=VARCHAR}, #{userSex,jdbcType=VARCHAR}, ",
        "#{nickName,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @Select({
        "select",
        "id, user_name, pass_word, user_sex, nick_name",
        "from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="pass_word", property="passWord", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_sex", property="userSex", jdbcType=JdbcType.VARCHAR),
        @Result(column="nick_name", property="nickName", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "pass_word = #{passWord,jdbcType=VARCHAR},",
          "user_sex = #{userSex,jdbcType=VARCHAR},",
          "nick_name = #{nickName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);
}