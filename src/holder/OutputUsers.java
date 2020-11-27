package holder;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import entity.User;
import master.UserMaster;

@SessionScoped
public class OutputUsers implements Serializable {

	private ArrayList<User> list;

	@Inject
	private UserMaster userMaster;

	@Inject
	private Page page;

	/**
	 * 初期化処理
	 */
	@PostConstruct
	public void init() {
		list = userMaster.getUserList(page);
	}

	/**
	 * @return list
	 */
	public ArrayList<User> getList() {
		return list;
	}

	/**
	 * @param list セットする list
	 */
	public void setList(ArrayList<User> list) {
		this.list = list;
	}
}
