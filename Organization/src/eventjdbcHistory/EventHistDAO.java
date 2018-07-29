package eventjdbcHistory;

import java.sql.Connection;
import java.sql.Statement;

import JDBC.ConnectionFactory;
import JDBC.OrgRev;

public class EventHistDAO implements DAOeh {
	private Statement st=null;
	public EventHistDAO() throws Exception {
	  Connection con=ConnectionFactory.getConnection();
		st=con.createStatement();
	
	}
	@Override
	public void saveHist(EventHist his) throws Exception {
		String sql="insert into EventHistory values('"+his.getEventName()+"','"+his.getOrgName()+"','"+his.getEventDate()+"',"+his.getZipcode()+",'"+his.getSignature()+"',"+his.getHours()+")";//mysql
			int n=st.executeUpdate(sql);//mysql
			
			if(n>0) {//mysql
			System.out.println("History saved:"+n);//mysql
			}	
		
	}

}
