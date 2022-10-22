package com.woori.wfti.api.controller;

import com.woori.wfti.db.entity.UserEntity;
import com.woori.wfti.db.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController             // Json 형태 결과값을 반환 @ResponseBody 버전 업
@RequiredArgsConstructor    // final 객체를 Constructor 주입 해줌 (Autowired 역할)
@RequestMapping("/v1")      // version 1 API
public class UserController {
    private final UserRepository userRepository;

    /**
     * 회원 조회
     */
    @GetMapping("user")
    public List<UserEntity> findAllUser() {
        return userRepository.findAll();
    }

    /**
     * 회원 등록 (테스트용)
     *
     */
    @PostMapping("user")
    public UserEntity createUser() {
        final UserEntity user = UserEntity.builder()
                .userEmpNo("20201473")
                .userNm("최지웅")
                .build();
        return userRepository.save(user);
    }
}
