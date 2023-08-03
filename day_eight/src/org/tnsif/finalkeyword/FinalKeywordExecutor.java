package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		// f.SALARY = 84000f;
		f.print();
		
		Hp h = new Hp();
		h.display();
		h.display(h.PROCESSOR);
	}

}
