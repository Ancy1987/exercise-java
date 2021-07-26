package designpattern.creational.abstractfactory;

public class CarTyre implements Tyre{
    @Override
    public void manufacture() {
        System.out.println("car tyre manufacture");
    }

    @Override
    public void design() {
        System.out.println("car tyre design");
    }
}
