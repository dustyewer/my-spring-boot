package yewer.springbootmybatisplusmulidatasource.model;

import lombok.Data;

@Data
public class User {
    private Long id;

    private String userName;

    private String passWord;

    private String userSex;

    private String nickName;

}