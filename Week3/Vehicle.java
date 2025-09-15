package week_3;

public class Vehicle {
    private int wheelCount;
    private String vehicleCompany;
    private String vehicleModel;
    private boolean isWorking;

    public Vehicle(String vehicleCompany, String vehicleModel, int wheelCount) {
        this.vehicleCompany = vehicleCompany;
        this.vehicleModel = vehicleModel;
        this.wheelCount = wheelCount;
        isWorking = true;
    }

    public String information() {
        return vehicleCompany + " " + vehicleModel;
    }
}