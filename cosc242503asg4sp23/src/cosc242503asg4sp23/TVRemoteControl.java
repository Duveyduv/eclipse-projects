package cosc242503asg4sp23;

public class TVRemoteControl {
	
	
	// fields for tv remote that takes in a tv object
	private TV tv;
	private boolean powerOn;
	private int volume;
	private int channel;
	
	
	// constructor for remote with default values and takes in 1 tv object
	public TVRemoteControl(TV tv)
	
	{
		this.tv = tv;
		this.powerOn = false;
		this.volume = 10;
		this.channel = 3;
		
	}
	
	
	public void powerOff() 
	
	{
		
		this.powerOn = false;
		
	}
	
	
	public void powerOn()
	
	{
		
		this.powerOn = true;
		
	}


	public boolean isPowerOn() 
	
	{
		
		return powerOn;
	
	}
	
	// increase volume if less than 100
	public void increaseVolume()
	
	{
		
		if (volume < 100)
			
		{
			
			this.volume ++;
			
		}
		
	}
	
	// decrease volume if greater than 0
	public void decreaseVolume()
	
	{
		
		if (volume > 0)
			
		{
			
			this.volume --;
			
		}
		
		
	}


	public int getVolume() 
	
	{
		
		return volume;
	
	}
	
	// set the channel with conditions so that values entered cannot be negative or above 100
	public void setChannel(int channel)
	
	{
		
        if (channel < 0 )
        
        {
        	
        	channel = 3;
        	
        }
        
        if (channel > 100)
        	
        {
        	
        	channel = 3;
        	
        }
        
        else 
        	
        {
        	
        	this.channel = channel;
        	
        }
        
        
	}
	
	
	public int getChannel()
	
	{
		
		return channel;
		
	}
	
	


	
	
	

}
