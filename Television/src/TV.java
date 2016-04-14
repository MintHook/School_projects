
public class TV {
	
	public int channel;
    public int volume;
    public boolean on;
    
    public TV() {
            channel = 1;
            volume = 1;
            on = false;
    }
    
    public void turnOn() {
            on = true;
    }
    
    public void turnOff() {
            on = false;
    }
    
    public void setChannel(int c) {
            if(on) channel = c;
    }
    
    public void setVolume(int v) {
            if(on) volume = v;
    }
    
    public void channelUp() {
            if(on) channel++;
    }
    
    public void channelDown() {
            if(on) channel--;
    }
    
    public void volumeUp() {
            if(on) volume++;
    }
    
    public void volumeDown() {
            if(on) volume--;
    }
}
