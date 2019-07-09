package exercise;

public class PriorityQue {
    private int maxSize;
    private int[] priQueArray;
    private int nItems;

    public PriorityQue(int s){
        maxSize = s;
        priQueArray = new int[maxSize];
        nItems = 0;
    }

    //
    public void insert(int value){
        int j;
        if (nItems == 0){
            priQueArray[nItems++] = value;
        }else {
            j = nItems-1;
            //
            while (j>=0 && value >priQueArray[j]){
                priQueArray[j+1] = priQueArray[j];
                j--;
            }
            priQueArray[j+1] = value;
            nItems++;
        }
    }

    //
    public int peekmin(){
        return priQueArray[nItems-1];
    }

    //
    public boolean isEmpty(){
        return (nItems == 0);
    }

    //
    public boolean isFull(){
        return (nItems == maxSize);
    }
}
