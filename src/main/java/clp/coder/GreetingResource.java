package clp.coder;

import java.util.Objects;

import clp.coder.distance.DistanceEuclidean;
import clp.coder.distance.DistanceManhattan;
import clp.coder.distance.DistanceMinkowski;
import clp.coder.dto.EuclideanDto;
import clp.coder.dto.ListCalculator;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/distance")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GreetingResource {
    @Inject
    DistanceManhattan manhattanCalculator;

    @Inject
    DistanceMinkowski minkowskiCalculator;

    @Inject
    DistanceEuclidean euclideanCalculator;

    @POST
    @Path("manhattan")
    public Double calculateManhattanDistance(ListCalculator listCalculator) {
        if(Objects.nonNull(listCalculator.getD1()) && Objects.nonNull(listCalculator.getD2())) {
            return manhattanCalculator.calculateDistance(listCalculator.getD1(),listCalculator.getD2());
        }
        return 0.0;
    }

    @POST
    @Path("minkowski")
    public Response calculateMinkowskiDistance(ListCalculator listCalculator) {
        if(Objects.nonNull(listCalculator.getD1()) && Objects.nonNull(listCalculator.getD2())) {
            return Response.ok(minkowskiCalculator.calculateDistance(listCalculator.getD1(),listCalculator.getD2(), listCalculator.getValue())).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();

    }

    @POST
    @Path("euclidean")
    public Response calculateEuclideanDistance(EuclideanDto euclideanDto) {
        return Response.ok(euclideanCalculator.calculateEuclideanDisntance(euclideanDto)).build();
    }


}
