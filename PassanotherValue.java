/*******************
Name: Matas Backevicius 

Date: Apr 21, 2021

Notes: Here we pass the argument in this PassValue method/class.
 And we pass the arguemnt or the method by printing the strings variable and its value.
*******************/

public class PassValue           /* name of our method 'passvalue'*/
{
public static void main(String[] args)      /* here we pass the method 
                           with the pass of a'sub string variable' and an 'int variable' */
{
sub ("1. watermelon        2. Mango        3. Guava         4. Dragonfruit.",  7371);
}
public static void sub(String favoritefruit, int s)
{
System.out.println("the last four of my social: "+ s + " and my top 4 (favorite fruits): " + favoritefruit);
}
}           /* and once the argument is passed and printed,
       it contains the argument in our method which is the 'sub string variable' */