

package shapes;

import java.text.DecimalFormat;

public class Parallelogram extends Rectangle{

    public Parallelogram(double w, double h) throws Exception{

        if(w > 0.0 && h > 0.0)
        {
            super.setH(h);
            super.setW(w);
        }
        else
        {
            throw new Exception("Invalid side(s)!");
        }
    }

    @Override
    public double perimeter() {
        return ((2*super.getH()) + (2*super.getW()));
    }

    @Override
    public String toString() {
        DecimalFormat temp = new DecimalFormat("##0.0000##");
        return String.format(this.getClass().getSimpleName() + " {w=" + getW() + ", h=" + getH() + "} perimeter = " + temp.format(perimeter()) + "\n");
    }
}
