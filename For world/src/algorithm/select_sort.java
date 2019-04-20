package algorithm;

public static void select_sort(int array[],int lenth){
    
    for(int i=0;i<lenth-1;i++){
        
        int minIndex = i;
        for(int j=i+1;j<lenth;j++){
           if(array[j]<array[minIndex]){
               minIndex = j;
           }
        }
        if(minIndex != i){
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}

