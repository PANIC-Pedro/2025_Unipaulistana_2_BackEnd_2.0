package br.edu.unipaulistana.backend.Blog.domainmodel;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private @Getter @Setter long id;
    private @Getter @Setter String name;
    private @Getter @Setter String email;
    private @Getter @Setter String password;
    private @Getter @Setter List<Role> roles;
    private @Getter @Setter String profile;

    public User(long id , String name , String email , String password ,String profile ,String roles) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.roles = new ArrayList<>();
        this.profile = profile;
    }
}
