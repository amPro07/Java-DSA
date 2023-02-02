public class MenuSearch {

    public static String linearSearch(String menu[], String food){

        for( int i=0; i<menu.length; i++){
            if(menu[i] == food){
                return "Your order was execpted.";
            }
                
        }
         return "Sorry item not available.";
    }

    public static void main(String args[]){
        String menu[] = {"Idli", "Dosa", "Upma", "Puri"};
        String food = "Buns";

       String order = linearSearch(menu, food);

       System.out.println(order);
    }
}
