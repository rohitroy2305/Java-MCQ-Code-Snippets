public class mainclass {
    public static void main(String[] args) {
        Box obj1 = new Box();
        Box obj2 = new Box();
        obj1.height = 1;
        obj1. length = 2;
        obj1.width = 1;
        obj2 = obj1;
        System.out.println(obj2.height);
        //System.out.println(obj1);
        //System.out.println(obj2);
    }

}
class Box{
    int height,width,length;
}

// Solution:
// Output : 1
// Added the last 2 statements to check address of obj1 and obj2
// Both refer to same location
