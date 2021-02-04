public class Main {
    public static void main(String [] args){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        System.out.println(linkedList);
        linkedList1 = linkedList.reverse();
        System.out.println(linkedList1);
    }
}
