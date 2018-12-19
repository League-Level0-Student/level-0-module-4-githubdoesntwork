package charAt_scanners_optionDialogs;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
String yeetyeetyeetyeet="Who will believe my verse in time to come," + 
		"If it were fill'd with your most high deserts?" + 
		"Though yet, heaven knows, it is but as a tomb" + 
		"Which hides your life and shows not half your parts." + 
		"If I could write the beauty of your eyes " + 
		"And in fresh numbers number all your graces," + 
		"The age to come would say 'This poet lies:" + 
		"Such heavenly touches ne'er touch'd earthly faces.'" + 
		"So should my papers yellow'd with their age" + 
		"Be scorn'd like old men of less truth than tongue, " + 
		"And your true rights be term'd a poet's rage" + 
		"And stretched metre of an antique song:" + 
		"    But were some child of yours alive that time" + 
		"    You should live twice; in it and in my rhyme.";
		// 1. Create a String variable and initialize it to whatever you want

		// 2. Print the 3rd char of your String to the console.
String whatletter= "'";
		//    HINT: .charAt
		// 3. Print the length of your String to the console.
		//    HINT: .length()
System.out.println(yeetyeetyeetyeet.length());
for(int i=0;i<yeetyeetyeetyeet.length(); i++) {
	if((yeetyeetyeetyeet.charAt(i)+"").equalsIgnoreCase(whatletter)) {
		System.out.println("the letter "+whatletter+" is in the position "+(i)+".");
	}
}
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


