

package shapes;

import java.text.DecimalFormat;

public class Circle implements Shape{
    double r;

    public Circle(double radius) throws Exception{
        if(radius> 0){
            this.r = radius;
        }
        else
        {
            throw new Exception("Invalid radius!");
        }
    }

    public void setR(double r) throws Exception {
        if(r > 0)
        {
            this.r = r;
        }
        else
        {
            throw new Exception("Invalid radius!!!");
        }
    }

    public double getR() {
        return r;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * getR();
    }

    public String toString(){
        DecimalFormat temp = new DecimalFormat("##0.0000");
        return String.format(this.getClass().getSimpleName()+" {r=" + getR() + "} perimeter = " + temp.format(perimeter()) + "\n" );
    }

}
