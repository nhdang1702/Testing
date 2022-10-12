import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
public class SalaryCsvTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/Data.csv", numLinesToSkip = 1)
    void test(String a, int b, int result) {
        Salary temp = new Salary();
        assertEquals(temp.Salary(a, b), result);
    }
}
