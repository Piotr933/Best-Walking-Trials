package com.piotrzawada.Best_WalkingTrials.Entities;

import com.piotrzawada.Best_WalkingTrials.Enums.DifficultyRating;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class WalkTrial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int length;
    private String country;
    private DifficultyRating difficultyRating;

    public WalkTrial(String name, int length, String country, DifficultyRating difficultyRating) {
        this.name = name;
        this.length = length;
        this.country = country;
        this.difficultyRating = difficultyRating;
    }
}
