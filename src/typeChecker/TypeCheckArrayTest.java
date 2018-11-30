package typeChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleUnaryOperator;

import static org.junit.jupiter.api.Assertions.*;

class TypeCheckArrayTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void weaknesses() {
        Map<String, Double> weakness = TypeCheckArray.weaknesses("1", "1");
        assertEquals(18, weakness.size());
        }
}