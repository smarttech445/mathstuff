import java.util.*;

public class Operations {
    private double a;
    private double b;
    private double c;

    // Constructors
    public Operations() {
        a = 3.0;
        b = 5.0;
        c = 7.5;
    }
    public Operations(int numA, int numB, int numC) {
        a = numA;
        b = numB;
        c = numC;
    }

    // Accessors
    public double getNumber(int variableToAccess) {
        if (variableToAccess == 1)
            return a;
        else if (variableToAccess == 2)
            return b;
        else if (variableToAccess == 3)
            return c;
        else
            return -999.999;
    }
}

public class MathStuff {
    public static void main(String[] args) {
        
    }
}
