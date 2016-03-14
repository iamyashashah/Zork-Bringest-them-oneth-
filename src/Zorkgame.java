import java.util.Random;
import java.util.Scanner;

public class Zorkgame {


	static String[] ItemsSeen = new String[8];
	static double[] collected = new double[8];
	static int[] roomVisited = new int[8];

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String response;
		boolean quit = false;

		//room1
		Room foyer = new Room();
		foyer.addItems("a Dead Scropian");
		foyer.setName("FoyerRoom");
		foyer.addMoney(100);

		foyer.setMessage("You are in" + " " + foyer.getName()+ "\n" + "Press N to go in FrontRoom or Press S to exit");

		//room2
		Room frontRoom = new Room();
		frontRoom.addItems("a phone");
		frontRoom.setName("FrontRoom");
		frontRoom.addMoney(500);
		frontRoom.setMessage("you are in" + " " + frontRoom.getName() + "\n" + "Press E to go in Kitchen or Press S to go in Foyer or Press W to go in Library");

		//room3
		Room library = new Room();
		library.addItems("spiders");
		library.setName("library");
		library.addMoney(600);
		library.setMessage("you are in" + " " + library.getName() + "\n" + "Press W or Press N for next room");

		//room4
		Room kitchen = new Room();
		kitchen.addItems("bats");
		kitchen.setName("Kitchen");
		kitchen.addMoney(450);
		kitchen.setMessage("you are in" + " " + kitchen.getName() + "\n" + "Press N or W for next room");


		//room5
		Room diningRoom = new Room();
		diningRoom.addItems("dust");
		diningRoom.addItems("Boxes");
		diningRoom.setName("Dining Room");
		diningRoom.addMoney(350);
		diningRoom.setMessage("you are in" + " " + diningRoom.getName() + "\n" + "you can't go forward Press S to go back in previous room");

		Room vault = new Room();
		vault.addItems("3 walking skeletons");
		vault.setName("Vault Room");
		vault.addMoney(250);
		vault.setMessage("you are in" + " " + vault.getName() + "\n" + "Press E to go in jackpot room or next room");


		Room parlor = new Room();
		parlor.addItems("treasure chest");
		parlor.setName("Parlor Room");
		parlor.addMoney(460);
		parlor.setMessage("you are in" + " " + parlor.getName() + "\n" + "Press W or S for next room");


		Room secretRoom = new Room();
		secretRoom.addItems("a piles of gold");
		secretRoom.setName("Secret Room");
		secretRoom.addMoney(1000);
		secretRoom.setMessage("you are in" + " " + secretRoom.getName() + "\n" + "You made it!!! and now Press W to go in previous room");

		Room location = new Room();

		location = foyer;

		while (quit == false)
		{
			if (location == foyer) //set room1
			{

				collected[0]=foyer.getMoney();
				countMoney();
				foyer.setIsvisited();
				roomVisited[0]=1;
				System.out.println(foyer.getName());
				ItemsSeen[0]= foyer.getItems();


				System.out.println(foyer.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("N"))
				{
					location = frontRoom;

				}
				else {
					quit = true;
					countMoney();
					ThingsSeen();
					Roomsvisited();
					System.exit(0);
				}
			}

			else if (location == frontRoom)//set room2
			{


				collected[1]=frontRoom.getMoney();
				countMoney();
				frontRoom.setIsvisited();
				roomVisited[1]=1;
				System.out.println(frontRoom.getName());
				ItemsSeen[1]= frontRoom.getItems();
				System.out.println(frontRoom.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("E"))
				{
					location = kitchen;

				}
				else if (response.equalsIgnoreCase("W"))
				{
					location = library;
				}
				else if (response.equalsIgnoreCase("S"))
				{
					location = foyer;
				}

			}

			else if (location == library)//set room3
			{


				collected[2]=library.getMoney();
				countMoney();
				library.setIsvisited();
				roomVisited[2]=1;
				System.out.println(library.getName());
				ItemsSeen[2]= library.getItems();
				System.out.println(library.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("N"))
				{
					location = diningRoom;

				}
				else if (response.equalsIgnoreCase("E"))
				{
					location = frontRoom;
				}


			}
			else if (location == kitchen)//set room4
			{


				collected[3]=kitchen.getMoney();
				countMoney();
				kitchen.setIsvisited();
				roomVisited[3]=1;
				System.out.println(kitchen.getName());
				ItemsSeen[3]= kitchen.getItems();
				System.out.println(kitchen.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("N"))
				{
					location = parlor;

				}
				else if (response.equalsIgnoreCase("W"))
				{
					location = frontRoom;
				}

			}
			else if (location == diningRoom)//set room5
			{


				collected[4]=diningRoom.getMoney();
				countMoney();
				diningRoom.setIsvisited();
				roomVisited[4]=1;
				System.out.println(diningRoom.getName());
				ItemsSeen[4]= diningRoom.getItems();
				System.out.println(diningRoom.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("S"))
				{
					location = library;

				}
				else {
					System.out.print("Invalid Option");
				}

			}
			else if (location == vault)//set room6
			{


				collected[5]=vault.getMoney();
				countMoney();
				int random = 3;
				int guess;
				vault.setIsvisited();
				roomVisited[5]=1;
				System.out.println(vault.getName());
				ItemsSeen[5]= vault.getItems();
				System.out.println(vault.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("E"))
				{
					System.out.println("Guess a number from 1 to 4 to find treasure!!!");

					guess = keyboard.nextInt();
					if(guess == random)
					{
						location = secretRoom;
					}
					else {
						location = parlor;
					}
				}
			}

			else if (location == parlor)//set room7
			{


				collected[6]=parlor.getMoney();
				countMoney();
				parlor.setIsvisited();
				roomVisited[6]=1;
				System.out.println(parlor.getName());
				ItemsSeen[6]= parlor.getItems();
				System.out.println(parlor.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("S"))
				{
					location = kitchen;

				}
				else if (response.equalsIgnoreCase("W")) {
					location = vault;
				}

			}

			else if (location == secretRoom)//set room8
			{


				collected[7]=secretRoom.getMoney();
				countMoney();
				secretRoom.setIsvisited();
				roomVisited[7]=1;
				System.out.println(secretRoom.getName());
				ItemsSeen[7]= secretRoom.getItems();
				System.out.println(secretRoom.getMessage());
				response = keyboard.next();
				if (response.equalsIgnoreCase("W"))
				{
					location = vault;

				}
				else {
					System.out.println("invalid Option");
				}

			}
			else 
			{
				System.out.println("invalid selection");
			}
		}


	}
	
	//Report Calculation
	
	public static void countMoney()
	{
		int totalMoney=0;
		for(int i=0;i<8;i++)
		{
			totalMoney+=collected[i];
		}
		System.out.println("Total Money accumulated: " + totalMoney);
	}

	public static void Roomsvisited()
	{
		int roomCount=0;

		for(int i=0;i<8;i++)
		{
			roomCount+=roomVisited[i];
		}
		System.out.println("Total Rooms Visited: " + roomCount);
	}
	public static void ThingsSeen()
	{
		for(int i=0;i<8;i++)
			
		{
			System.out.println("Things seen along the way: "+ i + " " + ItemsSeen[i]);
		}
	}
}













