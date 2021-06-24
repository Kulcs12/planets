package gravitationcounter;

import java.util.ArrayList;

/**
 *  This class does all the math to calculate gravitational force between two objects
 * @author Bence
 */
public class DoingMath {
    private double mu;
    private double mass1;
    private double mass2;
    final double gravConst = 6.7 * Math.pow(10,-11);
    private double gravFCube;
    private double gravFSize;
    
    private ArrayList<Double> r1vec = new ArrayList();
    private ArrayList<Double> r2vec = new ArrayList();
    ArrayList<Double> gravF = new ArrayList();
    ArrayList<Double> rvec = new ArrayList();

    public DoingMath(double mass1, ArrayList<Double> r1vec, double mass2, ArrayList<Double> r2vec) {
        this.mass1 = mass1;
        this.mass2 = mass2;
        this.r1vec = r1vec;
        this.r2vec = r2vec;
    }
    
    public DoingMath(CelestialObj planet1, CelestialObj planet2) {
        this.mass1 = planet1.getMass();
        this.mass2 = planet2.getMass();
        this.r1vec = planet1.getRvec();
        this.r2vec = planet2.getRvec();
        
    }
    
        
    /**
     * calculate mu
     * @return 
     */
    public double calcMu(){
        mu = gravConst * (mass1 + mass2);
        
        return mu;
}
    
    /**
     * calculate distance vector between the two objects
     * @return 
     */
    public ArrayList calcDist(){
        if(r1vec.size() > r2vec.size()){
            int diff = r1vec.size() - r2vec.size();
            
            for(int i = 0; i < diff; i++)
                r2vec.add(0.0);
        }
        
        if(r2vec.size() > r1vec.size()){
            int diff = r2vec.size() - r1vec.size();
            
            for(int i = 0; i < diff; i++)
                r1vec.add(0.0);
        }
        
        for(int i = 0; i < r1vec.size(); i++)
            rvec.add(r2vec.get(i) - r1vec.get(i));
        
        
        return rvec;
    }
    
    /**
     * calculate the gravitational force between two objects
     * @return 
     */
    public ArrayList calcGravForce(){
        rvec.forEach(s -> gravFSize += s*s);
        rvec.forEach(s -> gravFCube += s*s*s);
        for(int i = 0; i < rvec.size(); i++)
            gravF.add(-mu / gravFCube * rvec.get(i));
                
        return gravF;
    }

    public double getMu() {
        return mu;
    }

    public double getGravFCube() {
        return gravFCube;
    }

    public double getGravFSize() {
        return gravFSize;
    }
    
                
}


