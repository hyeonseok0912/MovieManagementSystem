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
      System.out.println("��ȭ �帣 : " + genre);
      System.out.println("��ȭ ��ȣ : " + number);
      System.out.println("��ȭ ���� : " + name);
      System.out.println("��    �� : " + age);
      System.out.println("��    ¥ : " + date);
      System.out.println("====================");
   }
}