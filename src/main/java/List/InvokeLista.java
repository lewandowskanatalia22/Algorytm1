package List;

public class InvokeLista {
    public static void main(String[] args) {
        List list = new List();
        list.addToList(11);
        list.addToList(10);
        list.addToList(5);
        list.removeByValue(11);
        list.printQueue();
        list.reversePrintQueue();
    }
}