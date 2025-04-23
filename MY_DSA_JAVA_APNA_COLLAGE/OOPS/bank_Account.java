package OOPS;
public class bank_Account {
 
 
  class pen {
      public String color;
      private int trip;
      int price;

      String getColor() {
          return this.color;
      } 
      void setcolor(String newColor) {
          this.color = newColor;
      }
      int SetTrip() {
          return this.trip;
      }
  }

  public static void main(String[] args) {
      bank_Account bankAcc = new bank_Account();
      pen p1 = bankAcc.new pen();
      p1.setcolor("blue");
      System.out.println(p1.getColor());
      p1.SetTrip();
      System.out.println(p1.SetTrip());
  }
} 