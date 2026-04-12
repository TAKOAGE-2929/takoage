package com.takoage.fluidpowergen.config;

public class GeneratorConfig {
    // Configurable logarithmic function parameters
    private double parameterA;
    private double parameterB;

    // Constructor
    public GeneratorConfig(double parameterA, double parameterB) {
        this.parameterA = parameterA;
        this.parameterB = parameterB;
    }

    // Getters
    public double getParameterA() {
        return parameterA;
    }

    public double getParameterB() {
        return parameterB;
    }

    // Setters
    public void setParameterA(double parameterA) {
        this.parameterA = parameterA;
    }

    public void setParameterB(double parameterB) {
        this.parameterB = parameterB;
    }
}
