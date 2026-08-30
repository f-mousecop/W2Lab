import org.charles.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TriangleTest {
    @Test
    void validTriangle() {
        assertTrue(Triangle.isTriangle(1, 2, 2));
    }
}
