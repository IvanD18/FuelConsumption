public class Main {
    public static void main(String[] args) {
        int fuelAmount = 30;
        int fuelRate = 7;
        int distanceUnit = 100;
        calculateService service = new calculateService();
        System.out.println(service.calculate(fuelAmount, fuelRate, distanceUnit));
    }
}
