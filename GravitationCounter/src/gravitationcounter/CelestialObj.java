package gravitationcounter;

import java.util.ArrayList;

/**
 *
 * @author Bence
 */
public class CelestialObj {
    private double mass;
    private ArrayList<Double> rvec = new ArrayList();
    private String name;

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public ArrayList<Double> getRvec() {
        return rvec;
    }

    public void setRvec(ArrayList<Double> rvec) {
        this.rvec = rvec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
