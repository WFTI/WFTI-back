package com.woori.wfti.api.controller;

import com.woori.wfti.api.service.UserService;
import com.woori.wfti.db.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @GetMapping("selectUsers")
    public List<UserEntity> findAllUser() {

        return userService.getUsers();
    }

    /**
     * 새로운 회원 등록
     * @return 생성된 새로운 회원 정보
     * @throws
     */
    @PostMapping("createUser")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity requestUser) {
        final UserEntity responseUser = UserEntity.builder()
                .userEmpNo(requestUser.getUserEmpNo()) // 사번
                .userNm(requestUser.getUserNm()) // 이름
                .userPw(requestUser.getUserPw()) // 비밀번호
                .lstSginDh(requestUser.getLstSginDh()) // 마지막 로그인 일시
                .LginYn(requestUser.getLginYn()) // 로그인 여부
                .build();
        return new ResponseEntity<>(userService.createUser(responseUser), HttpStatus.OK);
    }
}
