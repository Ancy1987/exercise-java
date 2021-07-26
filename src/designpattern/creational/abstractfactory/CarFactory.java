package designpattern.creational.abstractfactory;

public class CarFactory extends  Factory{

    Engine getEngine() {
        return new CarEngine();
    }

    @Override
    Tyre getTyre() {
        return new CarTyre();
    }

}
