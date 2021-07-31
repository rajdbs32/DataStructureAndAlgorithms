package switchCase;

public class RatingCalculator {
      
        public static void main(String[] args){
            
            int rating = 3;
            switch (rating){
                case 1:
                case 2:
                    System.out.println("Bad Rating");
                    break;
                case 3:
                    System.out.println("Average Rating");
                    break; 
                case 4:
                case 5:
                    System.out.println("Good Rating");
                    break;


                default:
                    throw new IllegalStateException("Unexpected value: " + rating);
            }
            
            
            
    

    }
}
