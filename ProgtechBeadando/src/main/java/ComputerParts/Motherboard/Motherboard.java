package ComputerParts.Motherboard;

/**
 *
 * @author Bárdos Bálint
 */
public class Motherboard {
    
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
    public void setMotherBoardType(MotherboardType mbtype){
        this.mbtype = mbtype;
    }
    
    
}
