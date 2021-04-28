import java.util.HashMap;

public class HashTest {
    private int size;
    Student[] array = new Student[size];

    public static void main(String[] args){
        //HashTest hash = new HashTest(10);   //大概是哈希列表，自己创的？
        Student student1 = new Student(1,"张三");
        Student student2 = new Student(2,"李四");
        //hash.insert(student1)....
        //hash.disPlayTable();

    }
    private int hash(int key){
        return (key % size);
    }
    public void insert(Student student){
        int key = student.getKey();
        int hashVal = hash(key);

        while(array[hashVal] != null && array[hashVal].getKey() !=-1){
            ++hashVal;
            //如果超过数组大小，则从第一个开始找
            hashVal %= size;
        }
        array[hashVal] = student;
    }

}
class Student{
    int key;
    String name;

    public Student(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}