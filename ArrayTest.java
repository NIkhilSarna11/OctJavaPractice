import java.util.Scanner ; 
class ArrayTest {

 public static void main(String args[])
{
 int s ; 
 Scanner sc = new Scanner(System.in) ; 
 s= sc.nextInt() ; 
 int[] arr = new int[s] ; 
 for (int a  = 0 ; a < s ; a++){
     arr[a] = sc.nextInt() ; 
 }

 for(int b : arr )
{
    System.out.println(b) ; 
} 
}

}