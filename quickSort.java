import java.util.Scanner;
public class quickSort {
    
    char a[] = new char[10];
    int n;
    
    int partition(int low, int high){
        int i, j, pivot;
        char temp;
        i = low;
        j = high;
        pivot = a[low];
        while(i<=j){
            while(a[i] <= pivot && i<n){
                i++;
            }
            while(a[j] > pivot && j>=0){
                j--;
            }
            if(i<j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }else{
                temp = a[j];
                a[j] = a[low];
                a[low] = temp;
            }
        }
        return j;
    }
    void quick(int low, int high){
        if (low<high){
            int mid = partition(low, high);
            quick(low, mid-1);
            quick(mid+1, high);
        }
        
    }
    public static void main(String args[]){
        quickSort obj = new quickSort();
        int i;
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        obj.n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(i=0;i<obj.n;i++){
            obj.a[i] = sc.next().charAt(0);
        }
        obj.quick(0, obj.n-1);
        for(i = 0; i<5; i++){
            System.out.print(obj.a[i]);
        }
    }
}
