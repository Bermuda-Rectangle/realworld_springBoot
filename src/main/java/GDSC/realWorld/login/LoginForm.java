package GDSC.realWorld.login;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginForm {
    
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
