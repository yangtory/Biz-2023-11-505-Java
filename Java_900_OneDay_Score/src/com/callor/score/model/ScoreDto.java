package com.callor.score.model;

public class ScoreDto {
	
	public int students;
	public String stdNum;
	public int scorekor;
	public int scoreeng;
	public int scoremath;
	public int scoremusic;
	public int scoreart;
	
	public int kortotal;
	public int engtotal;
	public int mathtotal;
	public int musictotal;
	public int arttotal;
	public int totalTotal;
	
	public float koravg;
	public float engavg;
	public float mathavg;
	public float musicavg;
	public float artavg;
	public float avgavg;
	public float totalavg;
	
	private int total;
	private float avg;
	
	public int getTotal() {
		total += scorekor;
		total += scoreeng;
		total += scoremath;
		total += scoremusic;
		total += scoreart;
		return total;
	}
	
	public float getAvg() {
		getTotal();
		avg = (float)total / 5;
		return avg;
	}
}
