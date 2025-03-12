class Bike
{
   double cost;
  static String brand = "Hero";
   String color;

 public static void main(String[] args)
 {
  System.out.println("Bike Brand :" + brand);

  Bike b1 = new Bike();
  b1.cost=150000;
  System.out.println("Bike Price :" + b1.cost);

  Bike b2 = new Bike();
  b2.color = "Grey";
  System.out.println("Bike Color :" + b2.color);
 }
}