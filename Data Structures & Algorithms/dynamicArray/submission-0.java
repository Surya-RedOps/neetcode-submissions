class DynamicArray {

    private int[] arr;
    private int l;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.l = 0;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(l == capacity) {
            resize();
        }
        arr[l] = n;
        l++;
    }

    public int popback() {
        if(l > 0){
            l--;
        }
        return arr[l];
    }

    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for(int i = 0; i < l; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        return l;
    }

    public int getCapacity() {
        return capacity;
    }
}
