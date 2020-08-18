package com.madzia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    RansomNote ransomNote = new RansomNote();

    @Test
    void shouldReturnTrueIfRansomNoteCanBeConstructedFromTheMagazines() {
        //Given
        String ransom = "some";
        String magazine = "ransomnote";

        //When
        boolean result = ransomNote.canConstruct(ransom, magazine);

        //Then
        assertTrue(result);
    }

    @Test
    void shouldReturnFalseIfRansomNoteCannotBeConstructedFromTheMagazines() {
        //Given
        String ransom = "mom";
        String magazine = "ransomnote";

        //When
        boolean result = ransomNote.canConstruct(ransom, magazine);

        //Then
        assertFalse(result);
    }

}