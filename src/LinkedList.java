import java.util.Arrays;

public class LinkedList<T>
{
    protected  LLNode<Integer> listLink;
    int range;
    int random;
    int count;

    public LinkedList()
    {
        listLink = null;
    }

    public void generateList(int num)
    {
        LLNode<Integer> holdList = new LLNode<>(num);
        holdList.setLink(listLink);
        listLink = holdList;
    }

    public void generateNums()
    {
        range = (20 - 1) + 1;

        for(int i = 1; i < 10; i++)
        {
            random = (int) (Math.random() * range) + 1;
            generateList(random);
            System.out.println("num = " + listLink.getInfo());
        }
    }

    public int printEvens(LLNode<Integer> list){
        count = 0;

        if(list == null)
        {
            return 0;
        }
        else if(list.info % 2 == 0)
        {
            count = 1;
            return count + printEvens(list.getLink());
        }
        else
        {
            return printEvens(list.getLink());
        }
    }

    public int numEvens(LLNode<Integer> list)
    {
        count = 0;

        if(list == null)
        {
            return 0;
        }
        else if(list.info % 2 == 0)
        {
            System.out.print(list.getInfo() + " ");
            count = 1;
            return count + numEvens(list.getLink());
        }
        else
        {
            return numEvens(list.getLink());
        }
    }

    public boolean contains(int target, LLNode<Integer> list)
    {
        if(list == null)
        {
            return false;
        }
        else if(list.info == target)
        {
            return true;
        }
        else {
            return contains(target, list.getLink());
        }
    }

    public void remove(int target, LLNode<Integer> list) {
        if (list == null) //If the list is null
            return; //Do nothing.
        else if (list.getInfo() == target) //If the first node value is target.
        {
            list = list.getLink(); //Bypass the first node.
            remove(target, list); //Call the remove() for remaining nodes.
            System.out.println("- Target " + target + " Removed!");
        }
        else {
            System.out.print(list.getInfo() + " ");
            remove(target, list.getLink());
        }
    }
}

