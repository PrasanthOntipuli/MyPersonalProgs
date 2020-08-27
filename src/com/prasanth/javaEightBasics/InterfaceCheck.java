package com.prasanth.javaEightBasics;


interface Moblie
{
	public abstract void placeTheCall();
	default void sendMessage()
	{
		System.out.println("Sent message");
	}
	static void alaram()
	{
		System.out.println("Alaram is set");
	}
}

interface Ipod
{
	public abstract void placeTheCall();
	default void sendMessage()
	{
		System.out.println("Sent message");
	}
	static void alaram()
	{
		System.out.println("Alaram is set");
	}
}

abstract class Nokia implements Moblie, Ipod
{

	@Override
	public void placeTheCall() {
		// TODO Auto-generated method stub
		System.out.println("placed a call");
	}
	public static void alaram()
	{
		System.out.println("Alaram is set");
	}
	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		Moblie.super.sendMessage();
	}
	
}

class NokiaSmartPhones extends Nokia
{
	
}
public class InterfaceCheck {

	public static void main(String[] args) {
		
		Ipod mypersonalMobile=new NokiaSmartPhones();
		mypersonalMobile.sendMessage();
	    
	}
}
