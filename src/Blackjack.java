import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String Answer;

		// String cards = "your cards are: ";
		// int cardnumber=1;

		


		do {
			
			System.out.println("Blackjack Game.....Start!");
			// (Answer.equalsIgnoreCase("yes")){

			Player hand1 = new Player();
			System.out.print("Player hand value: ");
			int playerhand = hand1.hand();
			System.out.println(playerhand);
			// cards += "card" + cardnumber + " ," ;
			// System.out.print( cards );
			// cardnumber++;

			Dealer hand2 = new Dealer();
			System.out.print("Dealer hand value: ");
			int dealerhand = hand2.hand();
			System.out.println(dealerhand);
			// System.out.println(hand2.hand() );

			String ifhit;

			do {
				System.out.println("Do you want to hit, yes or no   ");
				ifhit = input.nextLine();
				if (ifhit.equalsIgnoreCase("yes")) 
				{
					playerhand += 1 + (int) (Math.random() * 12);

					System.out.print("Player hand value: ");
					System.out.println(playerhand);
					
					
				}
				
				if ( playerhand < 21 && ifhit.equalsIgnoreCase("yes") )
				{
					System.out.println("Do you want to hit again  ");
					ifhit = input.nextLine();
				}
				

			} while (ifhit.equalsIgnoreCase("yes") && playerhand < 21);

			int dealerifhit = 10 + (int) (Math.random() * 14);

			while (dealerhand <= dealerifhit && dealerhand <= 14) {
				dealerhand += 1 + (int) (Math.random() * 12);

				System.out.print("dealer hit it then quit it.. ");
				System.out.print("Dealer hand value: ");
				System.out.println(dealerhand);
			};

			if (playerhand > 21) {
				System.out.println("you lose ");
			}

			if (dealerhand > 21) {
				System.out.println("dealer lost ");
			}

			else if (playerhand <= 21 && playerhand > dealerhand) {
				System.out.println("you win ");
			}

			else if (dealerhand <= 21 && playerhand < dealerhand) {
				System.out.println("dealer wins, you lose ");
			}
			
			else if (dealerhand == playerhand) {
				System.out.println("tie! ");
			}

			System.out.print("Player hand value: ");
			System.out.println(playerhand);
			System.out.print("Dealer hand value: ");
			System.out.println(dealerhand);

			System.out.println("Do you want play again \n");

			Answer = input.nextLine();
			
			System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvv \n");

		} while (Answer.equalsIgnoreCase("yes"));
		System.out.println("bye  \n");
	}

}
