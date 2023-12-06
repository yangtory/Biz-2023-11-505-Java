package com.project.blackjack.model;

public class BlackjackDto {
	
	private String cardDeck;
	private String denomi;
	private String cardSuit;
	private int value;
	
	public String getCardDeck() {
		return cardDeck;
	}
	public void setCardDeck(String cardDeck) {
		this.cardDeck = cardDeck;
	}
	public String getDenomi() {
		return denomi;
	}
	public void setDenomi(String denomi) {
		this.denomi = denomi;
	}
	public String getCardSuit() {
		return cardSuit;
	}
	public void setCardSuit(String cardSuit) {
		this.cardSuit = cardSuit;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String toString() {
		return "[숫자 = " + denomi + ", 패턴 = " + cardSuit + 
				", 값 = " + value + "]";
	}
	
	
	
}