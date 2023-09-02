package clp.coder.distance;

import java.util.List;

import jakarta.enterprise.context.RequestScoped;
@RequestScoped
public class DistanceManhattan {
	public Double calculateDistance(List<Integer> pointArray, List<Integer> pointArray2) {
		if (pointArray.size() != pointArray2.size()) {
			throw new IllegalArgumentException("pointArray and pointArray2 must have the same size");
		}
		Double distance = 0.00;
		for (int i = 0; i < pointArray.size(); i++) {
            distance += Math.abs(pointArray.get(i) - pointArray2.get(i));
        }
		return distance;
	}

}
