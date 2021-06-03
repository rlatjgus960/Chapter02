package com.javaex.ex07;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자
	public Song() {
		
	}
	
	public Song(String title, int track) {
		this.title = title;
		
		if (track<0) {
			this.track=0;
		}else {
			this.track = track;
		}
		this.track = track;
		System.out.println("Song(2)");
		
	}
	
	public Song(String artist, String title, String album, int year, int track, String composer) {
		//Song을 힙영역에 올린다.
		
		this(title,track);  //힙영역에 먼저 올려줘야하기 때문에 다른 생성자 호출을 제일 먼저 해야한다.
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.composer = composer;
		
		System.out.println("Song(5)");
	}
	
	public Song(String artist) {
		this.artist = artist;
		
	}
	
	

	//메소드-게터세터
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	
	//메소드-일반
	public void showinfo() {
		System.out.println(artist+", "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡 )");
	}
	
	
}
