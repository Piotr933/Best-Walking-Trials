package com.piotrzawada.Best_WalkingTrials.Services;

import com.piotrzawada.Best_WalkingTrials.Entities.WalkTrial;
import com.piotrzawada.Best_WalkingTrials.Repositories.WalkTrialRepo;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
@AllArgsConstructor
public class WalkTrialService {

    private final WalkTrialRepo repo;

    private final HashMap<Integer, WalkTrial> walkTrialHashMap = new HashMap<>();

    public WalkTrial save( WalkTrial walkTrial) {
        return repo.save(walkTrial);
    }

    public Iterable<WalkTrial> getAll() {
        return repo.findAll();
    }

    public WalkTrial getByName(String name) {
        return repo.findByName(name);

    }
    public void delete(String name){
        repo.delete(getByName(name));
    }
}
