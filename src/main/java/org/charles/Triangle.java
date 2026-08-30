package org.charles;

public class Triangle {
    /// Determines whether the given side lengths form a valid triangle
    ///
    /// **See** [Triangle Inequality](https://en.wikipedia.org/wiki/Triangle_inequality)
    ///
    /// A triangle is invalid when one side is greater than or equal to
    /// the sum of the other two:
    ///
    /// ```java
    /// boolean hasABadSide = a >= (b + c) || c >= (b + a) || b >= (a + c);
    /// ```
    ///
    /// @param a the length of side `a`
    /// @param b the length of side `b`
    /// @param c the length of side `c`
    /// @return `true` if the sides form a valid triangle, else `false`
    public static boolean isTriangle(int a, int b, int c) {
        boolean hasABadSide = a >= (b + c) || c >= (b + a) || b >= (a + c);
        return !hasABadSide;
    }
}
