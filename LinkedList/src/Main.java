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
        linkedList.reverse();
        System.out.println(linkedList);
        TwoWayLinkedListWithHead<Integer> twoWayLinkedListWithHead = new TwoWayLinkedListWithHead<>();
        twoWayLinkedListWithHead.add(45);
        twoWayLinkedListWithHead.add(44);
        twoWayLinkedListWithHead.add(43);
        twoWayLinkedListWithHead.add(42);
        twoWayLinkedListWithHead.add(41);
        twoWayLinkedListWithHead.add(40);
        System.out.println(twoWayLinkedListWithHead);
        twoWayLinkedListWithHead.toStringReverse();
        System.out.println(twoWayLinkedListWithHead.toStringReverse());
        TwoWayLinkedListWithHead<Integer> twoWayLinkedListWithHead1 = new TwoWayLinkedListWithHead<>();
        twoWayLinkedListWithHead1.add(4);
        twoWayLinkedListWithHead1.add(5);
        twoWayLinkedListWithHead1.add(6);
        twoWayLinkedListWithHead1.add(7);
        twoWayLinkedListWithHead1.add(8);
        twoWayLinkedListWithHead1.add(9);
        twoWayLinkedListWithHead1.add(10);
        twoWayLinkedListWithHead.add(twoWayLinkedListWithHead1);
        System.out.println(twoWayLinkedListWithHead);

    }
}
