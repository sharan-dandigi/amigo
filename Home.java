class Home
{
  static String Place = "Nandanavana";
   String Size;
   double cost;

 public static void main (String[] args)
 {
  System.out.println("Place/Area :" + Place);

  Home h1 = new Home();
  h1.Size = "2BHK";
  System.out.println("Home Size :" + h1.Size);

  h1.cost = 20000000;
  System.out.println("Home Price :" + h1.cost);

 }
}