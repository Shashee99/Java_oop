public class excephandling2 {

    public static void main(String[] args) {
        int arr[] = new int[5];
      try {
        arr[5] = 100;
      } catch (ArrayIndexOutOfBoundsException e) {
          //TODO: handle exception
          System.out.println("OUT OF INDEX BOUND");
      }  
        


    }
    
}
