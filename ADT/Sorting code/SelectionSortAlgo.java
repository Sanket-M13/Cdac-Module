class SelectionSortAlgo{
    static void sSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int min = i;
            for(int j =i+1; j<n; j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    static void display(int arr[]){
        int n = arr.length;

        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,4,2,3,7,6,9,8};

        sSort(arr);
        display(arr);

    }

}