import java.util.ArrayList;

public class MovieManager extends MovieKind {
   
   ArrayList<Movie> list = new ArrayList<Movie>();
   MenuManager menumanager = new MenuManager();

   int number;
   String name;
   int genre_number;
   String genre[] = { "Horror", "Romance", "Thriller", "SF" };
   String age;

   public void addMovie() {

      int movienumber = menumanager.number();
      boolean check = true;

      for (int i = 0; i < list.size(); i++) {
         if (movienumber == list.get(i).number) {
            System.out.println("�ߺ��� ��ȣ�Դϴ�.");
            check = false;
         }
      }

      if (list.size() == 0 || check == true) {
         genre_number = menumanager.genre();         
         if(genre_number == 1 || genre_number ==2) {
            age = menumanager.age();
         } else {
            age = "��ü �̿밡";
         }
         this.setAge(age);
         name = menumanager.name();
         Movie movie = new Movie(name, movienumber, genre[genre_number - 1], this.getAge());
         list.add(movie);
      }
   }

   public void deleteMovie() {

      boolean check = true;
      number = menumanager.number();
      for (int i = 0; i < list.size(); i++) {
         if (number == list.get(i).number) {
            list.remove(i);
            System.out.println("���������� �������ϴ�.");
            check = false;
            break;
         }
      }
      if (list.size() == 0 || check == true) {
         System.out.println("����ֽ��ϴ�.");
      }
   }

   public void editMovie() {
      boolean check = true;
      int movienumber = menumanager.number();
      for (int i = 0; i < list.size(); i++) {
         if (movienumber == list.get(i).number) {
            number = menumanager.number();
            genre_number = menumanager.genre();
            if(genre_number == 1 || genre_number ==2) {
               age = menumanager.age();
            } else {
               age = "��ü �̿밡";
            }
            this.setAge(age);
            name = menumanager.name();
            Movie movie = new Movie(name, number, genre[genre_number - 1], this.getAge());
            list.set(i, movie);
            check = false;
            System.out.println("���� �Ϸ��߽��ϴ�.");
            break;
         }
      }
      if (list.size() == 0 || check == true) {
         System.out.println("����ֽ��ϴ�.");
      }
   }

   public void viewMovie() {
      if (list.size() == 0) {
         System.out.println("����ֽ��ϴ�.");
      } else {
         for (Movie a : list) {
            a.printPlaydata();
         }
      }
   }
}