package org.example.week1_if_statements;

import static input.InputUtils.intInput;

public class ExampleIfStatements {

    public static void main(String[] args) {

        int classCode = intInput("Enter a class code: ");

        if (classCode == 2545) {
            System.out.println("This is Java Programming!");
        } else if (classCode == 2505) {
            System.out.println("This is C# programming!");
        } else {
            System.out.println("This NOT Java programming or C#");
        }
    }
}
