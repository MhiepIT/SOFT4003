package analyzer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // ================================
    // TESTS FOR countExcellentStudents
    // ================================

    // EP: Mixed valid & invalid values
    @Test
    public void testCountExcellentStudents_MixedValues() {
        assertEquals(
                2,
                analyzer.countExcellentStudents(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                )
        );
    }

    // EP: Empty list
    @Test
    public void testCountExcellentStudents_EmptyList() {
        assertEquals(
                0,
                analyzer.countExcellentStudents(Collections.emptyList())
        );
    }

    // EP: Null list
    @Test
    public void testCountExcellentStudents_NullList() {
        assertEquals(
                0,
                analyzer.countExcellentStudents(null)
        );
    }

    // BVA: Boundary values (8.0 and 10.0)
    @Test
    public void testCountExcellentStudents_BoundaryValues() {
        assertEquals(
                2,
                analyzer.countExcellentStudents(
                        Arrays.asList(8.0, 10.0, 7.99)
                )
        );
    }

    // EP: All invalid values
    @Test
    public void testCountExcellentStudents_AllInvalid() {
        assertEquals(
                0,
                analyzer.countExcellentStudents(
                        Arrays.asList(-2.0, 11.5, 20.0)
                )
        );
    }

    // ================================
    // TESTS FOR calculateValidAverage
    // ================================

    // EP: Mixed valid & invalid values
    @Test
    public void testCalculateValidAverage_MixedValues() {
        assertEquals(
                8.17,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)
                ),
                0.01
        );
    }

    // EP: All valid values
    @Test
    public void testCalculateValidAverage_AllValid() {
        assertEquals(
                8.5,
                analyzer.calculateValidAverage(
                        Arrays.asList(8.0, 9.0)
                ),
                0.001
        );
    }

    // EP: All invalid values
    @Test
    public void testCalculateValidAverage_AllInvalid() {
        assertEquals(
                0,
                analyzer.calculateValidAverage(
                        Arrays.asList(-5.0, 12.0, 20.0)
                )
        );
    }

    // EP: Empty list
    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(
                0,
                analyzer.calculateValidAverage(Collections.emptyList())
        );
    }

    // EP: Null list
    @Test
    public void testCalculateValidAverage_NullList() {
        assertEquals(
                0,
                analyzer.calculateValidAverage(null)
        );
    }

    // BVA: Boundary values (0 and 10)
    @Test
    public void testCalculateValidAverage_BoundaryValues() {
        assertEquals(
                5.0,
                analyzer.calculateValidAverage(
                        Arrays.asList(0.0, 10.0)
                ),
                0.001
        );
    }
}
