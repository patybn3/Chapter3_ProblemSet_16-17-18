public class LinkedList
{
    protected  LLNode<Integer> listLink;

    public LinkedList()
    {
        listLink = null;
    }

    public void generateList(int num)
    {
        LLNode holdList = new LLNode<>(num);
        holdList.setLink(listLink);
        listLink = holdList;
    }

    public void generateNums()
    {
        for(int i = 0; i <= 20; i++)
        {
            generateList(i);
            System.out.println("num= " + i + " " + listLink.getInfo());
        }
    }

    public int numEvens(LLNode<Integer> list)
    {
//        int numCount = 0;

        if(list == null)
        {
            return 0;
        }
        int numCount = 0;
        if(list.info % 2 == 0)
        {
            numCount++;
            System.out.print(numCount + numEvens(list.getLink()) + " ");

        }
        return numCount + numEvens(list.getLink());

    }

    public void recursiveNums(int target, LLNode<Integer> list)
    {

    }

    public void removeNums(int target, LLNode<Integer> list)
    {

    }

    public void display()
    {
        LLNode item = listLink;

        while(item != null)
        {
            System.out.print(item.info + ", ");
        }
        System.out.println();
    }
}

