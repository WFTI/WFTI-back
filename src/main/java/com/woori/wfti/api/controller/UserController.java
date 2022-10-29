package com.woori.wfti.api.controller;

import com.woori.wfti.api.service.ChatService;
import com.woori.wfti.api.service.UserService;
import com.woori.wfti.db.entity.UserEntity;
import com.woori.wfti.db.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController             // Json 형태 결과값을 반환 @ResponseBody 버전 업
@RequiredArgsConstructor    // final 객체를 Constructor 주입 해줌 (Autowired 역할)
@RequestMapping("/v1/user")      // version 1 API
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 모든 회원조회
     * @return
     * @throws
     */
    @GetMapping("selectAll")
    public List<UserEntity> findAllUser() {

        return userService.getUsers();
    }

    /**
     * 새로운 회원 등록
     * @return
     * @throws
     */
    @PostMapping("createUser")
    public UserEntity createUser() {
        final UserEntity user = UserEntity.builder()
                .userEmpNo("20201473")
                .userNm("최지웅")
                .build();
        return userService.createUser(user);
    }
}
