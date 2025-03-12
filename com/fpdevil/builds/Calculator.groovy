// Contains all the methods for the calculator
// Define the package
package com.fpdevil.builds;

// Define a Calculator class
class Calculator {
    // define a variable to hold the jwnkins context
    def jenkins

    // Contrustor to initialize the jenkins context
    Calculator(jenkins) {
        this.jenkins = jenkins
    }

    // Method to add two numbers
    def add(int a, int b) {
        return a + b
    }

    // Method to multiply two numbers
    def multiply(int a, int b) {
        return a * b
    }

    
}