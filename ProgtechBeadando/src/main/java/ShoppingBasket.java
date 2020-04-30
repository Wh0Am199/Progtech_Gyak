
import Decorator.Computer;
import java.util.ArrayList;

public class ShoppingBasket { 
    
    ArrayList<Computer> computers = new ArrayList<Computer>();
    
    private static ShoppingBasket uniqueInstance=null;
    
    private ShoppingBasket() { }
    
    public void Add(Computer pc){
        computers.add(pc);
    }
    
    public void Delete(Computer pc){
        computers.remove(pc);
    }
    
    
    //Singleton
    public static ShoppingBasket getInstance()
    {
        if (uniqueInstance==null) 
        {
        uniqueInstance = new ShoppingBasket(); 
        }

        return uniqueInstance;
    }
}   
