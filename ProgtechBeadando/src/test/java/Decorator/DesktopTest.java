/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import ComputerParts.CPU.CPU;
import ComputerParts.CPU.CpuSocket;
import ComputerParts.GPU.GPU;
import ComputerParts.GPU.GpuType;
import ComputerParts.Motherboard.DesktopMotherboard;
import ComputerParts.Motherboard.MotherboardSize;
import ComputerParts.PSU.PSU;
import ComputerParts.RAM.RAM;
import ComputerParts.RAM.RamType;
import ComputerParts.Screen.AspectRatio;
import ComputerParts.Screen.Resolution;
import ComputerParts.Screen.Screen;
import Exceptions.InvalidMotherboardException;
import Exceptions.InvalidPSUException;
import Exceptions.TooPowerfulGPUException;
import PSU.PsuType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bálint
 */
public class DesktopTest {
    
    public DesktopTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testBuild() throws InvalidPSUException, InvalidMotherboardException, TooPowerfulGPUException {
        CPU cpu = new CPU(8,CpuSocket.Socket_1366);
        GPU gpu = new GPU(GpuType.AMD,6,800);
        DesktopMotherboard mb = new DesktopMotherboard(MotherboardSize.ATX);
        PSU psu = new PSU(PsuType.Desktop_PSU, 1000);
        RAM ram = new RAM(RamType.DDR3,16);
        Screen screen = new Screen(AspectRatio._21_9, Resolution.QHD);
        
        System.out.println("Build");
        try {
            Desktop instance = new Desktop(cpu,gpu,mb,psu,ram,screen,ComputerCase.ATX);
            String expResult = "PC parts: CPU - 8 GPU - AMD Motherboard - ATX PSU - 1000 RAM - 16 GB  Screen - QHD Computer Case - null";
            String result = instance.Build();
            assertEquals(expResult, result);
        } catch (Exception e){
            e.printStackTrace();
        }
        

    }
    
    @Test
    public void testTooPowerfulGPU() throws InvalidMotherboardException, InvalidPSUException, TooPowerfulGPUException{
        System.out.println("Too powerful GPU");
        CPU cpu = new CPU(4,CpuSocket.Socket_1366);
        GPU gpu = new GPU(GpuType.AMD,6,800);
        DesktopMotherboard mb = new DesktopMotherboard(MotherboardSize.ATX);
        PSU psu = new PSU(PsuType.Desktop_PSU, 600);
        RAM ram = new RAM(RamType.DDR3,8);
        Screen screen = new Screen(AspectRatio._16_9, Resolution.FULL_HD);
        
        try {
            Desktop instance = new Desktop(cpu,gpu,mb,psu,ram,screen,ComputerCase.ATX);
        } catch (TooPowerfulGPUException e){
            e.printStackTrace();
        }
    }
    
}
