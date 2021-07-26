package designpattern.creational.abstractfactory;

public class CarEngine implements Engine{
    @Override
    public void manufacture() {
        System.out.println("car engine manufacture");
    }

    @Override
    public void design() {
        System.out.println("car engine design");
    }

    @Override
    public void test() {
        System.out.println("car engine test");
    }
}
