public class Student implements Comparable<Student>
{
   private String name;
   private int age;
   
   public Student( String n, int a )
   {
      this.name = n;
      this.age = a;
   }
   
   public int getAge(){ return this.age; }
   
   @Override
   public int compareTo(Student s)
   {
      return this.age - s.getAge();
   }
}