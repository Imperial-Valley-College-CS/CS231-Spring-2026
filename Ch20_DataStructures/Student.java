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
   public String getName(){ return this.name; }
   
   @Override
   public int compareTo(Student s)
   {
      //s.getAge() - this.age -- sorts descending age (biggest age has highest priority queue)
      //this.age - s.getAge() -- sorts ascending by age (smallest age has highest priority queue)
      return this.age - s.getAge();
   }
   
   @Override
   public String toString()
   {
      return "Name: " + this.name + ", Age: " + this.age;
   }
}