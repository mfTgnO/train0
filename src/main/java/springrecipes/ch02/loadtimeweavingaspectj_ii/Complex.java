package springrecipes.ch02.loadtimeweavingaspectj_ii;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}