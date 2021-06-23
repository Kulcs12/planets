package gravitationcounter;

import java.util.ArrayList;

/**
 *
 * @author Bence
 */
public class GravitationCounter {

    
    
    
    public static void main(String[] args) {
        ArrayList<Double> rvec = new ArrayList();
        ArrayList<Double> r1vec = new ArrayList();
        ArrayList<Double> r2vec = new ArrayList();
        
        r1vec.add(1.0);
        r1vec.add(0.0);
        r1vec.add(3.0);
        
        r2vec.add(0.0);
        r2vec.add(1.0);
        
        System.out.println(r1vec);
        System.out.println(r2vec);
        
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
        
        System.out.println("számolás után: ");
        System.out.println(r1vec);
        System.out.println(r2vec);
        
        
        
    }
    
}
