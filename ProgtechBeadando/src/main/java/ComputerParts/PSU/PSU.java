package PSU;

/**
 *
 * @author Bárdos Bálint
 */
public class PSU {
    
    private PsuType psuType;
    
    public PsuType getPsuType(){
        return psuType;
    }
    public void setPsuType(PsuType psuType){
        this.psuType = psuType;
    }
    
    
    private int power;
    
    public int getPower(){
        return power;
    }
    public void setPower(int power){
        this.power = power;
    }
}
