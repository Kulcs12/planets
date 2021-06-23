package gravitationcounter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bence
 */
public class GravitationCounter {
    
    
    
    public static void main(String[] args) {
        
        ArrayList<Double> r1vec = new ArrayList();
        ArrayList<Double> r2vec = new ArrayList();
        
        System.out.println("Adja meg az első objektum tömegét: ");
        Scanner in = new Scanner(System.in);
        double mass1 = in.nextDouble();
        
        System.out.println("Adja meg az első objektum dimenzióját: ");
        int dim = in.nextInt();
        
        System.out.println("Adja meg az első objektum koordinátáit: ");
        for(int i = 0; i < dim; i++)
            r1vec.add(in.nextDouble());
        
        System.out.println("Adja meg a második objektum tömegét: ");
        double mass2 = in.nextDouble();
        
        System.out.println("Adja meg a második objektum dimenzióját: ");
        int dim2 = in.nextInt();
        
        System.out.println("Adja meg a második objektum koordinátáit: ");
        for(int i = 0; i < dim2; i++)
            r2vec.add(in.nextDouble());
        
        in.close();
        
        System.out.println("A megadott tömeg: " + mass1 + ", " + mass2);
        System.out.println("A megadott helykoordináták; " + r1vec);
        System.out.println("A megadott második helykoordináták; " + r2vec);
        
        
        
        
    }
    
}
