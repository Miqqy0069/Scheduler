package model;

public class Schedule {
	
	String date;
	String status;
	Meeting meeting;
	
	
 
	public void setStatus(String status) {
		
		this.status = status;
		
	}
	

	public void setMeeting(Meeting meeting) {
		
		this.meeting = meeting;
		
	}
	

	public void setDate(String date) {
		
		this.date = date;
		
	}
	
  public String getStatus() {
		
		return status;
		
	}
	

	public Meeting getMeeting() {
		
		return meeting;
		
	}
	

	public String getDate() {
		
		return date;
		
	}
	
	

}
