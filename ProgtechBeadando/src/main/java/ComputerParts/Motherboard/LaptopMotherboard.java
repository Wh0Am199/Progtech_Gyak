package ComputerParts.Motherboard;

/**
 *
 * @author Bálint
 */
public class LaptopMotherboard extends MotherboardStrategy {

    private MotherboardType mbtype;
    
    public MotherboardType getMotherBoardType(){
        return mbtype;
    }
    @Override
    public void setMotherBoardType(){
        this.mbtype = MotherboardType.Laptop;
    }

    @Override
    public String BuildMotherboard() {
        return "Motherboard: Type - " + this.mbtype;
    }
    
    public LaptopMotherboard(){
        this.mbtype = MotherboardType.Laptop;
    }
    
}
