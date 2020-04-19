# :computer: Simple Java Projects
![Eclipse](https://img.shields.io/badge/Eclipse%20IDE-2019--12%20(4.14.0)-blue)
![Java](https://img.shields.io/badge/JRE-1.8.0__231--b11-yellow)
### Collection created at the beginning of my Java learning journey :books:
They help me gain familiarity with the language`s core concepts and syntax and served as an introduction to the use of Eclipse.

***I strongly disencourage you to copy these projects and pass them as your own assignments.*** :roll_eyes:

On the other hand I would not mind at all if you use my solutions as inspiration to make you own improvements 
or to develop your own project ideas. :wink:

### Table of Contents
1. [ComplexNumbers](https://github.com/TeresaCristina/java-simple-projects/tree/master/ComplexNumbers)
2. [CreditCardNumber](https://github.com/TeresaCristina/java-simple-projects/tree/master/CreditCardNumber)
3. [GeometricObject](https://github.com/TeresaCristina/java-simple-projects/tree/master/GeometricObject)
4. [GetLoan](https://github.com/TeresaCristina/java-simple-projects/tree/master/GetLoan)
5. [HangMan](https://github.com/TeresaCristina/java-simple-projects/tree/master/HangMan)
6. [MatrixBigNumber](https://github.com/TeresaCristina/java-simple-projects/tree/master/MatrixBigNumber)
7. [RandomArray](https://github.com/TeresaCristina/java-simple-projects/tree/master/RandomArray)
8. [RockPaperScissor](https://github.com/TeresaCristina/java-simple-projects/tree/master/RockPaperScissor)
9. [WeekDay](https://github.com/TeresaCristina/java-simple-projects/tree/master/WeekDay)

### 1. ComplexNumbers 
Basic Math Operations using [Complex Numbers](https://en.wikipedia.org/wiki/Luhn_algorithm).

- MathOperations : Interface;
- Complex Numbers : algorithm for sum, subtraction, multiplication, division;
- GetInput : generates a string with the user input;
- Utilities : static method that tranforms a String array into a Double array;

**Keywords:** _Scanner Class , Basic Mathematical Operations , Block Try/Catch , One-Dimensional Array , Loops , Abstract Class , Overloading_ 

### 2. CreditCardNumber :credit_card:
Validates a credit card number using the [Luhn algorithm](https://en.wikipedia.org/wiki/Luhn_algorithm).

- AllocateNumber : collects user input;
- CreditCard : Luhn algorithm;

**Keywords:** _Scanner Class , Basic Mathematical Operations , Long Int , One-Dimensional Array , Loops_ 

### 3. GeometricObject
Creates a [Triangle](https://www.google.com/search?rlz=1C1CHBF_enCA864CA864&sxsrf=ALeKk02ieTj4asVV2s-ufio9SiOhbE0Rng%3A1587257029965&ei=xZ6bXuG0Opj0tAb2-ojIAw&q=triangle+area&oq=triangle+area&gs_lcp=CgZwc3ktYWIQAzIECCMQJzIECCMQJzIFCAAQkQIyAggAMgIIADICCAAyAggAMgIIADIHCAAQFBCHAjICCAA6BAgAEEc6BwgjELACECc6BAgAEA06BggAEBYQHjoHCCMQ6gIQJzoFCAAQgwE6BAgAEEM6BwgAEIMBEEM6BAgAEApQ4XJYl5oBYKacAWgBcAJ4BIABqAGIAcYRkgEEMTQuOJgBAKABAaoBB2d3cy13aXqwAQo&sclient=psy-ab&ved=0ahUKEwihq8CbofPoAhUYOs0KHXY9AjkQ4dUDCAw&uact=5) using Inheritance.

- GeometricObject : parent Class;
- Triangle : child Class;
- GetInput : processes user input;

**Keywords:**_Scanner Class , Basic Mathematical Operations , Loops , Inheritance_ 

### 4. GetLoan :moneybag:
Calculates [loan payments](https://www.thebalance.com/loan-payment-calculations-315564). The user inputs Amount, Timespan and a Interest Rate.

- GetLoan : validates user input and gives the output;
- GetInput : checks if user input is a number;
- SpecialNumber : calculates monthly payment;

**Keywords:**_Scanner Class , Basic Mathematical Operations , Loops_ 

### 5.HangMan :raising_hand_man:
Play [Hang-Man](https://hangmanwordgame.com/) with the computer. Simple version that uses an array with five words.

- HangMan : plays the game;
- Output : static method that transforms a char Array in a String;
- GetInput : checks if the user input is a letter;

_Scanner Class , One-Dimensional Array , Random Class , Pattern , Regex , Loops_  

### 6.MatrixBigNumber :hash:
Creates a [matrix](https://courses.lumenlearning.com/boundless-algebra/chapter/introduction-to-matrices/) using user input for dimensions and to fill it with integers. Finds the location of the higher number.

- BigNumber : fills the matrix with user input;
- BuildMatrix : creates a matrix and finds its higher number;
- GetOutput : static method that outputs one row from the matrix;
- GetInput : static method that checks if the user input is an integer;

_Scanner Class , One-Dimensional Array , Two-Dimensional Array , Block Try/Catch , Loops_ 

### 7.RandomArray
Generates a random [One-Dimensional Array](https://en.wikipedia.org/wiki/Array_data_structure) of integers. 

- RandomIntArray : generates an array filled with integers;
- RandomInteger : generates a random integer; 
- GetInput : generates a string with user input;
- Utilities : static method that tranforms stringo to intege;r

_Scanner Class , Random Class , One-Dimensional Array , Block try/Catch, Loops_ 

### 8.RockPaperScissor :scissors:
Play [Rock-Paper-Scissor](https://en.wikipedia.org/wiki/Rock_paper_scissors) with the computer.

- RockPaperScissor : plays the game;
- Getinput : checks if user input is an integer;

_Scanner Class , Random Class , One-Dimensional Array , Loops_ 

### 9.WeekDay :calendar:
Finds out the weekday of an specific calendar day using the [Zeller algorithm](https://en.wikipedia.org/wiki/Zeller%27s_congruence).

- WeekDay : validates user input for a valid calendary day;
- SpecialNumber : Zeller algorithm;
- GetInput : checks if user input is a valid integer;

_Scanner Class , One-Dimensional Array , Basic Mathematical Operations , Loops_ 




