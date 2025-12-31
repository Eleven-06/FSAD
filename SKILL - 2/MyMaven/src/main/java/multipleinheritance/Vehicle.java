package multipleinheritance;

public class Vehicle {

    void show() {
        System.out.println("This is a vehicle");
    }

    static class Car extends Vehicle {
        void show() {
            System.out.println("This is a car");
        }
    }

    static class Ev extends Vehicle {
        void show() {
            System.out.println("This is an XEV 9E - EV VEHICLE");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle w = new Car();
        Vehicle x = new Ev();

        v.show();
        w.show();
        x.show();
    }
}