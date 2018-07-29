package JDBC;

public class Main {

	public static void main(String[] args) throws Exception {
		DAO dao=new ReviewDAO();
		OrgRev review=new OrgRev("St.Anthony","really good", 3);
		dao.saveReview(review);

	}

}
