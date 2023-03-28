import org.junit.Test;
import java.util.List;
import com.example.Feline;
import static org.junit.Assert.*;

public class FelineTest {
    Feline feline = new Feline();
    int kittensCount;

    @Test
    public void eatMeatTest() throws Exception {

        List<String> actual = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);
    }

    @Test
    public void getFamilyTest() {
        String actual = feline.getFamily();
        assertEquals("Кошачьи", actual);
    }

    @Test
    public void getKittensTest() {
        int actual = feline.getKittens();
        assertNotEquals(2, actual);
        ;
    }

    @Test
    public void getNumberOfKittensTest() {
        int actual = feline.getKittens(kittensCount);
        assertEquals(kittensCount, actual);
        ;
    }
}
