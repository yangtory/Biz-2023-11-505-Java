package com.callor.score.model;

public class ScoreDto {
	
	public int students;
	public String stdNum;
	public int scorekor;
	public int scoreeng;
	public int scoremath;
	public int scoremusic;
	public int scoreart;
	
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
