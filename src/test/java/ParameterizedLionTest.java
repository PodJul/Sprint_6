import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class ParameterizedLionTest {

    private final String sex;
    private final boolean expected;

    public ParameterizedLionTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},

        };
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(new Feline(), sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
