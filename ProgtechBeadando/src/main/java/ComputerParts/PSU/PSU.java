package ComputerParts.PSU;

import PSU.PsuType;

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
    
    public PSU(PsuType psuType, int power){
        this.psuType = psuType;
        this.power = power;
    }
}
