package likelion_insideout.emotion.api_user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResetPasswordDto {
    @Getter
    private String email;
    private String currentPassword;
    private String newPassword;
}