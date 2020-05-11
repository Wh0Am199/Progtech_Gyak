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
import ComputerParts.Motherboard.LaptopMotherboard;
import ComputerParts.PSU.PSU;
import ComputerParts.RAM.RAM;
import ComputerParts.RAM.RamType;
import ComputerParts.Screen.AspectRatio;
import ComputerParts.Screen.Resolution;
import ComputerParts.Screen.Screen;
import Exceptions.InvalidCaseException;
import Exceptions.InvalidMotherboardException;
import Exceptions.InvalidPSUException;
import PSU.PsuType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bárdos Bálint
 */
public class LaptopTest {
    
    public LaptopTest() {
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

    
    //This must catch the InvalidPSUException because desktop PSU was added to a laptop
    @Test
    public void testObjectCreation() throws InvalidPSUException, InvalidMotherboardException, InvalidCaseException {
        CPU cpu = new CPU(8,CpuSocket.Socket_1150);
        GPU gpu = new GPU(GpuType.NVIDIA,6,500);
        LaptopMotherboard mb = new LaptopMotherboard();
        PSU psu = new PSU(PsuType.Desktop_PSU, 600);
        RAM ram = new RAM(RamType.DDR3,8);
        Screen screen = new Screen(AspectRatio._16_9, Resolution.FULL_HD);
        System.out.println("testObjectCreation");
        
        try {
            Laptop instance = new Laptop(cpu,gpu,mb,psu,ram,screen,ComputerCase.microATX);
        } catch (InvalidPSUException e){
            e.printStackTrace();
        }

    }
    
    //This must catch the InvalidCaseException because desktop case was added to a laptop
    @Test
    public void testObjectCreation2() throws InvalidPSUException, InvalidMotherboardException, InvalidCaseException {
        CPU cpu = new CPU(8,CpuSocket.Socket_1150);
        GPU gpu = new GPU(GpuType.NVIDIA,6,500);
        LaptopMotherboard mb = new LaptopMotherboard();
        PSU psu = new PSU(PsuType.Laptop_Battery, 600);
        RAM ram = new RAM(RamType.DDR3,8);
        Screen screen = new Screen(AspectRatio._16_9, Resolution.FULL_HD);
        System.out.println("testObjectCreation");
        
        try {
            Laptop instance = new Laptop(cpu,gpu,mb,psu,ram,screen,ComputerCase.EATX);
        } catch (InvalidCaseException e){
            e.printStackTrace();
        }

    }
    
}
