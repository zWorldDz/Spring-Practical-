package com.dstar.handTyping;


public class FlyCoach implements InterfaceCoach {
 
	private InterfaceFortune interfaceFortune;
	
	public FlyCoach()
	{
		
	}
	
	
	/*
	public FlyCoach(InterfaceFortune thisInterfaceFortune)
	{
		interfaceFortune=thisInterfaceFortune;
	}
	*/
	
	
	public InterfaceFortune getInterfaceFortune() {
		return interfaceFortune;
	}


	public void setInterfaceFortune(InterfaceFortune interfaceFortune) {
		this.interfaceFortune = interfaceFortune;
	}


	public String getStr() {
		return "FlyCoachStr";
	}
 
	public String getSpeed() {
		return "FlyCoachSpeed";
	}

	public String getPower() {
		return "FlyCoachPower";
	}
	
	public String getFlyFortune() {
		return "SaDxxFortune";
	}}
