package Decorator;

import ComputerParts.CPU.CPU;
import ComputerParts.Motherboard.DesktopMotherboard;
import ComputerParts.PSU.PSU;
import ComputerParts.RAM.RAM;
import ComputerParts.Screen.Screen;
import Exceptions.InvalidMotherboardException;
import Exceptions.InvalidPSUException;

/**
 *
 * @author Bárdos Bálint
 */
public class Laptop extends Computer {
    
    private CPU cpu;
    private DesktopMotherboard motherboard;
    private PSU psu;
    private RAM ram;
    private Screen screen;  
    private ComputerCase pcCase;
    
    public Computer desktop = new Computer();
    
    public Laptop(CPU cpu, DesktopMotherboard motherboard, PSU psu, RAM ram, Screen screen, ComputerCase pcCase) throws InvalidPSUException, InvalidMotherboardException {
        super(pcCase);
        this.cpu = cpu;
        this.motherboard = motherboard;
        this.psu = psu;
        this.ram = ram;
        this.screen = screen;
        
        if(this.psu.getPsuType().Laptop_Battery != psu.getPsuType()){
            throw new InvalidPSUException("This psu is not compatible with a laptop! This is a desktop PSU!");
        }
        if (this.motherboard.getMotherBoardType().Laptop != motherboard.getMotherBoardType()) {
            throw new InvalidMotherboardException("This motherboard is not compatible with a laptop! This is a desktop Motherboard!");
        }
        
    }
    
    @Override
    public String Build() {
        return "PC parts: CPU - " + this.cpu.getCores() + " Motherboard - " + this.motherboard.getMotherBoardSize() + " PSU - " + this.psu.getPower() + " RAM - " + this.ram.getSize() + " GB " + " Screen - " + this.screen.getResolution() + " Computer Case - " + this.pcCase;
    }
    
}
