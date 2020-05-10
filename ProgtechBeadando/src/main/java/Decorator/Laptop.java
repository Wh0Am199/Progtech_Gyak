package Decorator;

import ComputerParts.CPU.CPU;
import ComputerParts.GPU.GPU;
import ComputerParts.Motherboard.DesktopMotherboard;
import ComputerParts.Motherboard.LaptopMotherboard;
import ComputerParts.PSU.PSU;
import ComputerParts.RAM.RAM;
import ComputerParts.Screen.Screen;
import Exceptions.InvalidCaseException;
import Exceptions.InvalidMotherboardException;
import Exceptions.InvalidPSUException;

/**
 *
 * @author Bárdos Bálint
 */
public class Laptop extends Computer {
    
    private CPU cpu;
    private GPU gpu;
    private LaptopMotherboard motherboard;
    private PSU psu;
    private RAM ram;
    private Screen screen;  
    private ComputerCase pcCase;
    
    public Computer desktop = new Computer();
    
    public Laptop(CPU cpu, GPU gpu, LaptopMotherboard motherboard, PSU psu, RAM ram, Screen screen, ComputerCase pcCase) throws InvalidPSUException, InvalidMotherboardException, InvalidCaseException {
        super(pcCase);
        this.cpu = cpu;
        this.gpu = gpu;
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
        if (this.pcCase.Laptop != pcCase) {
            throw new InvalidCaseException("For laptops only the Laptop case is compatible and none of the others!");
        }
        
    }
    
    @Override
    public String Build() {
        return "PC parts: CPU - " + this.cpu.getCores() + " GPU - " + this.gpu.getGpuType() + " Motherboard - " + this.motherboard.getMotherBoardType() + " PSU - " + this.psu.getPower() + " RAM - " + this.ram.getSize() + " GB " + " Screen - " + this.screen.getResolution() + " Computer Case - " + this.pcCase;
    }
    
}
