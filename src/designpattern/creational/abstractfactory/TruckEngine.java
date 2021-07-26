package designpattern.creational.abstractfactory;

public class TruckEngine implements Engine{
    @Override
    public void manufacture() {
        System.out.println("truck engine manufacture");
    }

    @Override
    public void design() {
        System.out.println("truck engine design");
    }

    @Override
    public void test() {
        System.out.println("truck engine test");
    }
}
