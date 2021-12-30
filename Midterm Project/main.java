public class main { 
  public static void main(String[] args) {
    String [] a = {"0", "0", "1", "1", "6 x 10^2", "1", "10^-5"}; 
    String [] b = {"0", "5", "6", "1", "6 x 10^10", "1000.001", "2"};
    String [] c = {"0", "6", "9", "1", "10^-10", "1", "1"};

    double [] aValues = {0.0, 0.0, 1.0, 1.0, 600.0, 1.0, 0.00001}; 
    double [] bValues = {0.0, 5.0, 6.0, 1.0, 60000000000.0, 1000.001, 2.0};
    double [] cValues = {0.0, 6.0, 9.0, 1.0, .0000000001,1.0, 1.0}; 

    System.out.println("Solving for Quadratic Roots");
    System.out.println();
    System.out.println("Part A: ");
    for(int i = 0; i < aValues.length; i++){ 
      double [] arr = new double[2];
      double discrim = (Math.pow(bValues[i] , 2.0)) - (4.0 * aValues[i] * cValues[i]);

      if(discrim > 0.0){ 
        arr[0] = ((-1.0) * bValues[i] + Math.sqrt(Math.pow(bValues[i], 2.0) - (4.0 * aValues[i] * cValues[i]) )) / (2.0 * aValues[i]);
        arr[1] = ((-1.0) * bValues[i] - Math.sqrt(Math.pow(bValues[i], 2.0) - (4.0 * aValues[i] * cValues[i]) )) / (2.0 * aValues[i]); 
        System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "are ");
        System.out.format("%.5f", arr[0]);
        System.out.print(" and ");
        System.out.format("%.5f", arr[1]);
        System.out.println();
      }
      else if(discrim == 0.0){ 
       double ans = ((-1.0) * bValues[i]) / (2.0 * aValues[i]);  
       System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "is ");
       System.out.format("%.5f", ans);
       System.out.println();
      }
      else{ 
        double first = ((-1.0) * bValues[i]) / (2.0 * aValues[i]);
        double second = Math.sqrt((-1.0) * discrim) / (2.0 * aValues[i]); 
        System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "is " );
        System.out.format("%.5f", first);
        System.out.print(" - ");
        System.out.format("%.5f", second);
        System.out.print("i and ");
        System.out.format("%.5f", first);
        System.out.print(" + ");
        System.out.format("%.5f", second);
        System.out.print("i");
        System.out.println();
      }
    }

    System.out.println();
    System.out.println("Part B: ");
    for(int i = 0; i < aValues.length; i++){
      double discrim = (Math.pow(bValues[i] , 2.0)) - (4.0 * aValues[i] * cValues[i]);
      double [] arr = new double[2];
      if(discrim > 0.0){ 
        arr[0] = (2.0 * cValues[i]) / ((-1.0) * bValues[i]) + (Math.sqrt(Math.pow(bValues[i], 2.0) - (4.0 * aValues[i] * cValues[i])));
        arr[1] = (2.0 * cValues[i]) / ((-1.0) * bValues[i]) - (Math.sqrt(Math.pow(bValues[i], 2.0) - (4.0 * aValues[i] * cValues[i])));
        System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "are ");
        System.out.format("%.5f", arr[0]);
        System.out.print(" and ");
        System.out.format("%.5f", arr[1]);
        System.out.println();
      }
      else if(discrim == 0.0){ 
       double ans = ((-1.0) * bValues[i]) / (2.0 * aValues[i]);  
       System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "is ");
       System.out.format("%.5f", ans);
       System.out.println();
      }
      else{ 
        double first = ((-1.0) * bValues[i]) / (2.0 * aValues[i]);
        double second = Math.sqrt((-1) * discrim) / (2.0 * aValues[i]); 
        System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "is " );
        System.out.format("%.5f", first);
        System.out.print(" - ");
        System.out.format("%.5f", second);
        System.out.print("i and ");
        System.out.format("%.5f", first);
        System.out.print(" + ");
        System.out.format("%.5f", second);
        System.out.print("i");
        System.out.println();
      }
    }

    System.out.println();
    System.out.println("Part C: ");
    for(int i = 0; i < aValues.length; i++){ 
      double [] arr = new double[2];
      double discrim = (Math.pow(bValues[i] , 2.0)) - (4.0 * aValues[i] * cValues[i]);
      //System.out.println(discrim + " is discrim");
      if(discrim > 0.0){ 
        arr[0] = (2.0 * cValues[i]) / ((-1.0) * bValues[i]) + Math.sqrt(Math.pow(bValues[i], 2) - (4.0 * aValues[i] * cValues[i]));
        arr[1] = (2.0 * cValues[i]) / ((-1.0) * bValues[i]) - Math.sqrt(Math.pow(bValues[i], 2) - (4.0 * aValues[i] * cValues[i]));
        Double d1 = arr[0]; 
        Double d2 = arr[1];
        if(d1.isNaN()){ 
          if(!d2.isNaN()){ 
            double newFirst = cValues[i] / (aValues[i] * arr[1]);
            System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "are ");
            System.out.format("%.5f", newFirst);
            System.out.print(" and ");
            System.out.format("%.5f", arr[1]);
            System.out.println();
          }
        }
        else if(d2.isNaN()){ 
          if(!d1.isNaN()){ 
            double newSecond = cValues[i] / (aValues[i] * arr[0]);
            System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "are ");
            System.out.format("%.5f", newSecond);
            System.out.print(" and ");
            System.out.format("%.5f", arr[1]);
            System.out.println();
          }
        }
        else { 
          System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "are ");
          System.out.format("%.5f", arr[0]);
          System.out.print(" and ");
          System.out.format("%.5f", arr[1]);
          System.out.println();
        }
      }
      else if(discrim == 0.0){ 
       double ans = ((-1.0) * bValues[i]) / (2.0 * aValues[i]);  
       System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "is ");
       System.out.format("%.5f", ans);
       System.out.println();
      }
      else{ 
        double first = ((-1.0) * bValues[i]) / (2.0 * aValues[i]);
        double second = Math.sqrt((-1) * discrim) / (2.0 * aValues[i]); 
        System.out.print("The roots for " + a[i] + "x^2 + " + b[i] + "x + " + c[i] + " = 0 " + "is " );
        System.out.format("%.5f", first);
        System.out.print(" - ");
        System.out.format("%.5f", second);
        System.out.print("i and ");
        System.out.format("%.5f", first);
        System.out.print(" + ");
        System.out.format("%.5f", second);
        System.out.print("i");
        System.out.println();
      }
    }
  }
}