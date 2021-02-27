package yewer.springbootmybatisann.mapper;

import org.apache.ibatis.jdbc.SQL;
import yewer.springbootmybatisann.model.User;

public class UserSqlProvider {

    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getUserName() != null) {
            sql.VALUES("user_name", "#{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getPassWord() != null) {
            sql.VALUES("pass_word", "#{passWord,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.VALUES("user_sex", "#{userSex,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.VALUES("nick_name", "#{nickName,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("user");
        
        if (record.getUserName() != null) {
            sql.SET("user_name = #{userName,jdbcType=VARCHAR}");
        }
        
        if (record.getPassWord() != null) {
            sql.SET("pass_word = #{passWord,jdbcType=VARCHAR}");
        }
        
        if (record.getUserSex() != null) {
            sql.SET("user_sex = #{userSex,jdbcType=VARCHAR}");
        }
        
        if (record.getNickName() != null) {
            sql.SET("nick_name = #{nickName,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}