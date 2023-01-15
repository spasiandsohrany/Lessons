package Practisechek;

import java.util.Objects;
import java.lang.Double;

public class Doublechek {
    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber(2.3412, 7.2434);
        ComplexNumber cn2 = new ComplexNumber(2.3412, 7.2434);
        ComplexNumber cn3 = new ComplexNumber(3.23124, 1435.23);
        System.out.println(cn1.equals(cn2));
        System.out.println(cn1.hashCode() == cn2.hashCode());

    }

    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }

        public ComplexNumber(double re, double im) {
            this.re = re;
            this.im = im;
        }

        public double getRe() {
            return re;
        }

        public double getIm() {
            return im;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComplexNumber that = (ComplexNumber) o;
            return Double.compare(that.re, re) == 0 && Double.compare(that.im, im) == 0;
        }

        @Override
        public int hashCode() {
            int result=17;
            result = result * 31 + Double.hashCode(re);
            result = result * 31 + Double.hashCode(im);
            return result;
        }
    }

}
