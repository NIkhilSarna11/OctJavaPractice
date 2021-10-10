class RectanglePattern {
    public static void main (String args[]) {
        int length = 10; 
        int breadth = 10 ; 

        for (int i = 1 ; i < length ; i++){

            System.out.println() ; 
        
            for (int j = 1 ; j < breadth ; j++){
                if (i==1 || i == length -1 || j==1 || j == breadth -1 ){
                    System.out.print("*") ; 
                }
                else {
                    System.out.print(" ") ; 

                }
            }

            
        }
        
        
             }
}
