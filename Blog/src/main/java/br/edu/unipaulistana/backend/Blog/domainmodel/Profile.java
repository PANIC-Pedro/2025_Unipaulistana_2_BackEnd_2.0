package br.edu.unipaulistana.backend.Blog.domainmodel;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Profile {
    private @Getter @Setter long id ;
    private @Getter @Setter String bio;
    private @Getter @Setter String pictureURL;
    private @Getter @Setter User user;





}
