import com.learning.solid.dependency_inversion.with.D_Example;
import com.learning.solid.dependency_inversion.without.Non_D_Example;
import com.learning.solid.interface_segregation.with.I_Example;
import com.learning.solid.interface_segregation.without.Non_I_Example;
import com.learning.solid.liskov_substitution.with.L_Example;
import com.learning.solid.liskov_substitution.without.Non_L_Example;
import com.learning.solid.open_closed.with.O_Example;
import com.learning.solid.open_closed.without.Non_O_Example;
import com.learning.solid.single_responsibility.with.S_Example;
import com.learning.solid.single_responsibility.without.Non_S_Example;
import jdk.jshell.spi.ExecutionControl;

public class Main {

    public static void main(String args[]) throws ExecutionControl.NotImplementedException {
        // S
        S_Example srPrincipleExample = new S_Example();
        Non_S_Example nonSrPrincipleExample = new Non_S_Example();
        // O
        O_Example ocPrincipleExample = new O_Example();
        Non_O_Example nonOcPrincipleExample = new Non_O_Example();
        // L
        L_Example lsPrincipleExample = new L_Example();
        Non_L_Example nonLsPrincipleExample = new Non_L_Example();
        // I
        I_Example isPrincipleExample = new I_Example();
        Non_I_Example nonIsPrincipleExample = new Non_I_Example();
        // D
        D_Example diPrincipleExample = new D_Example();
        Non_D_Example nonDiPrincipleExample = new Non_D_Example();

        System.out.println("-------------------------------");
        System.out.println("S - Single Responsibility Principle...");
        System.out.println("O - Open Closed Principle...");
        System.out.println("L - Liskov Substitution Principle...");
        System.out.println("I - Interface Segregation Principle...");
        System.out.println("D - Dependency Inversion Principle...");

        // Single Responsibility Principle
        System.out.println("-------------------------------");
        nonSrPrincipleExample.runExample();
        System.out.println("-------------------------------");
        srPrincipleExample.runExample();

        // Open / Closed Principle
        System.out.println("-------------------------------");
        nonOcPrincipleExample.runExample();
        System.out.println("-------------------------------");
        ocPrincipleExample.runExample();

        // Liskov Substitution Principle
        System.out.println("-------------------------------");
        nonLsPrincipleExample.runExample();
        System.out.println("-------------------------------");
        lsPrincipleExample.runExample();

        // Interface Segregation Principle
        System.out.println("-------------------------------");
        nonIsPrincipleExample.runExample();
        System.out.println("-------------------------------");
        isPrincipleExample.runExample();

        // Dependency Inversion Principle
        System.out.println("-------------------------------");
        nonDiPrincipleExample.runExample();
        System.out.println("-------------------------------");
        diPrincipleExample.runExample();
    }

}
