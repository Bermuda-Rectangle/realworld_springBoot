package GDSC.realWorld.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String image = "https://realworld-temp-api.herokuapp.com/images/smiley-cyrus.jpeg";
    private String bio;
    @Column(nullable = false)
    private boolean demo = false;


}