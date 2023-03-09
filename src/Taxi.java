public class Taxi extends Car {
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super (licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Total fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += numRiders * farePerRider;
        if (!isDiscountApplied() && getPassengers() >= 4) {
            setTollFee(getTollFee() * .5);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        int oldP = getPassengers()-1;
        if (dropOffPassengers(getPassengers()-1)) {
            fareCollected += (farePerRider * (oldP));
            return true;
        }
        return false;
    }
    @Override
    public void type() {
        System.out.println("is taxi");
    }
}

