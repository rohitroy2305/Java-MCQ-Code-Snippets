public class Test3 extends Demo {
    final public void get(){
        System.out.println("a= "+a);
    }

    public static void main(String[] args) {
        Test3 obj = new Test3();
        obj.get();
    }
}

abstract class Demo{
    public int a;
    void demo(){
        a = 10;
    }
    abstract final public void get();
}

// Solution:
// There are 2 errors in this code:-
// 1. abstract and final keywords cannot be used together
// 2. The get method in Test3 cannot override the get method of Demo