package eventjdbcHistory;


import JDBC.DAO;
import JDBC.OrgRev;
import JDBC.ReviewDAO;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		DAOeh dao=new EventHistDAO();
		EventHist history=new EventHist("Feeding","St.Anthony","2007-12-30", 94551, "Becky", 5);
		dao.saveHist(history);


	}

}
