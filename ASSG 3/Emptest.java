//Q4
/*Create a class EMP having instance variable name and id. Create its subclass (say Scientist) which has instance variable
no_of_publication and experience. Now create its subclass, say Dscientist which has instance variable award. Put a method:
public String toString () { } in every class where you describe about the class and from main create object of each class and print
each object.
*/

class Emp
{
  String name;
  int id;
  public  String toString ()
  {
    String s="This is Emp Class. name is "+ name +" id is "+ id;
    return s;
  }
}

class Scientist extends Emp
{
 int no_of_publication;
 int experience;
 public  String toString ()
 {
   String s="This is Scientist Class. name is "+ name +" id is "+ id +" no_of_publication is "+  no_of_publication +" experienceis "+ experience;
   return s;
 }
}

class Dscientist extends Scientist
{
  int award;
  public  String toString ()
  {
    String s="This is Scientist Class. name is "+ name +" id is "+ id +" no_of_publication is "+  no_of_publication +" experience is "+ experience + " award = " + award;
    return s;
  }
}

class Emptest
{
  public static void main(String[] args)
{
  Emp e=new Emp();
  e.name="Mainak Sen";
  e.id=1234;
  String s=e.toString();
  System.out.println(s);

 Scientist sc=new Scientist();
 sc.name="Mainak Sen";
 sc.id=1234;
 sc.no_of_publication=5;
 sc.experience=5;
 System.out.println(sc.toString());
  Dscientist dsc=new Dscientist();
  dsc.name="Mainak Sen";
  dsc.id=1234;
  dsc.no_of_publication=5;
  dsc.experience=5;
  dsc.award=3;
  System.out.println(dsc.toString());

}

}
