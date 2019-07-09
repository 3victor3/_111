package exercise;

public class ChoiceSort {
    public static int[] sort(int[] array){
        //
        for (int i=0; i<array.length-1; i++){
            int min = 1;
            //
            for (int j = i+1; j<array.length; j++){
                if (array[j]>array[min]){
                    min = j;//
                }
            }
            //
            if (i!=min){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
            //
            System.out.print("第"+i+"轮排序后结果为：");
            display(array);
        }
        return array;
    }

    public static void display(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,2,8,9,5,7,6,1,3};
        //
        System.out.println("");
        display(array);
        System.out.println("--------------------");
        System.out.println("--------------------");
    }
}
