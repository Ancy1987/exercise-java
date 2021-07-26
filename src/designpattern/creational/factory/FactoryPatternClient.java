package designpattern.creational.factory;

public class FactoryPatternClient {

    public static void main(String[] args) {
        InsuranceFactory insuranceFactory =new InsuranceFactory();
        Insurance motor = insuranceFactory.getInsuranceFactory("motor");
        Insurance health = insuranceFactory.getInsuranceFactory("health");
        Insurance travel = insuranceFactory.getInsuranceFactory("travel");
        motor.getPremium();
        health.buyPlan();
        travel.getPremium();
    }
}

class InsuranceFactory {

    Insurance getInsuranceFactory(String type){
        switch(type){
            case "motor":
                return new MotorInsurance();
            case "health":
                return new HealthInsurance();
            case "travel":
                return new TravelInsurance();
        }
        return null;
    }
}