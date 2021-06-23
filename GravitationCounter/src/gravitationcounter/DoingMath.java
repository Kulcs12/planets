package gravitationcounter;

import java.util.ArrayList;

/**
 *
 * @author Bence
 */
public class DoingMath {
    public double mu;
    public double mass1;
    public double mass2;
    public static double gravConst = 6.7 * Math.pow(10,-11);
    
    
    ArrayList<Double> rvec = new ArrayList();
    ArrayList<Double> r1vec = new ArrayList();
    ArrayList<Double> r2vec = new ArrayList();
    ArrayList<Double> gravF = new ArrayList();
    
    
    public double countMu(){
        mu = gravConst * (mass1 + mass2);
        
        return mu;
}
    
    public ArrayList countDist(){
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

    public ArrayList<Double> getRvec() {
        return rvec;
    }

    public void setRvec(ArrayList<Double> rvec) {
        this.rvec = rvec;
    }

    public ArrayList<Double> getR1vec() {
        return r1vec;
    }

    public void setR1vec(ArrayList<Double> r1vec) {
        this.r1vec = r1vec;
    }

    public ArrayList<Double> getR2vec() {
        return r2vec;
    }

    public void setR2vec(ArrayList<Double> r2vec) {
        this.r2vec = r2vec;
    }

    public ArrayList<Double> getGravF() {
        return gravF;
    }

    public void setGravF(ArrayList<Double> gravF) {
        this.gravF = gravF;
    }

    public double getMass1() {
        return mass1;
    }

    public void setMass1(double mass1) {
        this.mass1 = mass1;
    }

    public double getMass2() {
        return mass2;
    }

    public void setMass2(double mass2) {
        this.mass2 = mass2;
    }
    
    
            
            
}

