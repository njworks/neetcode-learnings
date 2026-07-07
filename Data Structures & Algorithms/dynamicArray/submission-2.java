class DynamicArray {
    private Integer[] array;
    private int size = 0;

    public DynamicArray(int capacity) {
        array = new Integer[capacity];
    }

    public int get(int i) {
        if(array[i] == null) {
            return 0;
        }

        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == array.length) {
            resize();
        }

        array[size] = n;
        size++;
    }

    public int popback() {
        int lastValue = array[size - 1];
        array[size - 1] = null;
        size--;

        return lastValue;
    }

    private void resize() {
        int doubleSize = array.length * 2;
        Integer[] doubleSizedArray = new Integer[doubleSize];
        
        for(int i = 0; i < array.length; i++){
            doubleSizedArray[i] = array[i];
        }

        array = doubleSizedArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }
}