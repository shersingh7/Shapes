

package shapes;

import java.text.DecimalFormat;

public class Square extends Rectangle{

    public Square(double s) throws Exception{
        super(s, s);
    }

    @Override
    public double perimeter() {
        return 4 * getW();
    }

    @Override
    public String toString() {

        DecimalFormat temp = new DecimalFormat("##0.0000##");
        return String.format(this.getClass().getSimpleName() + " {s=" + getW() + "} perimeter = " + temp.format(perimeter()) + "\n");
    }
}
