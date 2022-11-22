package com.example.fan;

public class Singer {
	private int id;
	private String name;
	private double salary;
	private String song;
	
	public Singer(final int id, final String name, final double salary, final String song) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.song = song;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(final double salary) {
		this.salary = salary;
	}
	
	public String getSong() {
		return song;
	}
	
	public void setSong(final String song) {
		this.song = song;
	}
}
