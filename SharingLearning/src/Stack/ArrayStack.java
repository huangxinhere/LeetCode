package Stack;

public class ArrayStack <Item>{
    //栈元素的总数——关键：N往上增再自下减
    private int N = 0;
    //存放栈元素的数组
    private Item[] items;

    public ArrayStack(int M){
        items = (Item[]) new Object[M];
    }

    public void push(Item item){
        if ( N <= items.length ) {
            items[N++] = item;
            //System.out.println(N);可看出N已经自增1了
        }
        else System.out.println("栈已满");
    }

    public Item pop(){
        if (isEmpty()) return null;
        Item i = items[N-1];
        items[N-1] = null;
        N--;
        return i;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public static void main(String args[]){
        ArrayStack<Integer> stack = new ArrayStack<>(5);

        for (int i=1;i<5;i++)
            stack.push(i);

        for (int i=1;i<5;i++){
            System.out.println(stack.pop());
        }
        System.out.println(stack.pop());

    }
}
