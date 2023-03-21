import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)

    public class LionTest {
    private final String sex;
    private final boolean expected;

    public LionTest(String sex, boolean expected) {
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
    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(new Feline(), sex);
        int actual = lion.getKittens();
        assertEquals(1, actual);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(new Feline(), sex);
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
        ;
    }
}




