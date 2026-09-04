import org.charles.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    /**
     * Equivalence partitioning
     */

    // Triangle is valid when every side is less than the sum of the other two sides
    @Test
    void validTriangle() {
        assertTrue(Triangle.isTriangle(3, 4, 5));
    }

    // Triangle is invalid when one side is greater than the sum of the other two sides
    @Test
    void triangleIsInvalid() {
        assertFalse(Triangle.isTriangle(7, 2, 3));
    }

    // Triangle is invalid with negative side lengths
    @Test
    void negativeSideLengthIsInvalid() {
        assertFalse(Triangle.isTriangle(-1,4,5));
    }

    ///
    /// Invalid triangles for smaller subpartitions
    ///
    /// ```java
    /// a >= b + c
    /// b >= a + c
    /// c >= a + b
    /// ```

    @Test
    void triangleIsInvalidWhenAisTooLarge() {
        assertFalse(Triangle.isTriangle(10, 4, 5));
    }

    @Test
    void triangleIsInvalidWhenBisTooLarge() {
        assertFalse(Triangle.isTriangle(4, 10, 5));
    }

    @Test
    void triangleIsInvalidWhenCisTooLarge() {
        assertFalse(Triangle.isTriangle(4, 5, 10));
    }

    /**
     * Boundary value analysis
     */

    // Boundary 1: On point (right on the boundary)
    @Test
    void sideEqualToSumOfOtherSidesIsInvalid() {
        assertFalse(Triangle.isTriangle(4, 2, 2));
    }

    // Boundary 2: out point (just outside the boundary)
    @Test
    void sideOneAboveSumOfOtherSidesIsInvalid() {
        assertFalse(Triangle.isTriangle(5,2,2));
    }

    // Boundary 3: in point (just inside the valid boundary)
    @Test
    void sideOneBelowSumOfOtherSidesIsValid() {
        assertTrue(Triangle.isTriangle(3,2,2));
    }

    // Boundary 4: side length 0 is invalid
    @Test
    void zeroSideLengthIsInvalid() {
        assertFalse(Triangle.isTriangle(0,2,2));
    }

    // Boundary 5: side length 1 is valid
    @Test
    void sideLengthOfOneIsValid() {
        assertTrue(Triangle.isTriangle(1,2,2));
    }
}
