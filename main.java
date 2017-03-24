/**
 * @author Wyatt
 *    Created by Wyatt Baggett
 *    Software Engineer Student
 *    Version Final - 5.0
 */

/* DEV notes:
 * 1. I'm going to try to see if I can add some more to the println"" lines so
 * it looks a little bit better on the output screen. Because entering numbers
 * again and again doen't really make sense. - that worked nicely. (DONE)
 *
 * 2. Getting errors when inputting decimals into int values as expected. not
 * sure how to fix to a double without receiving more errors. (NOT SOLVED)
 *
 * 3. Going to start to make those edits I'm supposed to make, will report
 * back after I get those done. - FIXED
 * 
 * 4. Add Try statements to EVERY next.Int(); to a while loop or TRY statements
 *  - FIXED
 * 
 * 5. Added a 2d array not sure if it works properly and I can't really find
 * much online about how to do a 2d array search but I tried. - VISIT AGAIN
 * 
 * 6. I'm going to try to make the output look even more visually appealing
 * because as it is in v4.0 it just looks like a bunch of text across many
 * lines.
 */

/* Java Data Types
*  (From Oracle Docs)
*byte: Is an 8-bit signed two's complement integer. 
*The byte data type can be useful for saving memory, where the memory savings 
*actually matters. They can also be used in place of an int where their limits 
*help to clarify your code; the fact that a variable's range is limited can 
*serve as a form of documentation.
*
*short: The short data type is a 16-bit signed two's complement integer. 
*You can use it to save memory in large arrays, in situations where the memory 
*savings actually matters.
*
*int: By default, the data type is a 32-bit signed two's complement integer.
*
*long: The long data type is a 64-bit two's complement integer. This class 
*also contains methods to support arithmetic operations for unsigned long.
*
*float: The float data type is a single-precision 32-bit floating point. 
*This data type should never be used for precise values, such as currency.
*
*double: The double data type is a double-precision 64-bit floating point. 
*This data type should never be used for precise values, such as currency.
*
*boolean: The boolean data type has only two possible values: true and false.
*
*char: The char data type is a single 16-bit Unicode character.
*
*/

import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
* This does many things at once as a user fills out the information on 
* the screen. 
* @param args - Command line arguments
*/

public class main{

  public static void main(String[] args) {


//Start first example *********************************************************
	System.out.println("No input needed here just scroll down a bit.");
	
	getVolume();

//*****************************************************************************
	System.out.println("\n\nFinding the product of 2 numbers. ");
	
	boolean gottenGoodInput = false;
 	
	Scanner scanner = new Scanner(System.in);
 	double product = 0;
 	double firstNumber = 0;
 	double secondNumber = 0;
 	
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the 1st number: ");
 			firstNumber = scanner.nextDouble();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter a number.");
 			scanner.next();
 		}
 	}
 	
 	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the 2nd number: ");
 			secondNumber = scanner.nextDouble();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter a number.");
 			scanner.next();
 		}
 	}
 	
 	product = firstNumber * secondNumber;
 	
 //Multiplying 2 numbers

	System.out.println("The product of the two numbers is: " + (float)product);

//*****************************************************************************
	System.out.println("\n\nWe will now see if a number you enter is either "
			+ "odd or even. ");
	
	double oddOrEven = 0;
	
	gottenGoodInput = false;
	while (gottenGoodInput == false){ 	
		try {
			System.out.println("Enter a whole number: ");
			oddOrEven = scanner.nextDouble();
			gottenGoodInput = true;
		}
		catch (Exception ex){
			System.out.println("Incorrect input. Please enter an integer.");
			scanner.next();
		}
	}

//Even or Odd - End of Variable section

	int sum = (int)(oddOrEven % 2);

	if (sum == 0){
		System.out.println("Even");
	}

	else {
		System.out.println("Odd");
	}

//*****************************************************************************
	System.out.println("\n\nYou will now enter 2 numbers to add, subtract, "
			+ "multiply then divide below.");

	firstNumber = 0;
	secondNumber = 0;
	double addition;
	double subtraction;
	double multiplication;
	double division = 0;
	
	gottenGoodInput = false;
	while (gottenGoodInput == false){ 	
		try {
			System.out.print("Enter the first number: ");
			firstNumber = scanner.nextDouble();
			gottenGoodInput = true;
		}
		catch (Exception ex){
			System.out.println("Incorrect input. Please enter a number.");
			scanner.next();
		}
	}	
	
	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {			
			System.out.print("Enter the second number: ");
			secondNumber = scanner.nextDouble();
			gottenGoodInput = true;
 		}
 		catch (Exception ex){
			System.out.println("Incorrect input. Please enter a number.");
			scanner.next();
		}
 	}
 	
//Arithmetic Operators - Add,Sub,Dev,Mult

 	addition = firstNumber + secondNumber;
 	subtraction = firstNumber - secondNumber;
 	multiplication = firstNumber * secondNumber;

	try{
		division = (float)firstNumber/secondNumber;
	} 
	catch(ArithmeticException e){
		System.out.println("Error: You can't divide a number by zero");
	}
	
// Division - The devision of 2 integers will result in an integer and not 
// include the remainder if it is a decimal value. 
	
	System.out.println("\nThe result of adding is " + (float)addition
	+ "\nThe result of subtracting is " + (float)subtraction
	+ "\nThe result of multiplying is " + (float)multiplication
	+ "\nThe result of dividing is " + (float)division);

//*****************************************************************************
	System.out.println("\n\nWe will now find the square root and double "
			+ "square root of a number.");
	
	double squareRoot = 0;
	
	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter a number: ");
 			squareRoot = scanner.nextDouble();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
			System.out.println("Incorrect input. Please enter a number.");
			scanner.next();
		}
 	}
//Square Root of a number

	System.out.printf("\n" + "The Square Root is: " + "%.5f%n", 
			Math.sqrt(squareRoot));
	System.out.printf("The Double Square Root is: " + "%.5f%n", 
			Math.sqrt(Math.sqrt(squareRoot)));

//*****************************************************************************
	System.out.println("\n\nDegrees Celsius to degrees Fahrenheit.");

	double fahrenheit = 0;
	double celsius = 0; 

//Celsius to Fahrenheit
	
	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter a temperature in Celsius: ");
 			celsius = scanner.nextDouble();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter a number.");
 			scanner.next();
		}
	}
	
 	fahrenheit = (celsius * (1.8)) + 32;

	System.out.println("\nThe temperature in Fahrenheit is: " + 
 	(float)fahrenheit + " degrees.");

//*****************************************************************************
	System.out.println("\n\nEnter numbers below to see which number is "
			+ "larger.");

	firstNumber = 0;
	secondNumber = 0;
	int thirdNumber = 0;
	
	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the first integer: ");
 			firstNumber = scanner.nextInt();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter a whole "
 					+ "number.");
 			scanner.next();
		}
	}
 	
 	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the second integer: ");
 			secondNumber = scanner.nextInt();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter a whole "
 					+ "number. ");
 			scanner.next();
		}
	}
 	
 	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the third integer: ");
 			thirdNumber = scanner.nextInt();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter a whole "
 					+ "number.");
 			scanner.next();
		}
	}

//Which number is larger 1, 2 or 3

	if (firstNumber == secondNumber || firstNumber == thirdNumber || 
			secondNumber == thirdNumber){
		System.out.println("\nTwo or more entered numbers are equal.");
	}
	
	if (firstNumber >= secondNumber){
		System.out.println("\nThe First number is largest.");
	}
	
	else if(secondNumber >= thirdNumber){
	System.out.println("\nThe Second number is largest.");
	}
	
	else{
	System.out.println("\nThe Third number is largest.");
	}

//*****************************************************************************
	System.out.println("\n\nEnter a number below to get the floor and "
			+ "ceiling. ");
	
	double floorCeiling = 0;
	
	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter a number with a decimal: ");
 			floorCeiling = scanner.nextDouble();
 			gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter a number. ");
 			scanner.next();
		}
	}
 		
//Floor and Ceiling of a number
 	
	System.out.println("\nThe Ceiling of the number is " + 
	(int)Math.ceil(floorCeiling));
	System.out.println("The Floor of the number is " + 
	(int)Math.floor(floorCeiling));

//*****************************************************************************
	System.out.println("\n\nFind if 2 numbers are absolute values of each "
			+ "other.");

 	boolean absValue = false;
 	firstNumber = 0;
 	secondNumber = 0;
 	
 	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the 1st whole number: ");
 			firstNumber = scanner.nextInt();
 		 	gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter an integer.");
 			scanner.next();
		}
	}
 	
 	gottenGoodInput = false;
 	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the 2nd whole number: ");
 			secondNumber = scanner.nextInt();
 		 	gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter an integer.");
 			scanner.next();
		}
	}
 	
//Are 2 numbers equal or not

 	if (Math.abs(firstNumber) == Math.abs(secondNumber)){
 		absValue = true;
 	}

 	else{
 		absValue = false;
	}

 	System.out.println("Result is: " + absValue);

//*****************************************************************************	
 	System.out.println("\n\nFind the max/min numbers in an array.\n");
 
// Array - Max / Min
 	
 	int i;
 	sum = 0;   
 	int maxMinArray[]; 
 	int maxValue = 0;
 	int minValue = 0; 
 	
 	maxMinArray = new int[10];  
 	System.out.println("Enter 10 whole nubers: ");  
 	
 	for(i = 0; i < 10; i++){  
 		maxMinArray[i] = scanner.nextInt();  
 	    }
 	      	       
 	for (i = 0; i < maxMinArray.length; i++){
 		if (maxMinArray[i] > maxValue){
 			maxValue = maxMinArray[i];
 		}
 	}
 		
 	minValue = maxMinArray[0];
 	for ( i = 0; i < maxMinArray.length; i++){
		if (maxMinArray[i] < minValue){
			minValue = maxMinArray[i];
		}
 			
	}     
 	
 	System.out.println("the largest number is " + (maxValue)
 			+ " the smallest number is " + minValue);
//*****************************************************************************
 		
// Accumulator
 	getArraySum(maxMinArray);	
 	
//*****************************************************************************
    System.out.println("\n\nReports the color and area of a circle.");

// Classes  - area / color of a circle 
   
    sum = 0;  
    double circleRadius = 0;
    
    gottenGoodInput = false;
    while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter radius: ");
 		 	circleRadius = scanner.nextDouble();
 		 	gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter an integer.");
 			scanner.next();
		}
	}
    System.out.println("Enter the color: ");   
    String circleColor = scanner.next(); 
    
    MyCircle colorAreaCircle = new MyCircle(circleRadius, circleColor);
    
    System.out.println("The area is: " + (float)colorAreaCircle.getArea()); 
    System.out.println("The color is: " + colorAreaCircle.getColor()); 

//*****************************************************************************
    System.out.println("\n\nUsing an array list search for the "
    	+ "largest value.");
    
// ArrayList - Max / Min
    
    ArrayList<Integer> largestList = new ArrayList<Integer>();
	
	int size = 0;
	gottenGoodInput = false;
	maxValue = 0;
 	
	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter the number of integers that "
 					+ "will be inserted: ");
 		 	size = scanner.nextInt();
 		 	gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter an integer.");
 			scanner.next();
		}
	}
	
	System.out.println("Enter " + size + " integers into the ArrayList: ");
	
	while (size -- > 0) {
		largestList.add((int) scanner.nextDouble());
		Collections.sort(largestList);	
	}
	
	maxValue = 0;
	int maxIndex = 0;

	for(i = 0; i < largestList.size(); i++){
		
		if(largestList.get(i) > maxValue){
			maxValue = largestList.get(i);
			maxIndex = i;			
		}	
	}
	
	System.out.println("The largest value is " + maxValue + "; which is in "
			+ "slot " + maxIndex); 

//*****************************************************************************
	System.out.println("\n\nUse a 2D array to find a random value in the "
			+ "pre-set array of nubers.) ");
	
// 2d arrays - Multi Array
	
	int[][] multiArray = {
		{0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
		{55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181},
		{6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 
			514229}
	};
	
	int row = 0;
	int column = 0;
		
	gottenGoodInput = false;
	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter an integer for the row value: "
 					+ "(Max is 2)");
 		 	row = scanner.nextInt();
 		 	gottenGoodInput = true;
 		}
 		catch (Exception ex){
 			System.out.println("Incorrect input. Please enter an integer.");
 			scanner.next();
		}
	}
		
	gottenGoodInput = false;
	while (gottenGoodInput == false){ 	
 		try {
 			System.out.println("Enter an integer for the column value: "
 					+ "(Max is 9)");
 		 	column = scanner.nextInt();
 		 	gottenGoodInput = true;
 		}
    catch (Exception ex){
        System.out.println("Incorrect input. Please enter an integer.");
        scanner.next();
		}
	}
	
	int termFibbonacci = column + 1;
	
	System.out.println("the term " + multiArray[row][column] + " is the "+ 
	row + termFibbonacci + " number term in the Fibonacci Sequence.");
	
	
//	for (int row = 0; row < multiArray.length; row++){
//		for(int column = 0; column < multiArray[row].length; column++){
//			System.out.println(multiArray[row][column] + "\t");
//		}
//	}
	
//*****************************************************************************
	System.out.println("\n\nAgain no input needed here.\n");
// Poly
	
	MyBox boxThreeValues = new MyBox(10, 20, 15);
	MyBox boxNoValues = new MyBox();
	MyBox cubeOneValue = new MyBox(7);

	int myBoxvolume;
	myBoxvolume = boxThreeValues.volume();
	System.out.println("Volume of mybox1 is " + myBoxvolume);

	myBoxvolume = boxNoValues.volume();
	System.out.println("Volume of mybox2 is " + myBoxvolume);

	myBoxvolume = cubeOneValue.volume();
	System.out.println("Volume of mycube is " + myBoxvolume);

//*****************************************************************************	
	System.out.println("\nInheritance shows us that a Cat and a Dog are both "
			+ "Animals but they each make different noises.\n");
// Inheritance

	Animal animal = new Animal();
	Cat cat = new Cat();
	Dog dog = new Dog();
	
	System.out.println();
	
	animal.makeNoise();
	cat.makeNoise();
	dog.makeNoise();

//*****************************************************************************	
	
// String processing
	
	String procString = "Processing";
	
	System.out.println("\nThere are " + procString.length()+ " letters in the "
			+ "word Processing and " + procString.indexOf('s') 
			+ " is the position of the first s. ");
	
//*****************************************************************************
	String[] searchArray = new String[] {"D", "B", "C", "A", "E", "G", "P", "O"};

//	Searching an array
	boolean valueFound = false;
	
	System.out.println("\n\nWe'll look for the letter E in an array. ");
	
	for (String e : searchArray){
    if (e == "E"){
      valueFound = true;
    }
  }
	
	if (valueFound = true){
    System.out.println("\nThe value was found. ");
  }
	
	else if (valueFound = false){
    System.out.println("The value was not found. ");
  }

//*****************************************************************************	
	
//end
 	System.out.println("\n\n\nThanks for playing... Goodbye.");
	}
	
/**
 * Calls the method getVolume and returns the values calculated in this
 * method.
 * Once calculation is complete, the program resumes after the call.
 * 
 * @return getVolume - volume of an object
 */
	private static void getVolume() {
		
    int first = 63;
    double second = 45.0;
    double third = 67.675586;

	/* Declaring Variables
	 *  * A variable is a place in memory that stores a value
	 */

	 	System.out.println("\nThe value of first variable is " + first
	 	+ "\nThe value of second variable is " + second
	 	+ "\nThe value of third variable is " + third);
	}
 
/**
 * Calls the method getArraySum and returns the values calculated in this
 * method.
 * Once calculation is complete, the program resumes after the call.
 * 
 * @return getArraySum - sum of an array
 */
	public static void getArraySum(int[] maxMinArray){
 		
 		Scanner scanner = new Scanner(System.in);
	 	int sum = 0;
		int accumulatorArray[] = maxMinArray;
		 	
	 	for (int i = 0; i < 10; i++){
	 		sum += accumulatorArray[i];
	 	}
	 	
 	System.out.println("The sum of the 10 number array you just entered is: "
 			+ sum);
 	}
}

/**
 * Returns the Radius and color of myCircle.
 * 
 * @version MyCircle - circle calculations
 */
class MyCircle{
	private double radius;
	private String color;

	public MyCircle(double circleRadius, String circleColor) {
		this.radius = circleRadius;
		this.color = circleColor;
	}

	public void setRadius(double circleRadius){
		radius = circleRadius;
	}

	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return (Math.PI * (Math.pow(getRadius(), 2)));
	}

	public void setColor(String circleColor){
		color = circleColor;
	}
	
	public String getColor(){
		return color;
	}

}
/**
 * Returns the volume of an overloading variable = volume. 
 * 
 * @version MyBox - box calculations
 */

class MyBox {
	int width;
	int height;
	int depth;
	    
	public MyBox(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}

	public MyBox() {
		width = 1;
		height = 1;
		depth = -1;
	}

	public MyBox(int w) {
		width = w;
		height = w;
		depth = w;
	}

	int volume() {
		return width * height * depth;
  }

}

/**
 * Assigns noises and data to an animal.
 * 
 * @version Animal - animal noises etc.
 */
class Animal {
	public Animal() {
		System.out.println("I'm an animal. ");
	}
	
	public void makeNoise(){
		System.out.println("*All kinds of animal noises* ");
	}
}

/**
 * Assigns noises and data to a Cat but inherits from Animal and overrides 
 * makeNoise.
 * 
 * @version Cat - cat noises
 */
class Cat extends Animal{
	public Cat() {
	super();
		System.out.println("That animal is a cat. ");
	}
	
	@Override
	public void makeNoise(){
		System.out.println("*Meow* ");
	}
}	

/**
 * Assigns noises and data to a Dog but inherits from Animalnd overrides 
 * makeNoise.
 * 
 * @version Dog - dog noises
 */
class Dog extends Animal{
	public Dog() {
		super();
		System.out.println("This animal is a Dog. ");
	}
	
	@Override
	public void makeNoise(){
		System.out.println("*Woof* ");
	}
}
