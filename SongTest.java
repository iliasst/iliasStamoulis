package ergasia5;

import java.util.Scanner;


public class SongTest {
	public static void main(String args[]) {
		Scanner scanner = new Scanner (System.in);
		
	
		Singer frank = new Singer("Frank Sinatra");
		Singer wham = new Singer("Wham!");
		Singer mariah = new Singer("Mariah Carey");
		Singer chris = new Singer("Chris Rea");
		Singer sia = new Singer("Sia");
		
		new Song("All I Want for Christmas Is You", mariah, "https://www.youtube.com/watch?v=yXQViqx6GMY");
		new Song("White Christmas", frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA");
		new Song("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI");
		new Song("Driving home for christmas", chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		new Song("Santa's Coming For Us", sia, "https://www.youtube.com/watch?v=V3EYjVPRClU");
		new Song("Let It Snow! Let It Snow! Let It Snow!", frank,"https://www.youtube.com/watch?v=vGRC2LYmHfU");
		
		while (true){
			System.out.println("------ Welcome to our DMST Christmas Music Application ------");
			System.out.println("Menu:");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			System.out.println("Type 0 to exit");
			int choice = scanner.nextInt();
			if (choice == 1){
				for (Singer sing: Singer.singer){
					if (sing != null)
						System.out.println(sing.toString());
				}
			}
			else if (choice == 2 ){
				
				int counter=0;
				for(Song sng:Song.song) {
					
					if(sng != null) {
						if(sng.getSinger() == frank)
							counter++;
					}
					}
				System.out.println("Ta tragoudia tou frank einai "+counter);
				for(Song sng:Song.song) {
					if(sng != null)
						if(sng.getSinger() == frank)
							System.out.println(sng.toString());
						
					}
				
				}else if(choice==0) {
					return;
				}else {
					System.err.println("No such option");
				}
			
	}

}
}