/* Java Big Integer
In this problem you have to add and multiply huge numbers! 
These numbers are so big that you can't contain them in any ordinary data types like long integer.
Use the power of Java's BigInteger class and solve this problem.
Input Format
There will be two lines containing two numbers, a and b. The numbers are non-negative and can have maximum 
200 digits.
Output Format
Output two lines. The first line should contain a+b, and the second line should contain a×b. 
Don't print any leading zeros.
*/
package Integers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class BigIntegers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		System.out.println(a.add(b));
		System.out.println(a.multiply(b));

	}

}
