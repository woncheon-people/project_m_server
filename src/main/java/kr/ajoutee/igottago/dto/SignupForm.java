package kr.ajoutee.igottago.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import kr.ajoutee.igottago.domain.Role;
import kr.ajoutee.igottago.domain.User;
import lombok.Getter;

@Getter
public class SignupForm {
    @NotBlank(message = "이름을 입력해주세요.")
    private String name;
    @NotBlank(message = "이메일 주소를 입력해주세요.")
    @Email(message = "올바른 형식의 이메일 주소를 입력해주세요.")
    private String email;
    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String password;

    public User toEntity(String encPwd) {
        return User.builder()
                .name(name)
                .email(email)
                .password(encPwd)
                .role(Role.USER)
                .build();
    }
}