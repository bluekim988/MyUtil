package Utils;

public class PageUtil {
	private int nowPage = 1;
	private int totalCont, totalPage;
	private int startPage, endPage;
	private int startCont, endCont;
	private int pageGroup, contGroup;
	
	public PageUtil() {}
	
	public void setPageUtil(int totalCont, int pageGroup, int contGroup) {
		this.totalCont = totalCont;
		this.pageGroup = pageGroup;
		this.contGroup = contGroup;
		setTotalPage();
		setEndPage();
		setStartPage();
		setEndCont();
		setStartCont();
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage() {
		this.startPage = ((nowPage - 1) / pageGroup + 1 ) * pageGroup - pageGroup + 1;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage() {
		this.endPage = ((nowPage - 1) / pageGroup + 1 ) * pageGroup;
		if(endPage > totalPage) {
			this.endPage = totalPage;
		}
	}
	public int getStartCont() {
		return startCont;
	}
	public void setStartCont() {
		this.startCont = endCont - contGroup + 1;
	}
	public int getEndCont() {
		return endCont;
	}
	public void setEndCont() {
		this.endCont = nowPage * contGroup;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage() {
		this.totalPage = ((totalCont - 1) / contGroup) + 1;
	}
	
	

}
