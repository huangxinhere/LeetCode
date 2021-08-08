package LinkText;

public class MyLinkedListText {
    private static String x;

    public static void main(String args[]){
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        for (int i=0; i < list.getSize(); i++){
            System.out.println("输出第"+i+":"+list.getE(i));
        }
        System.out.println();
        //
        System.out.println("测试删除");
        x = list.delete(0);
        System.out.println("删除了"+x);
        for (int i = 0; i <= list.getSize(); i++){
            System.out.println("输出第"+i+":"+list.getE(i));
        }
        //
        System.out.println();
        System.out.println("测试修改");
        list.renew("ohhhhh?", 2);
        for (int i = 0; i <= list.getSize(); i++){
            System.out.println("输出第"+i+":"+list.getE(i));
        }
        //
        System.out.println();
        System.out.println("测试查找");
        System.out.println("x="+list.getE(2));
    }
}
