package JDBC;

public class OrgRev {
	private String orgname;
	private String review;
	private Integer stars;
	
	
	public OrgRev(){}
	public OrgRev(String orgname, String review, Integer d) {
		this.orgname = orgname;
		this.review = review;
		this.stars = d;
	}
	@Override
	public String toString() {
		return "OrgRev [orgname=" + orgname + ", review=" + review + ", stars=" + stars + "]";
	}
	public String getOrgname() {
		return orgname;
	}
	public String getReview() {
		return review;
	}
	public Integer getStars() {
		return stars;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	
	
	
}
