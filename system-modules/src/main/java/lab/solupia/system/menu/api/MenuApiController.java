package lab.solupia.system.menu.api;

import lab.solupia.system.menu.dto.MenuDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MenuApiController {
    @GetMapping("/api/menu")
    public List<MenuDTO> getList() {
        MenuDTO menu = MenuDTO.builder()
                .menuId("MENU1")
                .menuName("메뉴1")
                .build();

        MenuDTO menu2 = MenuDTO.builder()
                .menuId("MENU2")
                .menuName("메뉴2")
                .build();

        return Arrays.asList(menu, menu2);
    }
}
