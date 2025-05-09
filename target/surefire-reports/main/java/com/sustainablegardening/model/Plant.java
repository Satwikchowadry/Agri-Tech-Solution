package com.sustainablegardening.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Plant {
    @Id
    private String id;

    private String name;
    private String type;

    private SeasonalGrowth seasonalGrowth;
    private SoilRequirements soilRequirements;
    private FertilizerInfo fertilizerInfo;
    private CompanionPlanting companionPlanting;
    private PestsAndDiseases pestsAndDiseases;

    // Getters and Setters
}
