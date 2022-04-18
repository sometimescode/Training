public class Ford extends Car {
    private String carSound;

    public Ford(String carSound, double gasConsumption, String name, String model, String brand, int year, String location, double gas) {
        super(gasConsumption, name, model, brand, year, location, gas);
        this.carSound = carSound;
    }

    public String getCarSound() {
        return carSound;
    }

    public void setCarSound(String carSound) {
        this.carSound = carSound;
    }
}
