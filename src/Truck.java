public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of axles: " + axles);
        System.out.println("Has trailer? " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (hasTrailer) {
            String x = getLicensePlate().substring(getLicensePlate().length() - 2);
            if ((axles > 4 && x.equals("MX")) || x.equals("LX")) {
                return true;
            }
            return false;
        }
        return true;
    }
    @Override
    public double calculateTollPrice() {
        double c = getTollFee()*axles;
        if (hasTrailer) {
            c*=2;
        }
        return c;
    }
}
