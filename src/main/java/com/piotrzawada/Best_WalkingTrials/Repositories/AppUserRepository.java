package com.piotrzawada.Best_WalkingTrials.Repositories;

import com.piotrzawada.Best_WalkingTrials.Entities.AppUser;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {
    Optional<AppUser> findAppUserByUsername(String username);
}
