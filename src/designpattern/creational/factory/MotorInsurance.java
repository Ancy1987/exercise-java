package designpattern.creational.factory;

public class MotorInsurance implements Insurance{
    @Override
    public void getPremium() {
        System.out.println("Motor Premium ");
    }

    @Override
    public void buyPlan() {
        System.out.println("Motor Buy plan ");
    }
}
