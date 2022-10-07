<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 3 - Exercise 16, 17, 18</h5>

####variables used:

```java
        LLNode listLink //as Integer;
        int count;      //used to count even numbers
        int random;     //used to hold a random number generated 
        int range;      //holds the total calculation of the range of the random number generator
        Math.random     //used to generate the random number
    
```

###Requirements:

16. Write a recursive method `numEvens(LLNode<Integer> list)` that returns
    how many even numbers are contained in list. For our example list
    numEvens(values) would return 5 (the even numbers are 6, 6, 12, 18, and 20).<br><br>
    
    A new file was created:<br>
    `LinkedList.java`<br>
    
    This is the setup:
```java
public class LinkedList<T>
{
    //node list
    protected  LLNode<Integer> listLink;
    
    //initiates list to null
    public LinkedList();
    
    //insert generated numbers into list
    public void generateList(int num);

    //generate the 10 random numbers
    public void generateNums();

```



Then the required method was created:
    
```java
    public int numEvens(LLNode<Integer> list);    //this will check the numbers that are even and print how many numbers are
```

Another method was created, to print each even number individually (not required):
```java
    public int printEvens(LLNode<Integer> list)
```


17. Write a recursive method `contains(int target, LLNode<Integer> list)`
    that returns true if list contains target and false otherwise. For our example
    list contains(15, values) would `return true` while contains(10, values)
    would `return false`.<br>
```java
    public boolean contains(int target, LLNode<Integer> list)    //will get a target number randomly generated and check if that number exist on the list
```
18. Write a recursive method `remove(int target, LLNode<Integer> list)`
    that removes all occurrences of target from list and returns a reference to the
    new list. For our example list the statement
    values = remove(6, values);
    would result in values referencing the list containing 3 9 12 15 18 19 19 and
    20, If target is not contained in list then the list remains unchanged.
```java
    public void remove(int target, LLNode<Integer> list)      
```

###Main class: ProblemSet_#_PatriciaAntlitz.java

- all calls are made from the main method.

<hr>
<h5>Problems:</h5>
I had problems with the numEvens method. I couldn't make it work and had to look for sources:

https://www.geeksforgeeks.org/find-length-of-a-linked-list-iterative-and-recursive/

https://www.cs.cmu.edu/~pattis/15-1XX/15-200/lectures/llrecursion/index.html


<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the ProblemsSet_3_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../ProblemsSet_3_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac ProblemsSet_3_PatriciaAntlitz.java => compile
    * java ProblemsSet_3_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)