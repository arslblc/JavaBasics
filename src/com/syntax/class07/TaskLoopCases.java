package com.syntax.class07;

public class TaskLoopCases {
	
	//Create a boolean variable workDay and assign true create int variable day and assign it to 1

//As long as it is workDay print “I need a day off” and increase day.
//Once day is 6 print “I do not need a day off any more”

	public static void main (String[] args) {
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			
		
			if(day<6) {
				System.out.println("I need a day off");
			}else {System.out.println("i do not need a day off anymore");
				workDay=false;
			}
			day++;
		}
	}

}
