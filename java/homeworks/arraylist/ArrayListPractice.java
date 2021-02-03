package homeworks.arraylist;

public class ArrayListPractice {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        System.out.println("MyArrayList.size() = " + myArrayList.size());
        myArrayList.add("str1");
        myArrayList.add("str2");
        myArrayList.add("str3");
        myArrayList.add("str4");

        System.out.println(myArrayList);
        myArrayList.remove("str1");
        System.out.println(myArrayList);
        myArrayList.remove(1);
        System.out.println(myArrayList);
        myArrayList.add(0, "str33");
        System.out.println(myArrayList);
        myArrayList.set(2, "testStr");
        System.out.println(myArrayList);

// System.out.println("myArrayList.get(8) = " + myArrayList.get(8));

    }
}