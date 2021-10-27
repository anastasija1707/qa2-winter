package homework;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class MyHomeWork {

    public double calculateLitresByDistance(double consumptionPer100Km, double distanceKm) {

//        10L=100km
//        5L=50km
//        1L=10km
//        0.1L=1km
//        skolkoLitrovNamNuzno=rashod(na1km)*distanciju
//        L=R*D
//        fuelConsumption=5Lna100km
//        R=fuelConsumption/100
        double consumptionPerOneKm = consumptionPer100Km / 100;

        return consumptionPerOneKm * distanceKm;

    }

    @Test
    public void test() {

        double x = calculateLitresByDistance(7.00, 50.00);

        System.out.println(x);

    }
}
