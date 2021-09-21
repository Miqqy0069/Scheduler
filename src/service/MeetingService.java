package service;

import java.util.ArrayList;
import java.util.List;
import model.Meeting;
import model.Person;
import model.Schedule;

public class MeetingService {
	
	Meeting createMeeting() {
		
		Person person = new Person();		
		person.setName("miq");
		person.setEmail("qwe@gmail.com");
		
		Meeting meeting = new Meeting();		
		meeting.setPerson(person);
		meeting.setTime("1:00pm - 2:00pm");		
		
		return meeting;						
	}
	
	List <Schedule> createSchedule(Meeting meeting){				
	List <Schedule> scheduleList = new ArrayList();
	
	String[] day = {"M","T","W","TH","F"};	
		
	for(Schedule i : scheduleList) {
		int length = day.length;		
		for(int a = 0 ; a < length; a++) {			
			if (meeting != null && i.getMeeting() == null) {			
			i.setMeeting(meeting);
			i.setStatus("Occupied");
			meeting = null;
		}
		else {
			i.setMeeting(null);
			i.setStatus("Available");								
			}			
			i.setDate(day[a]);
		}							
	}
	
	return scheduleList;
	}
	List <Schedule> createScheduler(){
		Meeting meeting = createMeeting();
		return createSchedule(meeting);		
	}
}




