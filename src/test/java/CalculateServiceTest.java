import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceTest {

    @Test
    void shouldCalculatePossiblyDistanceWithInt() {
        CalculateService service = new CalculateService();
        int fuelAmount = 30;
        double fuelRate = 7;
        int distanceUnit = 100;
        int result = service.calculate(fuelAmount, fuelRate, distanceUnit);
        assertEquals(428, result);
    }

    @Test
    void shouldCalculatePossiblyDistanceWithDouble() {
        CalculateService service = new CalculateService();
        int fuelAmount = 30;
        double fuelRate = 8.5;
        int distanceUnit = 100;
        int result = service.calculate(fuelAmount, fuelRate, distanceUnit);
        assertEquals(352, result);
    }
}