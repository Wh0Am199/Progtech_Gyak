package Decorator;

import ComputerParts.CPU.CPU;
import ComputerParts.Motherboard.Motherboard;
import ComputerParts.RAM.RAM;
import ComputerParts.Screen.Screen;
import ComputerParts.PSU.PSU;

/**
 *
 * @author Bárdos Bálint
 */
public class Desktop extends Computer{

    private PSU psu;
    private Screen screen;
    private DesktopMotherboard motherboard;
    private RAM ram;
    private CPU cpu;
    
    
    
    public Desktop(ComputerCase pcCase) {
        super(pcCase);
    }
    
    @Override
    public String Build() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
