/*4-write a programe which will perfom arithmetic operation and display the value
	of it.
	take input of number using command line arguments.*/

class prac4_358
{
	public static void main(String args[])
	{
		int a,b;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("Addition of:"+a+"+"+b+"="+(a+b));
		System.out.println("Subtraction of:"+a+"-"+b+"="+(a-b));
		System.out.println("Multiplication of:"+a+"*"+b+"="+(a*b));
		System.out.println("Division of:"+a+"/"+b+"="+(a/b));

	}
}