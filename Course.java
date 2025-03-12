class Course
{
  String course;
 static String Institute = "Jspiders";
  double cost;

 public static void main(String[] args)
 { 
  System.out.println("Institute:" +Institute);

  Course c1 = new Course();
  c1.course = "Fullstack";
  System.out.println("Course Name :" + c1.course);

  c1.cost = 20000;
  System.out.println("Fee :" + c1.cost);
 }
}