package interfaces;

class Phone{
	void call() {
		System.out.println("Make Call");
	}
	void sms() {
		System.out.println("Make SMS");
	}
}
interface ICamera{
	void click();
	void record();
}
interface IMusicPlayer{
	void play();
	void pause();
	void stop();
}
class SmartPhone extends Phone implements ICamera, IMusicPlayer{
	public void videoCall() {
		System.out.println("Make video call ");
	}
	public void click() {
		System.out.println("Take Snapshot");
	}
	public void record() {
		System.out.println("Record video");
	}
	
	public void play() {
		System.out.println("Play Song");
	}
	
	public void pause() {
		System.out.println("Pause the song");
	}
	
	public void stop() {
		System.out.println("Stop the current song");
	}
	
			
}


public class InterfacePractice1 {
	public static void main(String[] args) {
		SmartPhone sh = new SmartPhone();
		Phone p = sh;
		ICamera c = sh;
		IMusicPlayer mp = sh;
		
		c.click();
		c.record();
		
		mp.play();
		mp.pause();
		mp.stop();
		
		c.click();
		c.record();
		
		sh.click();
		sh.record();
		sh.play();
		sh.pause();
		sh.stop();
		sh.call();
		sh.sms();
		
		
	}

}
