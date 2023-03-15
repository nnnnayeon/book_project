package com.example.book_project.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
public class UserVO {

    @Id
    private int user_no;

    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "user_pw", nullable = false)
    private String user_pw;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "mobile", nullable = false)
    private String mobile;

    public UserVO(UserRequestDto userRequestDto){
        this.user_id = userRequestDto.getUser_id();
        this.user_pw = userRequestDto.getUser_pw();
        this.name = userRequestDto.getName();
        this.mobile = userRequestDto.getMobile();
    }


}
