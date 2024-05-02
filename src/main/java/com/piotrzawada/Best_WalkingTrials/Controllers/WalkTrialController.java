package com.piotrzawada.Best_WalkingTrials.Controllers;

import com.piotrzawada.Best_WalkingTrials.Entities.WalkTrial;
import com.piotrzawada.Best_WalkingTrials.Services.WalkTrialService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@RestController
@RequestMapping("/api/walking_trials")
@AllArgsConstructor
public class WalkTrialController {

    WalkTrialService walkTrialService;

    @PostMapping("/new")
    public ResponseEntity<?> newWalk(@RequestBody WalkTrial walkTrial) {
        walkTrialService.save(walkTrialService.getAll().size(), walkTrial);

        return new ResponseEntity<>("The walking Trial has been added", HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<?> getAllTrials() {
        return new ResponseEntity<>(walkTrialService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/name")
    public ResponseEntity<?> getByName(@RequestParam String name) {
        return new ResponseEntity<>(walkTrialService.getByName(name), HttpStatus.OK);

    }
    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteWalk(@RequestParam String name) {
        walkTrialService.deleteById(walkTrialService.getId(name));
        return new ResponseEntity<>( "The Walking trial has been deleted", HttpStatus.OK);
    }
}
