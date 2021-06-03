package com.javaex.ex08;

public class Tv {
	//필드영역
	private int channel;
	private int volume;
	private boolean power;
	
	
	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//메소드-g/s
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public boolean isPower() {
		return power;
	}
	
	
	//메소드-일반
	
	
	public void power(boolean on) {
		if(on==true) {
			power=true;
		}else {
			power=false;
		}
	}
	
	
	//========================================================
	

	public void channel( int channel ) {
		//메소드 구현 (1~255 유지) 
		if (channel<1) {
			this.channel = 1;
		}else if (channel>255) {
			this.channel = 255;
		}else {
			this.channel = channel;
		}
	}
	public void channel( boolean up ) {
		//메소드 오버로딩 (1~255 유지, 1씩 증감)
		if (up==true) {
			channel++;
		}else {
			channel--;
		}
	}
	
	
	//========================================================
	
	public void volume( int volume ) {
		//메소드 구현  ( 0 ~ 100 유지 )
		if (volume<0) {
			this.volume = 0;
		}else if (volume>100) {
			this.volume = 100;
		}else {
			this.volume = volume;
		}
	}
	public void volume( boolean up ) {
		//메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
		if ( up == true) {
			volume++;
		}else {
			volume--;
		}
	}
	
	
	//========================================================
	
	
	public void status() {
		System.out.println("채널:"+channel+" 음량:"+volume+" 전원:"+power);
	}
	
	

}
