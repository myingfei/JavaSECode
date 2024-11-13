package com.base8._interface.exer3;

/**
 * @Author myf15609
 * @Date 2023/8/23
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特", "red");
        vehicles[1] = new ElectricVehicle("雅迪", "yellow");
        vehicles[2] = new Car("奔驰", "黑色", "沪A99999");
        for (Vehicle v : vehicles) {
            developer.takingVehicle(v);
            if (v instanceof IPower) {
                ((IPower) v).power();
            }
        }
    }
}
