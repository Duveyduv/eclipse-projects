package cosc242503asg4sp23Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cosc242503asg4sp23.TV;
import cosc242503asg4sp23.TVRemoteControl;

public class TVTest

{
	// instantiation of objects
    private TV tv;
    private TVRemoteControl remote;

    @BeforeEach
    public void setUp() 
    
    {
    	// the setup method for each test case, so creates a new object for each one.
        tv = new TV(false, 10, 3);
        remote = new TVRemoteControl(tv);
        // remote takes in a tv object.
    }
    
    
    
    
    
    /*
     * tests for power off and on, increase and decrease volume, set channels, and preventing invalid channels.
     */
    
    @Test
    public void testPowerOn() 
    
    {
    	
        remote.powerOn();
        Assertions.assertTrue(remote.isPowerOn());
        
    }

    @Test
    public void testPowerOff() 
    
    {
        
    	remote.powerOff();
        Assertions.assertFalse(remote.isPowerOn());
        
    }

    @Test
    public void testIncreaseVolume() 
    
    {
        
    	remote.increaseVolume();
        Assertions.assertEquals(11, remote.getVolume());
        remote.increaseVolume();
        Assertions.assertEquals(12, remote.getVolume());
        
    }

    @Test
    public void testDecreaseVolume() 
    
    {
        
    	remote.decreaseVolume();
        Assertions.assertEquals(9, remote.getVolume());
        remote.decreaseVolume();
        Assertions.assertEquals(8, remote.getVolume());
        
    }

    @Test
    public void testSetChannel() 
    
    {
        
    	remote.setChannel(5);   
        Assertions.assertEquals(5, remote.getChannel());
        remote.setChannel(100);
        Assertions.assertEquals(100, remote.getChannel());
        remote.setChannel(35);
        Assertions.assertEquals(35, remote.getChannel());
        
    }

    @Test
    public void testInvalidChannel() 
    
    {
        
    	remote.setChannel(-1);
        Assertions.assertEquals(3, remote.getChannel());
        remote.setChannel(105);
        Assertions.assertEquals(3, remote.getChannel());
        
    }

}
