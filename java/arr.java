 public class arr {

    public static void main(String[] args) {
        int []arr ={1,3,2,4,6,5,7,9,8};
        int temp = 0;

        for(int i = 0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        for(int var: arr){
            System.out.println(var);

        }

    }
    
}
