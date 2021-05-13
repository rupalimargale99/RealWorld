//abstract parent class
abstract class Animal{
   //abstract method
   public abstract void sound();
}
//Dog class extends Animal class
public class Cat extends Animal{

   public void sound(){
	System.out.println("Miaow, miaow");
   }
   public static void main(String args[]){
	Animal obj = new Cat();
	obj.sound();
   }
}