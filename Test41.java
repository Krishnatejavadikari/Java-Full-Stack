class A
{
	String msg;
	A(String msg)
	{
		this.msg=msg;
}
public String toString()
	{
	return msg;
	}
}
class Test41
{
	public static void main(String[] args)
	{
		A a1=new A("krishna");
		System.out.println(a1);
		A a2=new A("java");
		System.out.println(a2);
		A a3=new A("python");
		System.out.println(a3);
	}
}