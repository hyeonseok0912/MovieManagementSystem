public class Movie {
   String name;
   int number;

   public Movie() {

   }
   //공백의 생성자를 만드는 이유는 다른 클래스에서 쉽게 부를수 있도록해줌
   //빈 생성자를 선언하여 다른 클래스의 객체를 초기화하는 대안이라고 보면됨 <- 중요!

   public Movie(String name, int number) {
      //값을 받으면 Movie클래스의 2,3번째줄 string name/int number에 받아온 값을 저장해줌
      this.name = name;
      this.number = number;
   }

   public String getName() {
      //다른곳에서 이 메서드를 불러주면 name이 리턴됨
      //먼저 바로 아래의 setName(String name)이라는 메소드안에다 저장부터 해야됨
      return name;
   }

   public void setName(String name) {
      //다른곳에서 이 메서드를 불러주면 받아온 name값을 저장해줌.
      this.name = name;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }
}