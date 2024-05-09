package com.piotrzawada.Best_WalkingTrials.Controllers;

import com.piotrzawada.Best_WalkingTrials.Entities.AppUser;
import com.piotrzawada.Best_WalkingTrials.Repositories.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final AppUserRepository repository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request) {
        AppUser user = new AppUser();
        user.setUsername(request.username());
        user.setPassword(passwordEncoder.encode(request.password()));
        user.setAuthority("ROLE_USER");

        repository.save(user);

        return "New user successfully registered";
    }
    record RegistrationRequest(String username, String password) { }

}
