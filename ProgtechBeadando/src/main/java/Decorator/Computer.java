package Decorator;

/**
 *
 * @author Bálint
 */
public class Computer extends ComputerDecorator{
    
    private ComputerCase pcCase;

    @Override
    public String Build() {
        return "PC parts: " + this.pcCase; 
    }
    
    public Computer(ComputerCase pcCase){
        this.pcCase = pcCase;
    }
    
    public Computer() {
    }
       
}
