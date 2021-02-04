public class Main {
    public static void main(String [] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(56);
        linkedList.add(3);
        linkedList.add(2);

        System.out.println(linkedList);
//        linkedList = linkedList.reverse(linkedList.sentinel);
//        linkedList.sentinel = linkedList.reverse(linkedList.sentinel);
        linkedList.reverse();
        System.out.println(linkedList);
    }
}
