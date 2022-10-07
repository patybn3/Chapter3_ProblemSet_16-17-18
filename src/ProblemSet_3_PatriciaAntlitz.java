public class ProblemSet_3_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        LinkedList newList = new LinkedList();
        int random = (int) (Math.random() * (20 - 1)) + 1;

        newList.generateNums();
        System.out.println("\nEven Numbers:");
        newList.numEvens(newList.listLink);
        System.out.println("\nTotal Even Numbers: " + newList.printEvens(newList.listLink));
        System.out.println("\nTarget = " + random);

        if(newList.contains(random, newList.listLink)){
            System.out.println("Target Found!");
            newList.contains(random, newList.listLink);
        }
        else{
            System.out.println("Target Not Found!");
        }
        System.out.println("Final List: ");
        newList.remove(random, newList.listLink);
    }
}
