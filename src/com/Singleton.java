package com;

//Create a Singleton For Movie ticket booking.
public class Singleton {

	int seats =100;
	private static Singleton object=null;
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		if(object==null)
		{
			object=new Singleton();
		}
		return object;
	}
	
	public void TicketBooking(int count)
	{
		seats=seats-count;	
		System.out.println("Pending seats::"+seats);
	}
		
	public static void main(String[] args) {
		object.getInstance();
		object.TicketBooking(5);
		object.getInstance();
		object.TicketBooking(28);
	}

}
