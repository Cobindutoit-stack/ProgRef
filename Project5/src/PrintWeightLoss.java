public class PrintWeightLoss extends WeightLoss{

    public PrintWeightLoss(WeightLossModel model){
        super(model);
    }
    public void print(){
        System.out.println("****************************************************************************************************************************************");
        System.out.println("CUSTOMER WEIGHTLOSS PRINTOUT");
        System.out.println("****************************************************************************************************************************************");
       System.out.println("CUSTOMER NAME:" + getCustomerName());
        System.out.println("WEIGHT LOSS" + getWeightLoss() + "kg");
        System.out.println("****************************************************************************************************************************************");

    }

}
