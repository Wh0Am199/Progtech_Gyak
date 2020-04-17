
import java.util.ArrayList;

public class ShoppingBasket { 
    
    ArrayList<Computer> computers = new ArrayList<Computer>();
    
    private static ShoppingBasket uniqueInstance=null;
    
    private ShoppingBasket() { }
    
    public static ShoppingBasket getInstance()
    {
    if (uniqueInstance==null) 
    {
    uniqueInstance = new ShoppingBasket(); 
    }

    return uniqueInstance;
    }
}
