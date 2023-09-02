package clp.coder.distance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import clp.coder.dto.EuclideanDto;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
class DistanceEuclideanTest {
    /**
     * Method under test: {@link DistanceEuclidean#calculateEuclideanDisntance(EuclideanDto)}
     */
    @Test
    void testCalculateEuclideanDisntance() {
        DistanceEuclidean distanceEuclidean = new DistanceEuclidean();

        EuclideanDto euclideanDto = new EuclideanDto();
        euclideanDto.setX1(1.0d);
        euclideanDto.setX2(10.0d);
        euclideanDto.setY1(3.0d);
        euclideanDto.setY2(10.0d);
        euclideanDto.setZ1(10.0d);
        euclideanDto.setZ2(10.0d);
        assertEquals(11.40175425099138d, distanceEuclidean.calculateEuclideanDisntance(euclideanDto).doubleValue());
    }
    @Test
    void testCalculateEuclideanDisntanceException() {
        DistanceEuclidean distanceEuclidean = new DistanceEuclidean();
        assertThrows(IllegalArgumentException.class, () -> {
            distanceEuclidean.calculateEuclideanDisntance(null);
        });
    }
}

