package Day_1_Assignment;

public class  Q_4UseStatic{

		int rollno;
		String name;
		static String collage = "ITS";  //static variables
		
		Q_4UseStatic(int r,String n){
		rollno=r;
		name=n;
		}
		void display()
		{
			System.out.println(rollno+" "+name+" "+collage);}
				
public static class StaticVariable{   //static blocks
	public static void main(String[] args) {
		Q_4UseStatic s1=new Q_4UseStatic(11,"Ram");
		Q_4UseStatic s2=new Q_4UseStatic(12,"Ravan");
		s1.display();
		s2.display();
	}
}
}