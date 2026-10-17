class DynamicArray {

    private int size = 0;

    private int[] intArray;

    public DynamicArray(int capacity) {
        intArray = new int[capacity];
    }

    public int get(int i) {
        return this.intArray[i];
    }

    public void set(int i, int n) {
        intArray[i] = n;
    }

    public void pushback(int n) {
        if(size == intArray.length){
            resize();
        }
        
        intArray[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return this.intArray[size];
    }

    private void resize() {
        int len = intArray.length;
        int[] intArray2 = new int[len * 2];
        for (int i=0;i<len;i++){
            intArray2[i] = intArray[i];
        }
        intArray = intArray2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return  intArray.length;
    }
}