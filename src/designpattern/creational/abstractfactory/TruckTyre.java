package designpattern.creational.abstractfactory;

public class TruckTyre implements Tyre{
    @Override
    public void manufacture() {
        System.out.println("truck tyre manufacture");
    }

    @Override
    public void design() {
        System.out.println("truck tyre design");
    }
}
