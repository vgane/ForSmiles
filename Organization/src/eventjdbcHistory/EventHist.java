package eventjdbcHistory;



public class EventHist {
	String EventName;
	String OrgName;
	String EventDate;
	Integer zipcode;
	String Signature;
	Integer Hours;
	
	
	public EventHist() {}
	public EventHist(String eventName, String orgName, String eventDate, Integer zipcode, String signature,
			Integer hours) {
	
		EventName = eventName;
		OrgName = orgName;
		EventDate = eventDate;
		this.zipcode = zipcode;
		Signature = signature;
		Hours = hours;
	}
	@Override
	public String toString() {
		return "EventHist [EventName=" + EventName + ", OrgName=" + OrgName + ", EventDate=" + EventDate
				+ ", zipcode=" + zipcode + ", Signature=" + Signature + ", Hours=" + Hours + "]";
	}
	public String getEventName() {
		return EventName;
	}
	public String getOrgName() {
		return OrgName;
	}
	public String getEventDate() {
		return EventDate;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public String getSignature() {
		return Signature;
	}
	public Integer getHours() {
		return Hours;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public void setOrgName(String orgName) {
		OrgName = orgName;
	}
	public void setEventDate(String eventDate) {
		EventDate = eventDate;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public void setSignature(String signature) {
		Signature = signature;
	}
	public void setHours(Integer hours) {
		Hours = hours;
	}
	
	
	
	
}
