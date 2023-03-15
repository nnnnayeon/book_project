package com.example.book_project.domain;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UserRequestDto {
    private int user_no;

    private String user_id, user_pw, name, mobile;

    // join
    public UserRequestDto(String user_id, String user_pw, String name, String mobile){
        this.user_id = user_id;
        this.user_pw = user_pw;
        this.name = name;
        this.mobile = mobile;
    }

    // login
    public UserRequestDto(String user_id, String user_pw){
        this.user_id = user_id;
        this.user_pw = user_pw;
    }


}
