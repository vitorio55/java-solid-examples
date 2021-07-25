package com.learning.solid.liskov_substitution;

import com.learning.solid.liskov_substitution.with.Shape;
import com.learning.solid.liskov_substitution.without.AreaCalculator;
import com.learning.solid.liskov_substitution.without.Rectangle;
import com.learning.solid.liskov_substitution.without.Square;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_ExampleTests {

    @Test
    @DisplayName("Liskov Substitution Test - Verify superclass substitution - Violation")
    public void liskovSubstitutionTest_verifySuperclassSubstitution_violation() {
        // These shapes are from the package without the Liskov Substitution Principle
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(7);
        Square square = new Square();
        square.setHeight(5);
        square.setWidth(7);

        // If we interchange these classes in an application, their behaviour would be expected to be the same if
        // the Liskov Substitution Principle is followed
        // Here we can see why it isn't and they're not interchangeable
        assertEquals(35, AreaCalculator.calculateArea(rectangle));
        assertEquals(35, AreaCalculator.calculateArea(square));
    }

    @Test
    @DisplayName("Liskov Substitution Test - Verify superclass substitution - No Violation")
    public void liskovSubstitutionTest_verifySuperclassSubstitution_noViolation() {
        // These shapes are from the package WITH the Liskov Substitution Principle
        // They have been rewritten and inherit a base Shape abstract class
        com.learning.solid.liskov_substitution.with.Rectangle rectangle = new com.learning.solid.liskov_substitution.with.Rectangle();
        rectangle.setHeight(7);
        rectangle.setWidth(7);
        com.learning.solid.liskov_substitution.with.Square square = new com.learning.solid.liskov_substitution.with.Square();
        square.setSidesMeasure(7);

        List<Shape> shapeList = List.of(rectangle, square);

        shapeList.forEach(shape -> {
            int area = com.learning.solid.liskov_substitution.with.AreaCalculator.calculateArea(shape);
            assertEquals(49, area);
        });
    }
}
