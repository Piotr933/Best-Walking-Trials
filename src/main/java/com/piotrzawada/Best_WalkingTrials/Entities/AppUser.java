package com.piotrzawada.Best_WalkingTrials.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AppUser {
    @Id
    @GeneratedValue
    Long id;
    String username;
    String password;
    String authority;

}
