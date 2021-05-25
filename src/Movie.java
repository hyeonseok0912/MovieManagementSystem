public class Movie extends MovieKind {
   String name;
   int number;
   String date;

   public Movie(String name, int number, String genre, String age, String date) {
      this.name = name;
      this.number = number;
      this.genre = genre;
      this.age = age;
      this.date = date;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public void printPlaydata() {
      System.out.println("영화 장르 : " + genre);
      System.out.println("영화 번호 : " + number);
      System.out.println("영화 제목 : " + name);
      System.out.println("연    령 : " + age);
      System.out.println("날    짜 : " + date);
      System.out.println("====================");
   }
}