public class ValidatorFactory {

    public static Validator getValidator(String type)
    {
        if(type.equalsIgnoreCase("IP"))
        {
            return new IpValidator();
        }else if (type.equalsIgnoreCase("SUBNET")) {
            return new SubnetValidator();
        }
        throw new IllegalArgumentException("Invalid validator type");
    }

}
