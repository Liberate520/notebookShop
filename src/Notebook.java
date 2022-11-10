public class Notebook extends Computer{

    private int batteryCapacity;

    public Notebook(String model, String CPU, int RAM, int SSDVolume, double displaySize){
        super(model, CPU, RAM, SSDVolume, displaySize);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

}
