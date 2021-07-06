/**
 * 
 */
package com.Juint.demo.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author gimanjun
 *
 */
public class MathUtils {
public  int add(int a, int b)
{
  	return a+b;
}
public double computeArea(double radius)	
{
	return Math.PI* radius *radius;
	}

public int divide(int a,int b)
{
	return a/b;
}

public String subString(String x)
{
	if(x.contains("girish"))
	{
		x=x.replace("g", "x");
	}
	System.out.println("value is"+x);
return x;

}
static public void readConsole()
{
	
Scanner scan = new Scanner(System.in);

int i = scan.nextInt();
double d=scan.nextDouble();
scan.nextLine();
String s=scan.nextLine();

// Write your code here.

System.out.println("String: " + s);
System.out.println("Double: " + d);
System.out.println("Int: " + i);
scan.close();
}

static public  void listFinding()
{
	List<String>myList=Arrays.asList("girish","lokesh","lalah");
	List<String>myList1=new ArrayList<String>();
	//List<String>myList1=myList.stream().filter(girish->girish.contains("lalah")||girish.contains("lokesh")).collect(Collectors.toList());
	
	  for(int i=0;i<myList.size();i++) { if(myList.get(i).contains("lokesh")|| myList.get(i).contains("lalah")) {
	  myList1.add(myList.get(i)); }
	  
	  }
	 
	/*
	 * for(String girish:myList) { if(girish.contains("lalah") ||
	 * girish.contains("lokesh")) { myList1.add(girish); } }
	 */
System.out.println(myList1);
}

}



