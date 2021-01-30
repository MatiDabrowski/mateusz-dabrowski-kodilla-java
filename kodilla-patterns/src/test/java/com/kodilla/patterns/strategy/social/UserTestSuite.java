package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //given
        User faceUser = new Millenials("Face");
        User twitUser = new YGeneration("Twit");
        User snapUser = new ZGeneration("Snap");

        //when
        String facePublic = faceUser.sharePost();
        System.out.println("Opublikowano: " + facePublic);
        String twitPublic = twitUser.sharePost();
        System.out.println("Opublikowano: " + twitPublic);
        String snapPublic = snapUser.sharePost();
        System.out.println("Opublikowano: " + snapPublic);

        //then
        assertEquals("Facebook", facePublic);
        assertEquals("Twitter", twitPublic);
        assertEquals("Snap", snapPublic);
    }

    @Test
    void testIndividualSharingStrategy(){
        //given
        User faceUser = new Millenials("Face");
        faceUser.setSocialPublisher(new SnapchatPublisher());
        //when
        String facePublic = faceUser.sharePost();
        System.out.println("Opublikowano: " + facePublic);
        //then
        assertEquals("Snap", facePublic);

    }
}
