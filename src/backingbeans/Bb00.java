package backingbeans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import entity.User;
import master.UserMaster;

@Named
@RequestScoped
public class Bb00 {

	private ArrayList<User> userList;

	@PostConstruct
	public void init() {
		userList = UserMaster.getUserList();
	}

	/**
	 * @return userList
	 */
	public ArrayList<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList セットする userList
	 */
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}
}
