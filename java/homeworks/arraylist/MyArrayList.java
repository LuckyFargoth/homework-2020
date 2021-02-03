package homeworks.arraylist;



public class MyArrayList {
    private final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;
    //TODO tests

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
        if (realSize == 0) {
            return true;
        }
        return false;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public void add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[3 * realSize / 2 + 1];
            System.arraycopy(array, 0, resArray, 0, realSize);
            array = resArray;
        }
        array[realSize++] = o;
    }

    public boolean remove(Object o) {
        Object[] resArray = new Object[array.length];
        int removeIndex = realSize;
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                removeIndex = i;
                break;
            }
            resArray[i] = array[i];
        }

        if (removeIndex == realSize) return false;

        if (realSize - removeIndex >= 0)
            System.arraycopy(array, removeIndex + 1, resArray, removeIndex, realSize - removeIndex);

        array = resArray;
        realSize--;
        return true;
    }

    public void clear() {
        realSize = 0;
    }

    private void checkIndex(int index) {
        if ((index < 0) || (index > realSize)) {
            throw new IndexOutOfBoundsException("Index" + index + " out of bound " + realSize);
        }
    }

    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    public Object set(int index, Object element) {
        checkIndex(index);
        for (int i = 0; i < realSize; i++) {
            if (i == index) {
                array[i] = element;
            }
        }
        return array;
 }

    public void add(int index, Object element) {
        checkIndex(index);
        Object[] resArray = new Object[array.length + 1];
            System.arraycopy(array, 0, resArray, 0, index);
            resArray[index] = element;
            System.arraycopy(array, index, resArray, index + 1, realSize - index);
            array = resArray;
            realSize++;

    }

    public Object remove(int index) {
        checkIndex(index);
        Object[] resArray = new Object[array.length];
        System.arraycopy(array, 0, resArray, 0, index);
        if (index == realSize) return false;

        for (int i = index; i < realSize; i++) {
            resArray[i] = array[i + 1];
        }

        array = resArray;
        realSize--;
        return true;

    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            result = result.append(array[i]).append(" ");
        }

        result.append('}');

        return result.toString();
    }
}