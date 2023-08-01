package org.tnsif.instanceofdemo;

class RBI{
	protected String IFSCcode;
}

class SBI extends RBI{
	public SBI()
	{
		super.IFSCcode = "RBI000211";
		String IFSCcode = "SBI000122" ;
		System.out.println(super.IFSCcode);
		System.out.println(IFSCcode);
	}
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s instanceof RBI);
		System.out.println(s instanceof SBI);
		

	}

}
