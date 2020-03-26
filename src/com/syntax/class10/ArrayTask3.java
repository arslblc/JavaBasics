package com.syntax.class10;

public class ArrayTask3 {
	public static void main (String[] args) {
		
		String[] countries= {"turkey", "usa", "england", "germany"};
		
	    int aSize=countries.length; {
	    	System.out.println(aSize);
	    } 
	    
	    for(int i=0; i<aSize; i++) {
	      System.out.println(countries[i]);
	    }
	    
	    
	    System.out.println("======ADVANCED LOOP==========");
		
	
   for(String ulke:countries) {
if(ulke.equals("USA")) {
	System.out.println("washington"); 
}else if (ulke.equals("turkey")) {
	System.out.println("Ankara");
}else if (ulke.equals("england")) {
	System.out.println("London");
} else if (ulke.equals("germany")) {
	System.out.println("berlin");
}

System.out.println("======FOR LOOP==========");

for(int y=0; y<countries.length; y++) {

switch(countries[y]) {
case "USA":
	System.out.println("washington"); 
	break;
case "turkey":
	System.out.println("Ankara");
    break;
case "england":
	System.out.println("london");
	break;
case "germany":
	System.out.println("berlin");
	break;
}


}
   }}}

