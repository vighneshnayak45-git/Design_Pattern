public class Singloton {

    private  static Singloton instance ;

    public static Singloton getInstance()
    {
        if (instance == null)
        {
            instance = new Singloton();
        }

        return instance;
    }

}


