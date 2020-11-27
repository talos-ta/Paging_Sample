package backingbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import holder.OutputUsers;
import holder.Page;
import master.UserMaster;

@Named
@RequestScoped
public class Bb00 {

	@Inject
	private UserMaster userMaster;

	@Inject
	private Page page;

	@Inject
	private OutputUsers users;

	/**
	 * ページを移動する際の処理を行う。
	 * @param mode
	 */
	public void movePage(String mode) {
		switch (mode) {
		case "top":
			page.topPage();
			break;
		case "prev":
			page.prevPage();
			break;
		case "next":
			page.nextPage();
			break;
		case "last":
			page.lastPage();
			break;
		}

		users.setList(userMaster.getUserList(page));
	}

	/**
	 * @return page
	 */
	public Page getPage() {
		return page;
	}

	/**
	 * @param page セットする page
	 */
	public void setPage(Page page) {
		this.page = page;
	}

	/**
	 * @return users
	 */
	public OutputUsers getUsers() {
		return users;
	}

	/**
	 * @param users セットする users
	 */
	public void setUsers(OutputUsers users) {
		this.users = users;
	}
}
