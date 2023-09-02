package clp.coder.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListCalculatorTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link ListCalculator}
     *   <li>{@link ListCalculator#setD1(List)}
     *   <li>{@link ListCalculator#setD2(List)}
     *   <li>{@link ListCalculator#setValue(Double)}
     *   <li>{@link ListCalculator#getD1()}
     *   <li>{@link ListCalculator#getD2()}
     *   <li>{@link ListCalculator#getValue()}
     * </ul>
     */
    @Test
    void testConstructor() {
        ListCalculator actualListCalculator = new ListCalculator();
        ArrayList<Integer> integerList = new ArrayList<>();
        actualListCalculator.setD1(integerList);
        ArrayList<Integer> integerList1 = new ArrayList<>();
        actualListCalculator.setD2(integerList1);
        actualListCalculator.setValue(10.0d);
        List<Integer> d1 = actualListCalculator.getD1();
        assertSame(integerList, d1);
        assertEquals(integerList1, d1);
        List<Integer> d2 = actualListCalculator.getD2();
        assertSame(integerList1, d2);
        assertEquals(d1, d2);
        assertEquals(10.0d, actualListCalculator.getValue().doubleValue());
    }
}

