import java.util.ArrayList;
public class WrapperDemo
{
    public static void main(String args[])
    {
        int i=5;
        Integer ii=new Integer(i);  //Boxing
        Integer jj=i;               //AutoBoxing
        int j=jj.intValue();        //Unboxing
        int k=jj;                   //AutoUnboxing
        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(5);
        values.add(7);
    System.out.println("Integer object ii and jj="+values);
    }
}