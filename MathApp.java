public class MathApp {
  public static void main(String[] args) 
  {
    int job1Salary = 15, job2Salary = 150;
    System.out.println(Math.max(job1Salary, job2Salary));
  }

 {
    int carPrice = 15_000, truckPrice = 50_000;
    System.out.println(Math.min(carPrice, truckPrice));
  }

 {
    double radius = 7.25;
    double area = Math.PI * radius * radius;
    System.out.println(area);
  }

 {
    double num1 = 5.0;
    System.out.println(Math.sqrt(num1));
  }

  {
    double x1 = 5; 
    double y1 = 10; 
    double x2 = 85; 
    double y2 = 50;       
    System.out.println(Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
  }

  {
    double num2 = -3.8;
    System.out.println(Math.abs(num2));
  }

  {
    System.out.println(Math.random());
  }
}
