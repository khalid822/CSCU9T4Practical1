/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry {
	private  String Where;
	
	
	
	public SwimEntry (String n, int d, int m, int y, int h, int min, int s, float dist, String Whr) { 
		
		super(n,d,m,y,h,min,s,dist);
	this.Where= Whr;
	}
	public String getWhere(){
		return Where;
	}
	
	public void setWhere(String Whr) {
		
		this.Where =Whr;
   }
	

public String getEntry() {
	String result =getName()+"ran" +getDistance() +"km in"
	+getHour()+":"+getMin()+":"+getSec()+"on"  	
	+getDay()+"/"+getMonth()+"/"+getYear()+"\n"+getWhere()+":";
	return result;
}
			
}