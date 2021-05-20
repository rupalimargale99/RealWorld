/*Program for wrapper class to converting datatype into an object and object into an datatype*/
public class wrapperclass
{
   public static void main(String args[])
   {
     byte grade=2;
     int marks=99;
     float price=8.9f;
     double rate=10.8;
      
      Byte g1=new Byte(grade);
      Integer m1=new Integer(marks);
      Float pr=new Float(price);
      Double rt=new Double(rate);
     
    System.out.println("Values of wrapper objects means converting datatype value into object:");
    System.out.println("Byte object g1="+g1);
    System.out.println("Integer object m1="+m1);
    System.out.println("Float object pr="+pr);
    System.out.println("Double object rt="+rt);
      
       byte bv=g1.byteValue();
       int iv=m1.intValue();
       float fv=pr.floatValue();
       double dv=rt.doubleValue();
    System.out.println("values of converting object values into datatype values:");
    System.out.println("byte datatype value of bv="+bv);
    System.out.println("int datatype value of iv="+iv);
    System.out.println("float datatype value of fv="+fv);
    System.out.println("double datatype value of dv="+dv);
  }
}
      
