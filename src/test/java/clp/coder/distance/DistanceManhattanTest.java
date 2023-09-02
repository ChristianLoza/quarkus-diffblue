package clp.coder.distance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
@QuarkusTest
class DistanceManhattanTest {
    /**
     * Method under test: {@link DistanceManhattan#calculateDistance(List, List)}
     */
    @Test
    void testCalculateDistance() {
        DistanceManhattan distanceManhattan = new DistanceManhattan();
        ArrayList<Integer> pointArray = new ArrayList<>();
        assertEquals(0.0d, distanceManhattan.calculateDistance(pointArray, new ArrayList<>()).doubleValue());
    }

    /**
     * Method under test: {@link DistanceManhattan#calculateDistance(List, List)}
     */
    @Test
    void testCalculateDistance2() {
        DistanceManhattan distanceManhattan = new DistanceManhattan();

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);
        integerList.add(1);

        ArrayList<Integer> integerList1 = new ArrayList<>();
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        integerList1.add(1);
        assertEquals(0.0d, distanceManhattan.calculateDistance(integerList, integerList1).doubleValue());
    }

    /**
     * Method under test: {@link DistanceManhattan#calculateDistance(List, List)}
     */
    @Test
    void testCalculateDistance3() {
        DistanceManhattan distanceManhattan = new DistanceManhattan();

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        assertThrows(IllegalArgumentException.class,
                () -> distanceManhattan.calculateDistance(integerList, new ArrayList<>()));
    }
}

