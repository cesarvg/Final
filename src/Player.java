
public class Player {


public int hand(){
///first hand 
int card1;
int card2;
int totalcardsvalue; 



card1= 1+ (int)(Math.random()*12);
card2 = 1+ (int)(Math.random()*12);


totalcardsvalue = card1 + card2; 


return totalcardsvalue;
	
}	
}
