package ComputerParts.Motherboard;

/**
 *
 * @author Bálint
 */
public class LaptopMotherboard extends MotherboardStrategy {

    private MotherboardSize mbsize;
    
    public MotherboardSize getMotherBoardSize(){
        return mbsize;
    }
    public void setMotherBoardSize(MotherboardSize mbsize){
        this.mbsize = mbsize;
    }
    
    
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
        return "Motherboard: Size - " + this.mbsize + " Type - " + this.mbtype;
    }
    
    public LaptopMotherboard(MotherboardSize mbsize, MotherboardType mbtype){
        this.mbsize = mbsize;
        this.mbtype = mbtype.Laptop;
    }
    
}
