# Assements-in-Java
These are some assessments of the National Taiwan University course in Java.  

1.guessNumber.java is a number-guessing game. The program first generates a secret number ranging between 0 and 99, inclusive. Then the program asks the player to guess a number. If the input value is equal to the secret number, then the player wins. If not, then update the range depending on the input accordingly. (For example, assume that the secret number is 42. If the player types 50 for the first time, then the program shows (0, 49) on the screen.) When there is only one integer left, the player loses the game. Also, make sure that the player types a number in the feasible range; otherwise, ask the user to redo the input.  
2.guessNumberAI.java is to use AI to guess a number in random. Also, calculate the winning rate by simulating AI program for 1e5 times.  
3.guessNumberOO.java is the object-oriented programming version of guessNumber.  

4.friendGroup.java is to find friend group
input N be the number of students, denoted by 0, 1, 2, ..., N − 1. First, implement an algorithm which generates a sequence of 0, 1, 2, ..., N − 1 in random order. Note that all elements in sequence are distinct. Then write an algorithm to determine the number of groups among students and also report the members of each group. For example, N = 16.  

5.sorting.java implement three sorting algorithms (bubble sort, selection sort, and insertion sort). then compare the efficiency of these three sorting algorithms together with Array.sort (check its API) by running Monte Carlo simulation for various sizes and benchmarking the time cost between algorithms.  

6.powerofNumber.java is to calculates x ^ n by recursion. NOT use Math.pow. Let x be any real number and n be any positive integer.  

7.Mynotebook.java is to create simple notebook window, can edit text and save a new file.  

8.Mymouse.java can trace mouse's poistion and click.  


9.Guess4number.java is to let user guess 4 numbers, if the positon and number are correct, it will show how many A, such as 4A0B. if only the number is included in the answer, it will show how many B, such as 0A4B.  