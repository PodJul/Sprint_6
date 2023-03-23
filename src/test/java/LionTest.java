import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
@Mock
Feline feline;

     @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion(new Feline());
        List<String> actual = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), actual);

    }
}




