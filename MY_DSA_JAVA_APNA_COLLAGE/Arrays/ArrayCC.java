package Arrays;

public class ArrayCC {
      public static void update(int marks[]) {
              for(int i=0; i<marks.length; i++) {
                  marks[i]++;
              }
          }    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int  nonChangable = 5;
        update(marks);

        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
    }


}