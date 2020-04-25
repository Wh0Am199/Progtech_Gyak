package ComputerParts.Screen;

/**
 *
 * @author Bárdos Bálint
 */
public class Screen {
    
    private AspectRatio aspectRatio;
    
    public AspectRatio getAspectRatio(){
        return aspectRatio;
    }
    public void setAspectRatio(AspectRatio aspectRatio){
        this.aspectRatio = aspectRatio;
    }
    
    
    private Resolution resolution;
    
    public Resolution getResolution(){
        return resolution;
    }
    public void setResolution(Resolution resolution){
        this.resolution = resolution;
    }
    
}
