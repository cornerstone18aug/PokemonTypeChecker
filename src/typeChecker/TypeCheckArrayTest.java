package typeChecker;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TypeCheckArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void weaknesses() {
        TypeCheckArray.weaknesses("1","1");

    }
}