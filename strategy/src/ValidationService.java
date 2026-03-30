public class ValidationService {

    private ValidationStrategy strategy;

    public ValidationService(ValidationStrategy strategy)
    {
        this.strategy = strategy;
    }


    public void setStrategy(ValidationStrategy strategy)
    {
        this.strategy = strategy;
    }

    public String process()
    {
        return strategy.Validate();
    }


}
