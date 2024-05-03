package com.piotrzawada.Best_WalkingTrials.Repositories;

import com.piotrzawada.Best_WalkingTrials.Entities.WalkTrial;
import org.springframework.data.repository.CrudRepository;

public interface WalkTrialRepo extends CrudRepository<WalkTrial, Long> {
    WalkTrial findByName(String name);
}
