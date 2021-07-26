package designpattern.creational.abstractfactory;

public abstract class Factory {
    abstract Engine getEngine() ;
    abstract Tyre getTyre() ;
    static Factory carFactory = null;
    static Factory truckFactory = null;
    static Factory getFactory(String type){
        switch(type){
            case "car":
                if (carFactory == null)
                    carFactory = new CarFactory();
                return carFactory;
            case "truck":
                if (truckFactory == null)
                    truckFactory = new TruckFactory();
                return truckFactory;
            default:
                    return null;
        }
    }
}
