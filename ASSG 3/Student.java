/*Define a class student described as below:
Data members I instance variables:
name, age, m1, m2, m3 (marks in 3 subjects), maximum, average Member methods
(i) A parameterized constructor to initialize the data members
(ii) To accept the details of a student
(iii) To compute the average and the maximum out of three marks
(iv) To display the name, age, marks in three subjects, maximum and average.
Write a main method to create an object of a class and call the above member methods*/
class Student
{
 String name;
 int age;
 int m1;
 int m2;
 int m3;
 int maximum;
 double average;

Student()
{
 name="";
 age=0;
 m1=1;
 m2=0;
 m3=0;
 maximum=0;
 average=0;
}

void input(String n,int a,int marks1,int marks2,int marks3)
{
name=n;
age=a;
m1=marks1;
m2=marks2;
m3=marks3;
}
 void max()
 {
        if (m1 > m2 && m1 > m3)
            maximum = m1;
        else if (m2 > m1 && m2 > m3)
            maximum = m2;
        else
            maximum = m3;
}
void average()
{
  average = (m1 + m2 + m3) / 3.0;
}

void display()
{
   System.out.println("Name: " + name);
  System.out.println("Age: " + age);
  System.out.println("Subject 1 Marks: " + m1);
  System.out.println("Subject 2 Marks: " + m2);
  System.out.println("Subject 3 Marks: " + m3);
  System.out.println("Maximum Marks: " + maximum);
  System.out.println("Average Marks: " + average);

}

public static void main(String args[])
 {
        Student obj = new Student();
        obj.input("Mainak",21,50,80,90);
        obj.max();
        obj.average();
        obj.display();
    }

}
