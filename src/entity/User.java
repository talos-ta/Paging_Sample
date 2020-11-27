package entity;

public class User {

	private String userId;
	private String password;

	/**
	 * @param userId
	 * @param password
	 */
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	/**
	 * @return userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
