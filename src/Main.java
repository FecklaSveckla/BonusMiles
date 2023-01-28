public class Main {
    public static void main(String[] args) {
        int airTicket = 2000;
        int bonusThreshold = 20;
        int bonusMiles = 1;

        int accruedMiles = airTicket / bonusThreshold * bonusMiles;
        System.out.println("Начисленные бонусные мили: " + accruedMiles + " миль");

    }
}