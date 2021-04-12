public class Movie extends MovieKind {
   String name;
   int number;

   public Movie() {

   }

   public Movie(String name, int number, String genre, String age) {
      this.name = name;
      this.number = number;
      this.genre = genre;
      this.age = age;
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

   public void printPlaydata() {
      System.out.println("��ȭ �帣 : " + genre);
      System.out.println("��ȭ ��ȣ : " + number);
      System.out.println("��ȭ ���� : " + name);
      System.out.println("��    �� : " + age);
      System.out.println("====================");
   }
}