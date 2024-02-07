class Sorter {
    String arr[];
    
    Sorter(String ar[]){
        arr = ar;    
        int start = 0;
        int end = arr.length - 1;
        getSort(start, end);
    }
    
    void getSort(int start, int end){
        if (start < end){
            int j = partition(start, end);
            getSort(start, j - 1);
            getSort(j + 1, end);           
        }
    }
    
    int partition(int start, int end){
        int i = start;
        int j = end;
        int pivot = start;
        
        while (i < j){
            while (i <= end && arr[i].compareTo(arr[pivot]) <= 0){
                i++;
            }

            while (j >= start && arr[j].compareTo(arr[pivot]) > 0){
                j--;
            }

            if (i < j){
                // Swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[j] and arr[pivot]
        String temp = arr[j];
        arr[j] = arr[pivot];
        arr[pivot] = temp;

        // Update the pivot index
        pivot = j;

        return pivot;
    }   
    
    void showArray(){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }   
        System.out.println();
    }
}

class QuickSort {
    public static void main(String args[]){
        Sorter st = new Sorter(args);
        st.showArray();
    }
}

