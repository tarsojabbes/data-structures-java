package LinkedList.Questions;

public class SumLists {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.create(7);
        l1.insert(1, 1);
        l1.insert(6, 2);

        LinkedList l2 = new LinkedList();
        l2.create(5);
        l2.insert(9, 1);
        l2.insert(2, 2);

        sumLists(l1, l2);
   
    }

    public static void sumLists(LinkedList l1, LinkedList l2){

        double firstSum = findReverseSum(l1);
        double secondSum = findReverseSum(l2);

        double finalSum = firstSum + secondSum;

        int firstElement = (int) (finalSum%10);

        LinkedList newLinkedList = new LinkedList();
        newLinkedList.create(firstElement);

        int remaining = (int) ((finalSum - firstElement)/10);

        for (int i = 1; i <= 2; i++){
            int value = (int) remaining%10;
            newLinkedList.insert(value, i);
            remaining = (remaining - value)/10;
        }

        newLinkedList.traversal();

    }

    public static double findReverseSum(LinkedList linkedList){
        Node tempNode = linkedList.head;
        double reverseSum = 0;

        for (int i = 0; i < linkedList.size; i++){
            double sum = tempNode.value * Math.pow(10, i);
            reverseSum += sum;
            tempNode = tempNode.next;
        }

        return reverseSum;
    }
}
