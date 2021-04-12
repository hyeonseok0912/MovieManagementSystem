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
            System.out.println("중복된 번호입니다.");
            check = false;
         }
      }

      if (list.size() == 0 || check == true) {
         genre_number = menumanager.genre();         
         if(genre_number == 1 || genre_number ==2) {
            age = menumanager.age();
         } else {
            age = "전체 이용가";
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
            System.out.println("성공적으로 지웠습니다.");
            check = false;
            break;
         }
      }
      if (list.size() == 0 || check == true) {
         System.out.println("비어있습니다.");
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
               age = "전체 이용가";
            }
            this.setAge(age);
            name = menumanager.name();
            Movie movie = new Movie(name, number, genre[genre_number - 1], this.getAge());
            list.set(i, movie);
            check = false;
            System.out.println("수정 완료했습니다.");
            break;
         }
      }
      if (list.size() == 0 || check == true) {
         System.out.println("비어있습니다.");
      }
   }

   public void viewMovie() {
      if (list.size() == 0) {
         System.out.println("비어있습니다.");
      } else {
         for (Movie a : list) {
            a.printPlaydata();
         }
      }
   }
}