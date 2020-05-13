package ComputerParts.Motherboard;

/**
 *
 * @author Bárdos Bálint
 */
public class DesktopMotherboard extends MotherboardStrategy{
    
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
        this.mbtype = MotherboardType.Desktop;
    }

    @Override
    public String BuildMotherboard() {
        return "Motherboard: Size - " + this.mbsize + " Type - " + this.mbtype;
    }
    
    public DesktopMotherboard(MotherboardSize mbsize){
        this.mbsize = mbsize;
        this.mbtype = MotherboardType.Desktop;
    }
    
    
}
