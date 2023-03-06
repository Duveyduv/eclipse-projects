package cosc242503asg4sp23;

public class TV {
	
	
	// fields
	private boolean power;
	private int volume;
	private int channels;
	
	
	
	// main constructor for TV
	public TV(boolean power, int volume, int channels) 
	
	{
	
		this.power = power;
		this.volume = volume;
		this.channels = channels;
	
	}

	// setters and getters
	public boolean isPower() 
	
	{
		return power;
	}


	public void setPower(boolean power) 
	
	{
		this.power = power;
	}


	public int getVolume() 
	
	{
		return volume;
	}

	// method to increment volume
	public void incVolume(int volume) 
	
	{
		
		this.volume ++;
		
	}
	
	// method to decrement volume
	public void decVolume(int volume) 
	
	{
		
		this.volume --;
		
	}


	public int getChannels() 
	
	{
		return channels;
	}


	public void setChannels(int channels) 
	
	{
		this.channels = channels;
	}
	
}
