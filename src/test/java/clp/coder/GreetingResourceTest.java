package clp.coder;

import clp.coder.dto.EuclideanDto;
import clp.coder.dto.ListCalculator;

import java.util.ArrayList;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

@QuarkusTest
class GreetingResourceTest {

    @Inject
    GreetingResource greetingResource;

    /**
     * Method under test: {@link GreetingResource#calculateManhattanDistance(ListCalculator)}
     */
    @Test
    void testCalculateManhattanDistance() {
        ListCalculator listCalculator = new ListCalculator();
        listCalculator.setD1(new ArrayList<>());
        listCalculator.setD2(new ArrayList<>());
        listCalculator.setValue(10.0d);
        greetingResource.calculateManhattanDistance(listCalculator);
    }

    /**
     * Method under test: {@link GreetingResource#calculateManhattanDistance(ListCalculator)}
     */
    @Test
    void testCalculateManhattanDistance2() {

        ListCalculator listCalculator = new ListCalculator();
        listCalculator.setD1(new ArrayList<>());
        listCalculator.setD2(new ArrayList<>());
        listCalculator.setValue(10.0d);
        greetingResource.calculateManhattanDistance(listCalculator);
    }

    /**
     * Method under test: {@link GreetingResource#calculateMinkowskiDistance(ListCalculator)}
     */
    @Test
    void testCalculateMinkowskiDistance() {
        ListCalculator listCalculator = new ListCalculator();
        listCalculator.setD1(new ArrayList<>());
        listCalculator.setD2(new ArrayList<>());
        listCalculator.setValue(10.0d);
        greetingResource.calculateMinkowskiDistance(listCalculator);
    }

    /**
     * Method under test: {@link GreetingResource#calculateMinkowskiDistance(ListCalculator)}
     */
    @Test
    void testCalculateMinkowskiDistance2() {
        ListCalculator listCalculator = new ListCalculator();
        listCalculator.setD1(new ArrayList<>());
        listCalculator.setD2(new ArrayList<>());
        listCalculator.setValue(10.0d);
        greetingResource.calculateMinkowskiDistance(listCalculator);
    }

    /**
     * Method under test: {@link GreetingResource#calculateEuclideanDistance(EuclideanDto)}
     */
    @Test
    void testCalculateEuclideanDistance() {
        EuclideanDto euclideanDto = new EuclideanDto();
        euclideanDto.setX1(1.0d);
        euclideanDto.setX2(10.0d);
        euclideanDto.setY1(3.0d);
        euclideanDto.setY2(10.0d);
        euclideanDto.setZ1(10.0d);
        euclideanDto.setZ2(10.0d);
        greetingResource.calculateEuclideanDistance(euclideanDto);
    }

    /**
     * Method under test: {@link GreetingResource#calculateEuclideanDistance(EuclideanDto)}
     */
    @Test
    void testCalculateEuclideanDistance2() {
        EuclideanDto euclideanDto = new EuclideanDto();
        euclideanDto.setX1(1.0d);
        euclideanDto.setX2(10.0d);
        euclideanDto.setY1(3.0d);
        euclideanDto.setY2(10.0d);
        euclideanDto.setZ1(10.0d);
        euclideanDto.setZ2(10.0d);
        greetingResource.calculateEuclideanDistance(euclideanDto);
    }
}

