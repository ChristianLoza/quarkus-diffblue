package clp.coder.distance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
@QuarkusTest
class DistanceMinkowskiTest {
    /**
     * Method under test: {@link DistanceMinkowski#calculateDistance(List, List, Double)}
     */
    @Test
    void testCalculateDistance() {
        DistanceMinkowski distanceMinkowski = new DistanceMinkowski();
        ArrayList<Integer> pointArray = new ArrayList<>();
        assertEquals(0.0d, distanceMinkowski.calculateDistance(pointArray, new ArrayList<>(), 10.0d).doubleValue());
    }

    /**
     * Method under test: {@link DistanceMinkowski#calculateDistance(List, List, Double)}
     */
    @Test
    void testCalculateDistance2() {
        DistanceMinkowski distanceMinkowski = new DistanceMinkowski();

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
        assertEquals(0.0d, distanceMinkowski.calculateDistance(integerList, integerList1, 10.0d).doubleValue());
    }

    /**
     * Method under test: {@link DistanceMinkowski#calculateDistance(List, List, Double)}
     */
    @Test
    void testCalculateDistance3() {
        DistanceMinkowski distanceMinkowski = new DistanceMinkowski();

        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        assertThrows(IllegalArgumentException.class,
                () -> distanceMinkowski.calculateDistance(integerList, new ArrayList<>(), 10.0d));
    }
}

