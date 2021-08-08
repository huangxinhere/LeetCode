package LinkText;

public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> last;
    private int size;
    private int correct_count;

    public MyLinkedList(){
        head = new Node<E>();
        last = head;
        //size = 0;
    }

    public int getSize(){
        return size;
    }

    private Node<E> selectNode(int index){
        Node<E> node = head.getNext();
        for (int i=0;i<index;i++){
            node = node.getNext();
        }
        return node;
    }

    public E getE(int index){
        if (index < 0 || index > size - 1)
            return null;
        Node<E> node = selectNode(index);
        return node.getData();
    }

    /*增数据*/
    public void add(E e){
        Node<E> node = new Node<>(e);
        last.setNext(node);
        last = node;//该节点设为最后一个节点
        size++;
    }

    /*删除指定的节点e，并返回e数据*/
    public E delete(int index){
        if (index < 0 || index > size)
            return null;
        if (index == 0){
            //把下一个节点当成头节点
            Node<E> node = head.getNext();
            head.setNext(node.getNext());
            size--;
            return node.getData();
        }
        Node<E> aNode = selectNode(index - 1);
        Node<E> Node = aNode.getNext();
        Node<E> bNode = Node.getNext();

        aNode.setNext(bNode);//重置
        Node.setNext(null);//清空
        size--;
        return Node.getData();
    }

    public E renew(E x,int index){
        if (index < 0 || index > size || size == 0)
            return null;
        Node<E> tNode = new Node<>(x);
        Node<E> node = selectNode(index);
        node.setData(tNode.getData());
        return node.getData();
    }
}
