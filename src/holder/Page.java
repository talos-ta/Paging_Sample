package holder;

/**
 * @author takumi
 *
 */
public class Page {

	// 全レコードの件数
	private long recordNum;
	// 1ページ中に表示される最大件数
	private int outputNum;
	// 現在のページ
	private int currentPage;
	// 全レコードの件数から算出されるページ数（recordNum/outputNum）
	private long maxPage;

	{
		currentPage = 1;
	}

	/**
	 * ページングに使う変数を設定する
	 * @param recordNum
	 * @param outputNum
	 */
	public void config(Long recordNum, Integer outputNum) {
		this.recordNum = recordNum;
		this.outputNum = outputNum;
		this.maxPage = this.recordNum / this.outputNum;

		if (this.recordNum % this.outputNum != 0
				|| this.recordNum == 0) {
			++this.maxPage;
		}
	}

	/**
	 * 前ページボタンを表示するか
	 * @return
	 */
	public boolean prevPageDisplay() {
		return currentPage > 1;
	}

	/**
	 * 次ページボタンを表示するか
	 * @return
	 */
	public boolean nextPageDisplay() {
		return currentPage < maxPage;
	}

	/**
	 * 最初のページへ
	 */
	public void topPage() {
		currentPage = 1;
	}

	/**
	 * 最後のページへ
	 */
	public void lastPage() {
		currentPage = (int) maxPage;
	}

	/**
	 * 前のページへ
	 */
	public void prevPage() {
		if (prevPageDisplay()) {
			currentPage--;
		}
	}

	/**
	 * 次のページへ
	 */
	public void nextPage() {
		if (nextPageDisplay()) {
			currentPage++;
		}
	}

	/**
	 * 何番目のレコードから表示するか
	 * @return
	 */
	public Integer offset() {
		return (currentPage - 1) * outputNum;
	}

	/**
	 * @return recordNum
	 */
	public long getRecordNum() {
		return recordNum;
	}

	/**
	 * @param recordNum セットする recordNum
	 */
	public void setRecordNum(long recordNum) {
		this.recordNum = recordNum;
	}

	/**
	 * @return outputNum
	 */
	public int getOutputNum() {
		return outputNum;
	}

	/**
	 * @param outputNum セットする outputNum
	 */
	public void setOutputNum(int outputNum) {
		this.outputNum = outputNum;
	}

	/**
	 * @return currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage セットする currentPage
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return maxPage
	 */
	public long getMaxPage() {
		return maxPage;
	}

	/**
	 * @param maxPage セットする maxPage
	 */
	public void setMaxPage(long maxPage) {
		this.maxPage = maxPage;
	}

}
