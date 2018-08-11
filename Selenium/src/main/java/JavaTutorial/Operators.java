package JavaTutorial;

public class Operators {
	public static void main(String[] args) {
		//ArthimeticOperators
		int num1 = 100;
		int num2 = 50;
		int add=num1+num2;

		System.out.println("Addition of two numbers is "+ add);
		System.out.println("Subtraction of two numbers is "+ (num1 - num2));
		System.out.println("Multiplication of two numbers is "+ (num1 * num2));
		System.out.println("Division of two numbers is "+ (num1 / num2));
		System.out.println("Modulus of two numbers is "+ (num1 % num2));

		//AssignmentOperators
		// Assigning value of variable num2 to the variable num1
		num1 = num2;
		System.out.println("Output of num1 = num2 is "+ num1);

		// num1 = num1+num2
		num1 += num2;
		System.out.println("Output of num1 = num1+num2 is "+ num1);

		// num1 = num1-num2
		num1 -= num2;
		System.out.println("Output of num1 = num1-num2 is "+ num1);

		// num1 = num1*num2
		num1 *= num2;
		System.out.println("Output of num1 = num1*num2 is "+ num1);

		// num1 = num1/num2
		num1 /= num2;
		System.out.println("Output of num1 = num1/num2 is "+ num1);

		// num1 = num1%num2
		num1 %= num2;
		System.out.println("Output of num1 = num1%num2 is "+ num1);
		
		//AutoIncrementDecrementOperators	
		int num3 = 100;
		int num4 = 50;
		
		 // num1 = num1 + 1
		num3=num3++; 
		 // num2 = num2 - 1
		num4=num4--;
		 System.out.println("Output of num1 + 1 is "+ num3);
		 System.out.println("Output of num2 - 1 is "+ num4);
		 
		
		 
		 //LogicalOperators
		 boolean booleanVal1 = true;
		 boolean booleanVal2 = false;
		 
		 boolean logicalAND = booleanVal1&&booleanVal2;
		 
		 // && - AND
		 System.out.println("Output of AND is "+ logicalAND);
		 // || - OR
		 System.out.println("Output of OR is "+ (booleanVal1||booleanVal2));
		 // ! - NOT
		 System.out.println("Output of NOT is "+ (!booleanVal1));
		 
		 
		 
		 //RelationalOperators
		 int num5 = 100;
		 int num6 = 50;
		 
		 // if num1 is equal to num2 then it returns true
		 System.out.println("num1 == num2 = " + (num5 == num6) );
		 // if num1 is not equal to num2 then it returns true
		     System.out.println("num1 != num2 = " + (num5 != num6) );
		 // if num1 is greater than num2 then it returns true
		     System.out.println("num1 > num2 = " + (num5 > num6) );
		 // if num1 is less than num2 then it returns true
		     System.out.println("num1 < num2 = " + (num5 < num6) );
		 // if num1 is greater than or equal to num2 then it returns true
		     System.out.println("num1 >= num2 = " + (num5 >= num6) );
		 // if num1 is less than or equal to num2 then it returns true
		     System.out.println("num1 <= num2 = " + (num5 <= num6) );
		 
		 //BitwiseOperators

             	//128 64 32 16 8 4 2 1
int num7 = 11; // 0   0  0  0  1 0 1 1
int num8 = 21; // 0   0  0  1  0 1 0 1


/*Bitwise operator performs bit by bit processing.
num1 & num2 compares corresponding bits of num1 and num2 and generates 1 
if both bits are equal, else it returns 0. In our case it would return: 2 
which is 00000010 because in the binary form of num1 and num2 only second last bits are matching.*/
 
// 1 if both bits are equal else 0
 // 0  0  0 0 0 0 1 == output will be 1
System.out.println(num7 & num8);

/*num1 | num2 compares corresponding bits of num1 and num2 and generates 1 
if either bit is 1, else it returns 0. In our case it would return 31 which is 00011111*/

// 1 if either bit is 1 else 0
 // 0  0  1 1 1 1 1 == output will be 31
System.out.println(num7 | num8);


/*num1 ^ num2 compares corresponding bits of num1 and num2 and generates 1 
if they are not equal, else it returns 0. In our example it would return 29 which is equivalent to 00011101*/
// 1 if both are not equal else 0
 // 0  0  1 1 1 1 0 == output will be 30
System.out.println(num7 ^ num8);

/*~num1 is a complement operator that just changes the bit from 0 to 1 and 1 to 0. 
In our example it would return -12 which is signed 8 bit equivalent to 11110100*/

// 0 to 1 and 1 to 0   
 // 1  1  1 0 1 0 0 == output will be 1
System.out.println(~num7);


/*As 2's complement of any number we can calculate by inverting all 1s to 0's and vice-versa than we add 1 to it..
Here N= ~N produce results -(N+1) always. Because system store data in form of 2's complement which means it stores ~N like this.
~N = -(~(~N)+1) =-(N+1). */

/*num1 << 2 is left shift operator that moves the bits to the left, discards the far left bit, and assigns the rightmost bit a value of 0. 
In our case output is 44 which is equivalent to 00101100*/

 // 0  1  0 1 0 1 0 == output will be 1
System.out.println(num7 << 2);


/*Note: In the example below we are providing 2 at the right side of this shift operator 
that is the reason bits are moving two places to the left side. 
We can change this number and bits would be moved by the number of bits specified on the right side of the operator. 
Same applies to the right side operator.*/


/*num1 >> 2 is right shift operator that moves the bits to the right, discards the far right bit, and assigns the leftmost bit a value of 0. 
In our case output is 2 which is equivalent to 00000010*/
 // 0  0  0 1 0 1 0 == output will be 1
System.out.println(num7 >> 2);

	
	
	//TernaryOperators
	
	int num9 = 100;
	 int num10 = 50;
	 
	 /*Variable num1 = (expression) ? value if expression is true : value if expression is false*/
	 int val1=(num9>num10)?num9:num10;
	 System.out.println(val1);
	 
	 int val2=(num9<num10)?num9:num10;
	 System.out.println(val2);
	 
	}
}
