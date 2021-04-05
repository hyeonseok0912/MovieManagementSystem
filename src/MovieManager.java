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
            System.out.println("�ߺ��� ��ȣ�Դϴ�.");
         } else {
            name = menumanager.name();
            Movie movie = new Movie(name, movienumber);
            list.add(movie);
            break;
         }
      }
      
      if (list.size() == 0) { //list�� ũ�� �ƹ��͵� ������ 0
       
         name = menumanager.name();
        
         Movie movie = new Movie(name, movienumber);
     
         
         list.add(movie);
      }
   }

   public void deleteMovie() {

      if (list.size() == 0) {
         System.out.println("����ֽ��ϴ�.");
      } else {   
         number = menumanager.number();
         for (Movie a : list) {
            if (number == a.getNumber()) { 
               System.out.println("���������� �������ϴ�.");
               break;
            } else {
               System.out.println("���� ��ȭ�� �����ϴ�.");
            }
         }
      }
   }

   public void editMovie() {

      if (list.size() == 0) {
         System.out.println("����ֽ��ϴ�.");
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
         System.out.println("����ֽ��ϴ�.");
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