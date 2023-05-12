import com.goit.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator sumCalculator;
    @BeforeEach
    public void beforeEach(){
        sumCalculator=new SumCalculator();
    }
    @Test
    public void testSumOne(){
        //When
        int actual = sumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testSumThree(){
        //When
        int actual = sumCalculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testThrowEx(){
        Assertions.assertThrows(IllegalArgumentException.class,()-> sumCalculator.sum(0));

    }
}
