package ComputerParts.GPU;

/**
 *
 * @author Bárdos Bálint
 */
public class GPU {
    
    private GpuType gpuType;
    
    public GpuType getGpuType(){
        return gpuType;
    }
    public void setGpuType(GpuType gpuType){
        this.gpuType = gpuType;
    }
    
    
    private int VRam;
    
    public int getVRam(){
        return VRam;
    }
    public void setVRam(int VRam){
        this.VRam = VRam;
    }
    
    
    public GPU(GpuType gpuType, int VRam){
        this.gpuType = gpuType;
        this.VRam = VRam;
    }
    
}
