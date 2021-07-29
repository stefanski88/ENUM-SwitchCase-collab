import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Alarm2Test {

    @Test
    @DisplayName("Threat level RED never allows more people")
    public void threatLevelRedNeverOk(){
        // Given

        int numberOfPeople = 0;

        // When
        String actual = Alarm2.getOccupationStatus(ThreatLevel.RED, numberOfPeople);

        // Then
        assertEquals("Zu viele Personen", actual);
    }

    @Test
    @DisplayName("Threat level YELLOW does not allow more than 30")
    public void threatLevelYellowMoreThan30People(){
        // Given

        int numberOfPeople = 31;

        // When
        String actual = Alarm2.getOccupationStatus(ThreatLevel.YELLOW, numberOfPeople);

        // Then
        assertEquals("Zu viele Personen", actual);
    }

    @Test
    @DisplayName("Threat level YELLOW does allow up to 30")
    public void threatLevelYellowAllowsUpTo30(){
        // Given

        int numberOfPeople = 30;

        // When
        String actual = Alarm2.getOccupationStatus(ThreatLevel.YELLOW, numberOfPeople);

        // Then
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }

    @Test
    @DisplayName("Threat level GREEN does not allow more than 30")
    public void threatLevelYGreenwMoreThan60People(){
        // Given

        int numberOfPeople = 61;

        // When
        String actual = Alarm2.getOccupationStatus(ThreatLevel.GREEN, numberOfPeople);

        // Then
        assertEquals("Zu viele Personen", actual);
    }

    @Test
    @DisplayName("Threat level GREEN does allow up to 60")
    public void threatLevelGreenAllowsUpTo60(){
        // Given

        int numberOfPeople = 60;

        // When
        String actual = Alarm2.getOccupationStatus(ThreatLevel.GREEN, numberOfPeople);

        // Then
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }
}