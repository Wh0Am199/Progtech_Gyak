package ComputerParts.RAM;

/**
 *
 * @author Bárdos Bálint
 */
public class RAM {
    
    private RamType ramType;
    
    public RamType getRamType(){
        return ramType;
    }
    public void setRamType(RamType ramType){
        this.ramType = ramType;
    }
    
    
    private int size;
    
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    
    
    public RAM(RamType ramType, int size){
        this.ramType = ramType;
        this.size = size;
    }
    
}
