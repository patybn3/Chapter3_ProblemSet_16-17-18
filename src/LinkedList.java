import java.util.Arrays;

public class LinkedList<T>
{
    //node list
    protected  LLNode<Integer> listLink;
    //I prefer to pass variables as global
    int range;
    int random;
    int count;

    //initiate node list
    public LinkedList()
    {
        listLink = null;
    }

    //method used to insert each number generate into the node list
    public void generateList(int num)
    {
        LLNode<Integer> holdList = new LLNode<>(num);
        holdList.setLink(listLink);
        listLink = holdList;
    }

    //generate the 10 random numbers
    public void generateNums()
    {
        //the range will be between "1-20"
        range = (20 - 1) + 1;

        for(int i = 1; i < 10; i++)
        {
            random = (int) (Math.random() * range) + 1;
            //calls the method that inserts, passing each individual random number
            generateList(random);
            System.out.println("num = " + listLink.getInfo());
        }
    }
    //this method checks how many even numbers the list has
    public int numEvens(LLNode<Integer> list)
    {
        if(list == null)
        {
            return 0;
        }
        else if(list.info % 2 == 0) //if the number evenly divides by 2 (no remainder)
        {
            count = 1;
            //will return the total count
            return count + printEvens(list.getLink());
        }
        else
        {
            //if not, it won't count
            return printEvens(list.getLink());
        }
    }
    //printEvens is not a required, but its here in order to test the total number of even numbers given by the previous
    //method (without having to manually count it).
    public int printEvens(LLNode<Integer> list)
    {
        if(list == null)
        {
            return 0;
        }
        else if(list.info % 2 == 0) //if the number evenly divides by 2 (no remainder)
        {
            //this will print each number that is even
            System.out.print(list.getInfo() + " ");
            count = 1;
            return count + numEvens(list.getLink());
        }
        else
        {
            return numEvens(list.getLink());
        }
    }
    //target is a parameter passed in the main method as a random number
    public boolean contains(int target, LLNode<Integer> list)
    {
        if(list == null)
        {
            return false;
        }
        else if(list.info == target) //if the target given is present in the list
        {
            return true;
        }
        else {
            return contains(target, list.getLink());
        }
    }

    public void remove(int target, LLNode<Integer> list) {
        if(list == null)
        {
            return;
        }
        else if(list.getInfo() == target) //if the target is present in the lsit
        {
            list = list.getLink();
            remove(target, list);
            //prints the numbers removed
            System.out.println(" -> # " + target + " Removed ");
        }
        else {
            //prints the final list
            System.out.print(list.getInfo() + " ");
            remove(target, list.getLink());
        }
    }
}

