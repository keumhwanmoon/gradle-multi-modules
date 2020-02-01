package lab.solupia.common.dto;

import lombok.Builder;
import lombok.Data;

@Data
public class UserDTO {

    public UserDTO() {
    }

    private String loginId;
    private String userName;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Builder
    public UserDTO(String loginId, String userName) {
        this.loginId = loginId;
        this.userName = userName;
    }
}
