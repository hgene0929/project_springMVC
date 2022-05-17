package hello.springmvc.basic.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //컨트롤러 내부 메서드의 반환값을 문자열 그대로 반환
@RequestMapping("/mapping/users") //해당 컨트롤러 내부의 메서드들의 공통 URI
public class MappingClassController {

    /**
     * GET | URI = /mapping/users | 기능 = 회원조회(전체)
     */
    @GetMapping
    public String users() {
        return "get users";
    }

    /**
     * POST | URI = /mapping/users | 기능 = 회원등록
     */
    @PostMapping
    public String addUser() {
        return "post user";
    }

    /**
     * GET | URI = /mapping/users/{userId} | 기능 = 회원조회(1명)
     */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId = " + userId;
    }

    /**
     * PATCH | URI = /mapping/users/{userId} | 기능 = 회원정보수정
     */
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId = "+userId;
    }

    /**
     * DELETE | URI = /mapping/users/{userId} | 기능 = 회원삭제
     */
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId = "+userId;
    }
}
