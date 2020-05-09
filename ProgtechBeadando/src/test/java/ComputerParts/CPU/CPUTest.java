/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputerParts.CPU;

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
public class CPUTest {
    
    public CPUTest() {
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

    /**
     * Test of getCores method, of class CPU.
     */
    @Test
    public void testGetCores() {
        try{
            System.out.println("getCores");
            CPU instance = new CPU(8, CpuSocket.Socket_1150);
            int expResult = 8;
            int result = instance.getCores();
            assertEquals(expResult, result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Test of setCores method, of class CPU.
     */
    @Test
    public void testSetCores() {
        try {
            System.out.println("setCores");
            int cores = 8;
            CPU instance = new CPU(cores, CpuSocket.Socket_AM4);
            instance.setCores(cores);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * Test of getCpuSocket method, of class CPU.
     */
    @Test
    public void testGetCpuSocket() {
        try{
            System.out.println("getCpuSocket");
            CPU instance = new CPU(8, CpuSocket.Socket_1150);
            CpuSocket expResult = CpuSocket.Socket_1150;
            CpuSocket result = instance.getCpuSocket();
            assertEquals(expResult, result);
        } catch (Exception e){
            e.printStackTrace();
        }     
    }

    /**
     * Test of setCpuSocket method, of class CPU.
     */
    @Test
    public void testSetCpuSocket() {
        try {
            System.out.println("setCpuSocket");
            CpuSocket cpuSocket = CpuSocket.Socket_775;
            CPU instance = new CPU(4,cpuSocket);
            instance.setCpuSocket(cpuSocket);           
        } catch (Exception e){
            e.printStackTrace();
        }        
    }

    /**
     * Test of DeepCopy method, of class CPU.
     */
    @Test
    public void testDeepCopy() {
        try{
            System.out.println("DeepCopy");
            CPU instance = new CPU(8,CpuSocket.Socket_2011);
            CPU result = instance.DeepCopy();
            assertEquals(instance, result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
