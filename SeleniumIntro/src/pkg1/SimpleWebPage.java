package pkg1;

import java.util.Scanner;

public class SimpleWebPage
{
public static void main(String[] args) {
	
	for(int i=1;i<=5;i++)  // loop for rows i---2
	{
		for(int j=1;j<=i;j++) // 1 to 2
		{
			System.out.print("*"); // 2 star
		}
		System.out.println(); // will move cursor to next line
	}
}	

}
