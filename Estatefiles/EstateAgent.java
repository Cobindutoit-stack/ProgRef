public abstract class EstateAgent implements iEstateAgent
{
    private String agentName;
    private double propertyPrice;

    public EstateAgent(String agentName, double propertyPrice)
    {
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
    }

    public String getAgentName()
    {
        return agentName;
    }

    public double getPropertyPrice()
    {
        return propertyPrice;
    }

    public double getAgentCommission()
    {
        return propertyPrice * 0.20;
    }
}
