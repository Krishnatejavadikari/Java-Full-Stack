class A					//increasing scope of the access modifer like 1.public 2.protected 3.<default> 4.private
{
	void m1()
	{
		System.out.println("in m1 of A");
	}
	void m2()
	{
		System.out.println("in m2 of A");
	}
}
class B extends A
{
	public void m2()
	{
		System.out.println("in m2 of B");
	}
	public void m3()
	{
		System.out.println("in m3 of B");
	}
}
class Test42
{
	public static void main(String[] args)
	{
		B b1=new B();
		System.out.println(b1);
		b1.m1();
		b1.m2();
		b1.m3();
	}
}

