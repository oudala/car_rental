package com.epam.carrental.domain;

import java.util.Objects;

public class User {
	private long userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private String userAddress;
	private boolean userBlocked;
	private Userrole useRole;

	public User() {
		super();
	}

	public User(String userName, String userEmail, String userPassword, String userAddress, boolean userBlocked,
			Userrole useRole) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
		this.userBlocked = userBlocked;
		this.useRole = useRole;
	}

	public User(long userId, String userName, String userEmail, String userPassword, String userAddress,
			boolean userBlocked, Userrole useRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userAddress = userAddress;
		this.userBlocked = userBlocked;
		this.useRole = useRole;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public boolean isUserBlocked() {
		return userBlocked;
	}

	public void setUserBlocked(boolean userBlocked) {
		this.userBlocked = userBlocked;
	}

	public Userrole getUseRole() {
		return useRole;
	}

	public void setUseRole(Userrole useRole) {
		this.useRole = useRole;
	}

	// tostring
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userAddress=" + userAddress + ", userBlocked=" + userBlocked + ", useRole="
				+ useRole + "]";
	}

	// hashcoder

	@Override
	public int hashCode() {
		return Objects.hash(useRole, userAddress, userBlocked, userEmail, userId, userName, userPassword);
	}

	// equals

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return useRole == other.useRole && Objects.equals(userAddress, other.userAddress)
				&& userBlocked == other.userBlocked && Objects.equals(userEmail, other.userEmail)
				&& userId == other.userId && Objects.equals(userName, other.userName)
				&& Objects.equals(userPassword, other.userPassword);
	}

}
