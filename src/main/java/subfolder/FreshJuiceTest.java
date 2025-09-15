
package subfolder;

class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM , LARGE }

   enum DogBreed {HUSKY, LABRADOR, BEAGLE}
   FreshJuiceSize size;
   // DogBreed breed;
}



public class FreshJuiceTest {
   public static void main(String[] args){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM  ;


      FreshJuice dog = new FreshJuice();

      System.out.println("dog" + dog);

      System.out.println("Size: " + juice.size);
   }
}