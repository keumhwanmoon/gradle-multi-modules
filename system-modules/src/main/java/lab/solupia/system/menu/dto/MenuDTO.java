package lab.solupia.system.menu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuDTO {
    private String menuId;
    private String menuName;

    @Builder
    public MenuDTO(String menuId, String menuName) {
        this.menuId = menuId;
        this.menuName = menuName;
    }
}
