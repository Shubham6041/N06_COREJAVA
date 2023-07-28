package org.tnsif.encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.setAccNo(25034528596L);
		h.setAccType("Current Account");
		h.setAtmCardNo(558844526613L);
		h.setPinNo(1515);
		
		System.out.println(h);

	}

}
