package designpattern.creational.factory;

public class TravelInsurance implements Insurance{
    @Override
    public void getPremium() {
        System.out.println("Travel Premium ");
    }

    @Override
    public void buyPlan() {
        System.out.println("Travel Buy plan ");
    }
}
