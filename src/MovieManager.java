import java.util.ArrayList;

public class MovieManager {
   
   ArrayList<Movie> list = new ArrayList<Movie>();

   MenuManager menumanager = new MenuManager();

   
   int number;
   String name;


   public void addMovie() {   

      int movienumber = menumanager.number(); 
      
      for (Movie a : list) {
       
         
         if (movienumber == a.getNumber()) {
            System.out.println("중복된 번호입니다.");
         } else {
            name = menumanager.name();
            Movie movie = new Movie(name, movienumber);
            list.add(movie);
            break;
         }
      }
      
      if (list.size() == 0) { //list의 크기 아무것도 없으면 0
       
         name = menumanager.name();
        
         Movie movie = new Movie(name, movienumber);
     
         
         list.add(movie);
      }
   }

   public void deleteMovie() {

      if (list.size() == 0) {
         System.out.println("비어있습니다.");
      } else {   
         number = menumanager.number();
         for (Movie a : list) {
            if (number == a.getNumber()) { 
               System.out.println("성공적으로 지웠습니다.");
               break;
            } else {
               System.out.println("지울 영화가 없습니다.");
            }
         }
      }
   }

   public void editMovie() {

      if (list.size() == 0) {
         System.out.println("비어있습니다.");
      } else {
         int movienumber = menumanager.number();
         for (Movie a : list) {
            if (movienumber == a.getNumber()) {
               number = menumanager.number();
               name = menumanager.name();
               Movie movie = new Movie(name, number);
               list.set(list.indexOf(a), movie);

            }
         }
      }
   }

   public void viewMovie() {
      if (list.size() == 0) {
         System.out.println("비어있습니다.");
      } else {
         number = menumanager.number();
         for (Movie a : list) {
            if (number == a.getNumber()) {
               System.out.println(a.getNumber());
               System.out.println(a.getName());
            }
         }
      }
   }
}