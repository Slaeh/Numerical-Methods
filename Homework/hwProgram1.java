import java.util.ArrayList;
import java.util.HashSet;

public class hwProgram1 {
    public static void main(String args[]) {
      //Declare Arraylists to store binary values for Bonus problem

      //Arraylists for part 1 - Bisection
      ArrayList<String> A1 = new ArrayList<>(); 
      ArrayList<String> A2 = new ArrayList<>(); 
      ArrayList<String> A3 = new ArrayList<>(); 
      ArrayList<String> A4 = new ArrayList<>();
      
      //Arraylists for part 2 - Newtons
      ArrayList<String> B1 = new ArrayList<>(); 
      ArrayList<String> B2 = new ArrayList<>(); 
      ArrayList<String> B3 = new ArrayList<>(); 
      
      //Start of Part 1 - Bisection
      System.out.println("Bisection Method");

      System.out.println("Part A1");
      bisectionFloat(0f, 10f, A1);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      bisectionDouble(0.0, 10.0);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      
      System.out.println("Part A2");
      bisectionFloat(7f, 8f, A2);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      bisectionDouble(7.0, 8.0);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      
      System.out.println("Part A3");
      bisectionFloat(0f, -10f, A3);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      bisectionDouble(0.0, -10.0);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      
      System.out.println("Part A4");
      bisectionFloat(-8f, -7f, A4);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      bisectionDouble(-8.0, -7.0);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      //Start of part 2 - Newtons
      System.out.println("Newton's Method");

      System.out.println("Part B1");
      newtonFloat(7f, B1);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      newtonDouble(7.0); 
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      System.out.println("Part B2");
      newtonFloat(-7f, B2);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      newtonDouble(-7.0); 
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      System.out.println("Part B3");
      newtonFloat(0f, B3);
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      newtonDouble(0.0); 
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      
      //Start of Bonus - print Binary values for floats
      System.out.println("BONUS");
      System.out.println("-----------------------------------------------------------------------------------------------------------------");
      
      //Bisection Method 

      //Print binary for A1
      System.out.println("Binary for Bisection method on (x^2) - 56 on intervals [0,10]");
      for(int i = 0; i < A1.size(); i++){ 
          System.out.println(A1.get(i));
      }
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      //Print binary for A2
      System.out.println("Binary for Bisection method on (x^2) - 56 on intervals [7,8]");
      for(int i = 0; i < A2.size(); i++){ 
          System.out.println(A2.get(i));
      }
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      //Print binary for A3
      System.out.println("Binary for Bisection method on (x^2) - 56 on intervals [0,-10]");
      for(int i = 0; i < A3.size(); i++){ 
          System.out.println(A3.get(i));
      }
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      //Print binary for A4
      System.out.println("Binary for Bisection method on (x^2) - 56 on intervals [-8,-7]");
      for(int i = 0; i < A4.size(); i++){ 
          System.out.println(A4.get(i));
      }
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      //Newton's Method

      //Print binary for B1
      System.out.println("Newton's method on (x^2) - 56 with x0 = 7");
      for(int i = 0; i < B1.size(); i++){ 
          System.out.println(B1.get(i));
      }
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      //Print binary for B2
      System.out.println("Newton's method on (x^2) - 56 with x0 = -7");
      for(int i = 0; i < B2.size(); i++){ 
          System.out.println(B2.get(i));
      }
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

      //Print binary for B3
      System.out.println("Newton's method on (x^2) - 56 with x0 = 0");
      for(int i = 0; i < B3.size(); i++){ 
          System.out.println(B3.get(i));
      }
      System.out.println("Error, cannot divide by zero");
      System.out.println("-----------------------------------------------------------------------------------------------------------------");

    }

    //Returns the current number raised to the power of 2 for floats
    public static float polyFloat(float num){
        float result = num;
        for(int i = 1; i < 2; i++) {
            result *= num;
        } 
        return result - 56f;
    }

    //Returns the current number raised to the power of 2 for doubles
    public static double polyDouble(double num){
        double result = num;
        for(int i = 1; i < 2; i++) {
          result *= num;
        } 
        return result - 56;
    }

    //Bisection method for floats
    public static void bisectionFloat(float a, float b, ArrayList<String> list) {
        int counter = 1;
        float res = 0f;
        System.out.println("Bisection Method with Floating Point for ((x^2) - 56 = 0) on " + "[" + a + " , " + b + "]");
        while (Math.abs((b - a)) > 0.001f) {
            float c = (a + b) / 2;
            float functionOfC = polyFloat(c);
            int bits = Float.floatToIntBits(c);
            String str = Float.toString(c);   
            list.add(str + ": " +  Integer.toBinaryString(bits)); 
            System.out.println(
            "Iteration " + counter + ":" + " a = " + a + " b = " + b + " c = " + c + " F(c) = " + functionOfC
            );
            if (functionOfC < 0f) {
                a = c;
            }else {
                b = c;
            }
            res = c;
            counter++;
        }
        System.out.println("Our solution is " + res);
    }

    //Bisection method for doubles
    public static void bisectionDouble(double a, double b){ 
        int counter = 1;
        double res = 0.0; 
        System.out.println("Bisection Method with Doubles for ((x^2) - 56 = 0) on " + "[" + a + " , " + b + "]");
        while (Math.abs(b - a) > 0.001) {
            double c = (a + b) / 2;
            double functionOfC = polyDouble(c);
            System.out.println(
                "Iteration " + counter + ":" + " a = " + a + " b = " + b + " c = " + c + " F(c) = " + functionOfC
            );
            if (functionOfC < 0.0) {
                a = c;
            } else {
                b = c;
            }
            res = c; 
            counter++;
        }
        System.out.println("Our solution is " + res);
    }

    //Newton's method for floats - will return an error if we're dividing by zero
    public static void newtonFloat(float x1, ArrayList<String> list){ 
        HashSet<Float> floatSet = new HashSet<>(); 
        int counter = 1;
        float res = 0f;
        float checkDX = (2f * x1);
        System.out.println("Newton Method with Floating Point for ((x^2) - 56 = 0) with x1 = " + x1);
        if(checkDX == 0f){ 
            System.out.println("Error using Newton's Method, cannot divide by zero.");
            return; 
        } 
        while(Math.abs(x1) > 0.001f){ 
            System.out.println(
                "Iteration " + counter + ":" + " x = " + x1 
            );
            int bits = Float.floatToIntBits(x1);
            String str = Float.toString(x1);   
            list.add(str + ": " +  Integer.toBinaryString(bits));
            //Derivative of (x^2) - 56 => 2x
            float functionOfX = (x1 * x1) - 56f; 
            float dx = (2f * x1);
            x1 = x1 - (functionOfX / dx); 
            res = x1;
            counter ++; 
            if(floatSet.contains(x1)){ 
                break;
            }
            else{ 
                floatSet.add(x1);
            }
        }
        System.out.println("Our solution is " + res);
    }

    //Newton's method for doubles - will return an error if we're dividing by zero
    public static void newtonDouble(double x1){ 
        HashSet<Double> doubleSet = new HashSet<>(); 
        int counter = 1;
        double res = 0;
        System.out.println("Newton Method with Double for ((x^2) - 56 = 0) with x1 = " + x1);
        double checkDX = (2 * x1); 
        if(checkDX == 0){ 
            System.out.println("Error using Newton's Method, cannot divide by zero.");
            return; 
        } 
        while(Math.abs(x1) > 0.001){ 
            System.out.println(
                "Iteration " + counter + ":" + " x = " + x1 
            );
            //Derivative of (x^2) - 56 => 2x
            double functionOfX = (x1 * x1) - 56;
            double dx = (2 * x1);  
            x1 = x1 - (functionOfX / dx); 
            res = x1;
            counter ++; 
            if(doubleSet.contains(x1)){ 
                break;
            }
            else{ 
                doubleSet.add(x1);
            }
        }
        System.out.println("Our solution is " + res);
    }
}