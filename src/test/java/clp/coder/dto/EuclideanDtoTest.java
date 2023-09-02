package clp.coder.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EuclideanDtoTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link EuclideanDto}
     *   <li>{@link EuclideanDto#setX1(Double)}
     *   <li>{@link EuclideanDto#setX2(Double)}
     *   <li>{@link EuclideanDto#setY1(Double)}
     *   <li>{@link EuclideanDto#setY2(Double)}
     *   <li>{@link EuclideanDto#setZ1(Double)}
     *   <li>{@link EuclideanDto#setZ2(Double)}
     *   <li>{@link EuclideanDto#getX1()}
     *   <li>{@link EuclideanDto#getX2()}
     *   <li>{@link EuclideanDto#getY1()}
     *   <li>{@link EuclideanDto#getY2()}
     *   <li>{@link EuclideanDto#getZ1()}
     *   <li>{@link EuclideanDto#getZ2()}
     * </ul>
     */
    @Test
    void testConstructor() {
        EuclideanDto actualEuclideanDto = new EuclideanDto();
        actualEuclideanDto.setX1(1.0d);
        actualEuclideanDto.setX2(10.0d);
        actualEuclideanDto.setY1(3.0d);
        actualEuclideanDto.setY2(10.0d);
        actualEuclideanDto.setZ1(10.0d);
        actualEuclideanDto.setZ2(10.0d);
        assertEquals(1.0d, actualEuclideanDto.getX1().doubleValue());
        assertEquals(10.0d, actualEuclideanDto.getX2().doubleValue());
        assertEquals(3.0d, actualEuclideanDto.getY1().doubleValue());
        assertEquals(10.0d, actualEuclideanDto.getY2().doubleValue());
        assertEquals(10.0d, actualEuclideanDto.getZ1().doubleValue());
        assertEquals(10.0d, actualEuclideanDto.getZ2().doubleValue());
    }
}

