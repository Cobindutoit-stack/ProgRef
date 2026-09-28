public abstract class WeightLoss implements IWeight {
    public String CustomerName;
    public double WeightLoss;

    public WeightLoss(WeightLossModel model){
        this.CustomerName = model.CustomerName;;
        this.WeightLoss = model.WeightLoss;;

    }
    @Override
    public String getCustomerName(){

        return this.CustomerName;
    }

    @Override
    public double getWeightLoss(){

        return this.WeightLoss;
    }
}
