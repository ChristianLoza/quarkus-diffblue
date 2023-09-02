package clp.coder.distance;

import java.util.Objects;

import clp.coder.dto.EuclideanDto;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class DistanceEuclidean {
	public Double calculateEuclideanDisntance(EuclideanDto euclideanDto) {
		if (Objects.isNull(euclideanDto)) {
			throw new IllegalArgumentException("EuclideanDto can not be null");
		}
		return Math.sqrt(Math.pow(euclideanDto.getX2() - euclideanDto.getX1(), 2)
				+ Math.pow(euclideanDto.getY2() - euclideanDto.getY1(), 2)
				+ Math.pow(euclideanDto.getZ2() - euclideanDto.getZ1(), 2));
	}
}
