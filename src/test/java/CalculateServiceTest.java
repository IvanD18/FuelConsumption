import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateServiceTest {

    @Test
    void shouldCalculatePossiblyDistance() {
        CalculateService service = new CalculateService();
        int fuelAmount = 30;
        int fuelRate = 7;
        int distanceUnit = 100;
        int result = service.calculate(fuelAmount, fuelRate, distanceUnit);
        assertEquals(428, result);
    }
}