public class CalculateService {
    public int calculate(int fuelAmount, double fuelRate, int distanceUnit) {
        return (int) (fuelAmount * distanceUnit / fuelRate);
    }
}
