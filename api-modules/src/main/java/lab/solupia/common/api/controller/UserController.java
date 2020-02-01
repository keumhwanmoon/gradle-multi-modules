package lab.solupia.common.api.controller;

import lab.solupia.common.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/api/users")
    public List<UserDTO> getUsers() {
        UserDTO user1 = new UserDTO();

//        user1.setUserName("홍길동1");
//        user1.setLoginId("user1");

        UserDTO user2 = new UserDTO();

//        user1.setUserName("홍길동2");
//        user1.setLoginId("user2");

        UserDTO user3 = UserDTO.builder().userName("홍길동3").loginId("user3").build();

        return Arrays.asList(user1, user2);
    }
}
