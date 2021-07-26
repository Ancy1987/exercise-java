package designpattern.creational.factory;

public class HealthInsurance implements Insurance{
    @Override
    public void getPremium() {
        System.out.println("Health Premium ");
    }

    @Override
    public void buyPlan() {
        System.out.println("Health Buy plan ");
    }
}
