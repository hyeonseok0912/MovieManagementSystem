public class Movie {
   String name;
   int number;

   public Movie() {

   }
   //������ �����ڸ� ����� ������ �ٸ� Ŭ�������� ���� �θ��� �ֵ�������
   //�� �����ڸ� �����Ͽ� �ٸ� Ŭ������ ��ü�� �ʱ�ȭ�ϴ� ����̶�� ����� <- �߿�!

   public Movie(String name, int number) {
      //���� ������ MovieŬ������ 2,3��°�� string name/int number�� �޾ƿ� ���� ��������
      this.name = name;
      this.number = number;
   }

   public String getName() {
      //�ٸ������� �� �޼��带 �ҷ��ָ� name�� ���ϵ�
      //���� �ٷ� �Ʒ��� setName(String name)�̶�� �޼ҵ�ȿ��� ������� �ؾߵ�
      return name;
   }

   public void setName(String name) {
      //�ٸ������� �� �޼��带 �ҷ��ָ� �޾ƿ� name���� ��������.
      this.name = name;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }
}