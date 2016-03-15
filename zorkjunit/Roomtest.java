import static org.junit.Assert.*;

import org.junit.Test;


public class Roomtest {
	Room i = new Room();
	
	@Test
	public void test1(){
		Room i = new Room();
		i.setName("Foyer");
		assertEquals("Room Name check", i.getName(), "Foyer");
		System.out.println("Its working fine");
		
	}
	@Test
	public void test2(){
		Room i = new Room();
		
		i.addItems("dead scorpio");
		assertEquals("thing check", i.getItems(), "dead scorpio");
		System.out.println("Its working fine");
		
	}
	@Test
	public void test3(){
		Room i = new Room();
		i.addMoney(1000);
		assertNotNull(i.getMoney());
		System.out.println("Its working fine");
		
	}
	@Test
	public void test4(){
		Room i = new Room();
		i.setIsvisited();
		assertTrue(i.getIsvisited());
		System.out.println("Its working fine");
		
	}
	@Test
	public void test5(){
		Room i = new Room();
		i.setName("Foyer");
		i.addItems("dead scorpio");
		assertNotSame(i.getName(), i.getItems());
		System.out.println("Its working fine");
		
	}
	
	@Test
	public void test6(){
		Room i = new Room();
		i.setMessage("welcome to hell");
		assertTrue(i.getMessage().equals("welcome to hell"));
		System.out.println("Its working fine");
	}
	
	@Test
	public void test7(){
		Report i = new Report();
		i.setMoneycollecetd(100);
		assertTrue(i.getMoneycollecetd()>90);
		System.out.println("yeaa working fine");	
	}
	
	@Test
	public void test8(){
		Report i = new Report();
		i.setRoomsvisited(2);
		assertEquals(i.getRoomsvisited(), 2);
		System.out.println("yeaa working fine");	
	}
	

}
