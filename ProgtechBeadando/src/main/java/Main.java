
import ComputerParts.CPU.CPU;
import ComputerParts.CPU.CpuSocket;
import ComputerParts.GPU.GPU;
import ComputerParts.GPU.GpuType;
import ComputerParts.Motherboard.DesktopMotherboard;
import ComputerParts.Motherboard.LaptopMotherboard;
import ComputerParts.Motherboard.MotherboardSize;
import ComputerParts.PSU.PSU;
import ComputerParts.RAM.RAM;
import ComputerParts.RAM.RamType;
import ComputerParts.Screen.AspectRatio;
import ComputerParts.Screen.Resolution;
import ComputerParts.Screen.Screen;
import Decorator.ComputerCase;
import Decorator.Desktop;
import Decorator.Laptop;
import Exceptions.InvalidCaseException;
import Exceptions.InvalidMotherboardException;
import Exceptions.InvalidPSUException;
import PSU.PsuType;

/**
 *
 * @author Bárdos Bálint
 */
public class Main {

    public static void main(String[] args) throws InvalidPSUException, InvalidMotherboardException, InvalidCaseException {
        
        try {
            ShoppingBasket basket = ShoppingBasket.getInstance();
        
            CPU cpu = new CPU(8,CpuSocket.Socket_1150);
            GPU gpu = new GPU(GpuType.NVIDIA,6,500);
            LaptopMotherboard mb = new LaptopMotherboard();
            PSU psu = new PSU(PsuType.Laptop_Battery, 600);
            RAM ram = new RAM(RamType.DDR3,8);
            Screen screen = new Screen(AspectRatio._16_9, Resolution.FULL_HD);

            Laptop laptop = new Laptop(cpu,gpu,mb,psu,ram,screen,ComputerCase.Laptop);
            System.out.println(laptop.Build());
            basket.Add(laptop);


            CPU cpu2 = cpu.DeepCopy();
            GPU gpu2 = new GPU(GpuType.AMD,4,650);
            DesktopMotherboard mb2 = new DesktopMotherboard(MotherboardSize.ATX);
            PSU psu2 = new PSU(PsuType.Desktop_PSU, 750);
            RAM ram2 = new RAM(RamType.DDR4,16);
            Screen screen2 = new Screen(AspectRatio._21_9, Resolution.QHD);

            Desktop desktop = new Desktop(cpu2,gpu2,mb2,psu2,ram2,screen2,ComputerCase.ATX);
            System.out.println(desktop.Build());
            basket.Add(desktop);
        } catch (InvalidPSUException e){
            e.printStackTrace();
        } catch (InvalidMotherboardException emb){
            emb.printStackTrace();
        } catch (InvalidCaseException ic){
            ic.printStackTrace();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        
        
    }
    
}
