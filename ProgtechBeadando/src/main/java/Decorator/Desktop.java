package Decorator;

import ComputerParts.CPU.CPU;
import ComputerParts.GPU.GPU;
import ComputerParts.Motherboard.DesktopMotherboard;
import ComputerParts.RAM.RAM;
import ComputerParts.Screen.Screen;
import ComputerParts.PSU.PSU;
import Exceptions.InvalidMotherboardException;
import Exceptions.InvalidPSUException;

/**
 *
 * @author Bárdos Bálint
 */
public class Desktop extends Computer{

    private CPU cpu;
    private GPU gpu;
    private DesktopMotherboard motherboard;
    private PSU psu;
    private RAM ram;
    private Screen screen;  
    private ComputerCase pcCase;
    
    public Computer desktop = new Computer();
    
    public Desktop(CPU cpu, GPU gpu, DesktopMotherboard motherboard, PSU psu, RAM ram, Screen screen, ComputerCase pcCase) throws InvalidPSUException, InvalidMotherboardException {
        super(pcCase);
        this.cpu = cpu;
        this.gpu = gpu;
        this.motherboard = motherboard;
        this.psu = psu;
        this.ram = ram;
        this.screen = screen;
        
        if(this.psu.getPsuType().Desktop_PSU != psu.getPsuType()){
            throw new InvalidPSUException("This psu is not compatible with a desktop! This is a laptop PSU!");
        }
        if (this.motherboard.getMotherBoardType().Desktop != motherboard.getMotherBoardType()) {
            throw new InvalidMotherboardException("This motherboard is not compatible with a desktop! This is a laptop Motherboard!");
        }
    }
    
    
    @Override
    public String Build() {
        return "PC parts: CPU - " + this.cpu.getCores() + " GPU - " + this.gpu.getGpuType() + " Motherboard - " + this.motherboard.getMotherBoardSize() + " PSU - " + this.psu.getPower() + " RAM - " + this.ram.getSize() + " GB " + " Screen - " + this.screen.getResolution() + " Computer Case - " + this.pcCase;
    }
    
    
    
}
