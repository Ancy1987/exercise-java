package designpattern.creational.abstractfactory;

import designpattern.creational.factory.HealthInsurance;
import designpattern.creational.factory.Insurance;
import designpattern.creational.factory.MotorInsurance;
import designpattern.creational.factory.TravelInsurance;

public class AbstractFactoryClient {
    public static void main(String[] args) {
Factory factory =  Factory.getFactory("car");
        factory.getEngine().design();
        factory.getEngine().manufacture();
        factory.getEngine().test();
        factory.getTyre().design();
        factory.getTyre().manufacture();
         factory =  Factory.getFactory("truck");
        factory.getEngine().design();
        factory.getEngine().manufacture();
        factory.getEngine().test();
        factory.getTyre().design();
        factory.getTyre().manufacture();
    }
}
