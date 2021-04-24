package Stack;

import org.w3c.dom.Node;

import java.util.Scanner;

public class LinkedListStack<Item> {
/*用链表实现栈：链表——类.实例（指针）*/
    private int N = 0;
    //链表头元素
    private Node front;
    //内部结点类
    private class Node{
        Item item;
        Node next;
    }

    public void push(Item item){
/*两步：最上层放data（item）；next指向旧的结点*/
        Node oldFront = front;
        //向链表头部插入新的结点
        front = new Node();
        //传入的item给新结点
        front.item = item;
        front.next = oldFront;
        N++;
    }

    public Item pop(){
/*与上面反之*/
        if (isEmpty()) return null;
        Item item = front.item;
        front = front.next;
        N--;
        return item;
    }

    public boolean isEmpty() {
        return N==0;
    }
    public int size(){
        return N;
    }

    public static void main(String args[]){
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i=1;i<5;i++)
            stack.push(i);
        for (int i=1;i<5;i++)
            System.out.println(stack.pop());

        System.out.println("Please input the num:");
        LinkedListStack stack1 = new LinkedListStack();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Please input the changeToNumber you want:");
        int d = in.nextInt();
        while (num != 0){
            stack1.push(num%d);
            num = num/d;
        }
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
    }


}
