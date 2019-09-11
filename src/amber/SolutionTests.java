package amber;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTests {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", likes.whoLikesIT());
        assertEquals("Peter likes this", likes.whoLikesIT("Peter"));
        assertEquals("Jacob and Alex like this", likes.whoLikesIT("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", likes.whoLikesIT("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", likes.whoLikesIT("Alex", "Jacob", "Mark", "Max"));
    }
}