package ex46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackTest
{

    @Test
    @DisplayName("Test different string variations")
    void count()
    {
        Track myTracker = new Track();

        String sample1 = "mushroom snake badger badger\n";
        String sample2 = "badger badger badger badger\n";
        String sample3 = "mushroom badger mushroom badger mushroom mushroom\n";

        assertEquals(2, myTracker.count(sample1, "badger"));
        assertEquals(4, myTracker.count(sample2, "badger"));
        assertEquals(4, myTracker.count(sample3, "mushroom"));

    }
}