public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;

    public Vehicle(String licensePlate, double tollFee, int passengers) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
    }

    public void type() {
        System.out.println("not taxi");
    }
    public void printInfo() {
        System.out.println("License plate: "+licensePlate);
        System.out.println("Toll fee: "+tollFee);
        System.out.println("Passengers: "+passengers);
    }
    public String getLicensePlate() {
        return licensePlate;
    }

    public double getTollFee() {
        return tollFee;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setTollFee(double newTollFee) {
        tollFee = newTollFee;
    }

    public boolean setPassengers(int newPassengers) {
        if (passengers>0) {
            passengers = newPassengers;
            return true;
        }
        return false;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }
}
