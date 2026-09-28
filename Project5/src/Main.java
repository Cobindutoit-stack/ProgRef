//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    WeightLossModel model = new WeightLossModel();
    model.CustomerName = "LUXIE";
    model.WeightLoss = 15;
        PrintWeightLoss PrintWeightLoss =new PrintWeightLoss(model);
          PrintWeightLoss.print();



}

