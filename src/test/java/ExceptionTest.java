import com.example.Feline;
import com.example.Lion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


public class ExceptionTest {
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Feline feline;
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test (expected=Exception.class)
    public void testExpectedException() throws Exception {
        Lion lion = new Lion(feline, "Львёнок");
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        }
}
