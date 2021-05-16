import java.util.Scanner;

public class MenuManager {
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args) {

      MovieManager moviemanager = new MovieManager();
      boolean start = true;

      while (start) {
         System.out.println("1. Add Movies");
         System.out.println("2. Delete Movies");
         System.out.println("3. Edit Movies");
         System.out.println("4. View Movies");
         System.out.println("5. Exit");
         System.out.println("Select one number between 1 - 5 : ");

         int number = 0;

         try {
            String num = input.next();
            number = Integer.parseInt(num);
         } catch (NumberFormatException e) {
            System.out.println("Number format exception");
         }

         switch (number) {
         case 1:
            moviemanager.addMovie();
            break;
         case 2:
            moviemanager.deleteMovie();
            break;
         case 3:
            moviemanager.editMovie();
            break;
         case 4:
            moviemanager.viewMovie();
            break;
         case 5:
            start = false;
            break;
         default:
            System.out.println("Select one number between 1 - 5");
            break;
         }
      }
   }

   public int number() {
      System.out.print("Movie Number");
      int number = input.nextInt();
      return number;
   }

   public String name() {
      System.out.print("Movie Name");
      String name = input.next();
      return name;
   }

   public int genre() {
      System.out.println("장르를 입력하시오.");
      System.out.println("1. Horror   2. Romance   3. Thriller   4.SF");
      int genre_number = input.nextInt();
      return genre_number;
   }

   public String age() {
      System.out.println("연령을 입력하시오.");
      String age = input.next();
      return age;
   }

   public int number(String update) {
      System.out.print(update + "Movie Number");
      int number = input.nextInt();
      return number;
   }

   public String name(String update) {
      System.out.print(update + "Movie Name");
      String name = input.next();
      return name;
   }

   public int genre(String update) {
      System.out.println(update + "장르를 입력하시오.");
      System.out.println("1. Horror   2. Romance   3. Thriller   4.SF");
      int genre_number = input.nextInt();
      return genre_number;
   }

   public String age(String update) {
      System.out.println(update + "연령을 입력하시오.");
      String age = input.next();
      return age;
   }
}

class Age extends MenuManager {

   @Override
   public String age() {
      String age = "전체 이용가";
      return age;
   }
}