package com.cognizant.participationMicroservice.utilModel;

public class Player {
	private long playerId;
	private String playerName;
	private int age;
	private long contactNumber;
	private String email;
	private String gender;
	private String sportsName;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(long playerId, String playerName, int age, long contactNumber, String email, String gender,
			String sportsName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.age = age;
		this.contactNumber = contactNumber;
		this.email = email;
		this.gender = gender;
		this.sportsName = sportsName;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSportsName() {
		return sportsName;
	}

	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", age=" + age + ", contactNumber="
				+ contactNumber + ", email=" + email + ", gender=" + gender + ", sportsName=" + sportsName + "]";
	}

}
