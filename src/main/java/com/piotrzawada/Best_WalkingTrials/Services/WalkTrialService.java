package com.piotrzawada.Best_WalkingTrials.Services;

import com.piotrzawada.Best_WalkingTrials.Entities.WalkTrial;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class WalkTrialService {

    private final HashMap<Integer, WalkTrial> walkTrialHashMap = new HashMap<>();

    public WalkTrial save(int id, WalkTrial walkTrial) {
        return walkTrialHashMap.put(id, walkTrial);
    }

    public HashMap<Integer, WalkTrial> getAll() {
        return walkTrialHashMap;
    }

    public Integer getId(String name) {
        for (Integer i : walkTrialHashMap.keySet()) {
            if (walkTrialHashMap.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    public WalkTrial getByName(String name) {
        for (Integer i: walkTrialHashMap.keySet()) {
            if (walkTrialHashMap.get(i).getName().equals(name)) {
                return  walkTrialHashMap.get(i);
            }
        }
        return null;
    }
    public void deleteById(int id){
        walkTrialHashMap.remove(id);
    }
}
