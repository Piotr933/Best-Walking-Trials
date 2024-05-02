package com.piotrzawada.Best_WalkingTrials.Entities;

import com.piotrzawada.Best_WalkingTrials.Enums.DifficultyRating;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalkTrial {
    private String name;
    private int length;
    private String country;
    private DifficultyRating difficultyRating;
}
