package designpattern.creational.abstractfactory;

public class TruckFactory extends  Factory{

    Engine getEngine() {
        return new TruckEngine();
    }

    @Override
    Tyre getTyre() {

        return new TruckTyre();
    }

}
