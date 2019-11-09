public class Main {
    public static void main(String[] args) {
        int fuelAmount = 30;
        int fuelRate = 7;
        int distanceUnit = 100;
        CalculateService service = new CalculateService();
        System.out.println(service.calculate(fuelAmount, fuelRate, distanceUnit));
    }
}
