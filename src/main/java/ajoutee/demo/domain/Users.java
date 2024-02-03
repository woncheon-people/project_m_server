package ajoutee.demo.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private String provider;

    @Builder
    public Users( String name,Role role, String email, String password, String provider) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.role = role;
        this.provider = provider;
    }

    public Users update(String name,String provider) {
        this.name = name;
        this.provider = provider;

        return this;
    }

    public String getRoleKey() {
        return this.role.getKey();
    }

}