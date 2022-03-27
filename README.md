# Shape Area Calculator in Java

This repository contains a Java project that calculates the areas of different geometric shapes, specifically triangles and circles. The program includes classes for handling user input, performing calculations, and displaying the results for each shape.

## Features

- **User Input Handling**: Reads the dimensions of the shapes from the user.
- **Area Calculation**: Computes the area of triangles and circles using appropriate formulas.
- **Result Display**: Outputs the calculated areas to the user.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes the calculation methods for both triangles and circles.

```java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Triangle Area Calculation
        System.out.print("Enter the length of side A of the triangle: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter the length of side B of the triangle: ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter the length of side C of the triangle: ");
        double sideC = scanner.nextDouble();

        TTriangulo triangle = new TTriangulo(sideA, sideB, sideC);
        double triangleArea = triangle.calculateArea();

        System.out.println("The area of the triangle is: " + triangleArea);

        // Circle Area Calculation
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        TCirculo circle = new TCirculo(radius);
        double circleArea = circle.calculateArea();

        System.out.println("The area of the circle is: " + circleArea);
    }
}
```

#### Triangle Class

The `TTriangulo` class contains methods for calculating the area of a triangle using Heron's formula.

```java
public class TTriangulo {
    private double sideA;
    private double sideB;
    private double sideC;

    public TTriangulo(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
```

#### Circle Class

The `TCirculo` class contains methods for calculating the area of a circle using the formula πr².

```java
public class TCirculo {
    private double radius;

    public TCirculo(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Enter the dimensions for the triangle and the circle when prompted.
4.  The program will calculate and display the areas of the triangle and the circle.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `TTriangulo`: A class representing a triangle with methods for area calculation.
    -   `TTriangulo(double sideA, double sideB, double sideC)`: Constructor that initializes the triangle's sides.
    -   `calculateArea()`: Method that calculates and returns the area of the triangle using Heron's formula.
-   `TCirculo`: A class representing a circle with methods for area calculation.
    -   `TCirculo(double radius)`: Constructor that initializes the circle's radius.
    -   `calculateArea()`: Method that calculates and returns the area of the circle using the formula πr².