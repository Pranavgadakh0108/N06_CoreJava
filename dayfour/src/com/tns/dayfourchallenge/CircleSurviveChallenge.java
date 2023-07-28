
/* There are N people standing in a circle waiting to be killed.
 * The counting out begins at some point in the circle and proceeds around the circle in a fix direction.
 * in each state a certain no. of peoples are Skipped and the next person is executing.
 * the elimination proceeds around the circle(which is becoming smaller and smaller as executed peoples are removed),
 * until only the last person remains, who is given freedom.
 * given the total no. of person N and a number K which indicates that K-1 person skipped and the Kth person 
 * killed in a circle
 * the task is to choose a person in the initial circle who survived
 * assume N=5, k=2*/

package com.tns.dayfourchallenge;

import java.util.Scanner;

public class CircleSurviveChallenge {
	
	static int survive(int n, int k)
	{
		if(n==1)
			return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Value for n: ");
		int n=s.nextInt();
		System.out.println("Enter a Value for k: ");
		int k=s.nextInt();
		
		System.out.println(survive(n,k));
	}

}
