package com.javaex.ex08;

public class Tv {
	//필드영역
	private int channel;
	private int volume;
	private boolean power;
	private int maxChannel;
	private int minChannel;
	private int maxVolume;
	private int minVolume;

	
	//생성자
	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	
	//메소드-g/s
	
	/*
	public void setTv(int channel) {
		this.channel=channel;

	}*/
	
	
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
	
	public void maxmin() { //이거 고민좀 해보기
		maxChannel=255;
		minChannel=1;
		maxVolume=100;
		minVolume=0;
	}
	
	
	//========================================================
	

	public void channel( int channel ) {
		//메소드 구현 (1~255 유지) 
		maxmin();
		if (channel<minChannel) {
			this.channel = 1;
		}else if (channel>maxChannel) {
			this.channel = 255;
		}else {
			this.channel = channel;
		}
	}
	public void channel( boolean up ) {
		//메소드 오버로딩 (1~255 유지, 1씩 증감)
		if (power==true) {
			if (up==true) {
				channel++;
			}else {
				channel--;
			}
		}
	}
	
	
	//========================================================
	
	public void volume( int volume ) {
		//메소드 구현  ( 0 ~ 100 유지 )
		maxmin();
		if (volume<minVolume) {
			this.volume = 0;
		}else if (volume>maxVolume) {
			this.volume = 100;
		}else {
			this.volume = volume;
		}
	}
	public void volume( boolean up ) {
		//메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
		if (power==true) {
			if ( up == true) {
				volume++;
			}else {
				volume--;
			}
		}
	}
	
	
	//========================================================
	
	
	public void status() {
		if (power==true) {
			System.out.println("채널:"+channel+"번 음량:"+volume+" 전원:"+"on");
		}else {
			System.out.println("채널:"+channel+"번 음량:"+volume+" 전원:"+"off");
		}
	}
	
	

}
