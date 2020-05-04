package ComputerParts.CPU;

/**
 *
 * @author Bárdos Bálint
 */
public class CPU {
    
    private int cores;
    
    public int getCores(){
        return cores;
    }
    public void setCores(int cores){
        this.cores = cores;
    }
    
    
    private CpuSocket cpuSocket;
    
    public CpuSocket getCpuSocket(){
        return cpuSocket;
    }
    public void setCpuSocket(CpuSocket cpuSocket){
        this.cpuSocket = cpuSocket;
    }
    
    
    public CPU(int cores, CpuSocket cpuSocket){
        this.cores=cores;
        this.cpuSocket=cpuSocket;
    }
    
    public CPU DeepCopy(){
        CPU cpu = new CPU(getCores(),getCpuSocket());
        cpu.setCores(getCores());
        cpu.setCpuSocket(getCpuSocket());
        return cpu;
    }
    
    
}
