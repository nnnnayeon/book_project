package com.example.book_project.service;

import com.example.book_project.domain.UserRepository;
import com.example.book_project.domain.UserRequestDto;
import com.example.book_project.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // id 찾기
    public UserVO readUserId(String user_id) {
        List<UserVO> user = userRepository.findAll();

        for(int i=0; i<user.size(); i++) {
            if(user_id.equals(user.get(i).getUser_id()))
                return user.get(i);
        }
        return null;
    }

    // 회원가입
    public UserVO createUser(UserRequestDto userRequestDto){
        UserVO user = new UserVO(userRequestDto);
        return userRepository.save(user);
    }


}
