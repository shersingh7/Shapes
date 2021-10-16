

package shapes;

import java.text.DecimalFormat;

public class Triangle implements Shape{
    double s1;
    double s2;
    double s3;

    public Triangle(double a, double b, double c) throws Exception {

        if((a > 0.0) && (b > 0.0) && (c>0.0) && (a + b) > c ){
            this.s1=a;
            this.s2=b;
            this.s3=c;
        }
        else
        {
            throw new Exception("Invalid side(s)!");
        }
    }

    public double getS1(){return this.s1;}

    public void setS1(double a) throws Exception{
        if(a > 0) this.s1 = a;
        else throw new Exception("Invalid side(s)!");
    }

    public double getS2() {return this.s2;}

    public void setS2(double b) throws Exception{
        if(b > 0)this.s2 = b;
        else throw new Exception("Invalid side(s)!");
    }

    public double getS3() {return this.s3;}

    public void setS3(double c) throws Exception{
        if(c > 0)this.s3 = c;
        else throw new Exception("Invalid side(s)!");
    }

    @Override
    public double perimeter() { return (getS1()+ getS2() + getS3());}

    @Override
    public String toString() {

        DecimalFormat temp = new DecimalFormat("##0.0000");
        return String.format(this.getClass().getSimpleName() +
                " {s1=" + getS1() +
                ", s2=" + getS2() +
                ", s3=" + getS3() +
                "} perimeter = " + temp.format(perimeter()) + "\n");
    }
}
