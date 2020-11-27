package master;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;

import entity.User;
import holder.Page;

@ApplicationScoped
public class UserMaster implements Serializable {

	/**
	 * 登録されたユーザーのリスト
	 */
	private ArrayList<User> userList;

	{
		userList = new ArrayList<User>();
		for (int i = 0; i < 30; i++) {
			userList.add(new User("user" + i, "test"));
		}
	}

	/**
	 * offsetからnum件のユーザーリストを返す
	 * @param page
	 * @return
	 */
	public ArrayList<User> getUserList(Page page) {
		page.config((long) userList.size());
		ArrayList<User> userList = new ArrayList<>();
		int offset = page.offset();
		int num = Page.OUTPUT_NUM;

		for (int i = offset; i < offset + num; i++) {
			userList.add(this.userList.get(i));
		}
		return userList;
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
