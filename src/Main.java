import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    list.add(10);
    list.add(15);
    list.add(16);
    list.add(20);

    System.out.println(list);
    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    list.remove(1);
    System.out.println(list);
  }
}