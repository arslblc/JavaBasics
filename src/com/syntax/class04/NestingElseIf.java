package com.syntax.class04;

public class NestingElseIf {
	
	public static void main(String[] args) {
		
		/*if student completed the quiz we will check for a score
		 * if score >90-->great job
		 * if score >80--->well done
		 * if score >70---> you could have done better
		 * 
		 * if student did not complete the quiz-->not good please 
		 * do homework on time
		*/
		
		boolean quizcompleted=true;
		int score=93;
		
		if(quizcompleted) {
			System.out.println("Let's check your score");
			if(score>90) {
				System.out.println("great job");
			}else if(score>80) {
				System.out.println("well done");
			}else if (score>70) {
				System.out.println("you could have done  better");
				
			}else {
				System.out.println("you failed");
			}
				
			}else {
			System.out.println("do homework on time");
		}
		
	}

}
