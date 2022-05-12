package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        Millenials millenials = new Millenials("Jan");
        YGeneration yGeneration = new YGeneration("Kamil");
        ZGeneration zGeneration = new ZGeneration("Andrzej");

        //When
        String millenialsSharePostStrategy = millenials.sharePost();
        String yGenerationSharePostStrategy = yGeneration.sharePost();
        String zGenerationSharePostStrategy = zGeneration.sharePost();

        //Then
        assertEquals("Is using Snapchat.", millenialsSharePostStrategy);
        assertEquals("Is using Twitter.",yGenerationSharePostStrategy);
        assertEquals("Is using Facebook.",zGenerationSharePostStrategy);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        Millenials millenials = new Millenials("Tomek");
        millenials.setSocialPublisher(new TwitterPublisher());

        //When
        String millenialsChanged = millenials.sharePost();

        //Then
        assertEquals("Is using Twitter.", millenialsChanged);
    }
}
