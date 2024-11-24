blic static void moreParameters(int a, int b)
	{	System.out.println("in method moreParameters. a: " + a + " b: " + b);
		a = a * b;
		b = 12;
		System.out.println("in method moreParameters. a: " + a + " b: " + b);
		falseSwap(b,a);
		System.out.println("in method moreParameters. a: " + a + " b: " + b);	
	}
}