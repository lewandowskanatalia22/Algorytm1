package Graphs;

import com.sun.corba.se.impl.orbutil.graph.Graph;

/**
 * Created by jan on 2017-08-20.
 */
public class Graphs {
    public static void main(String[] args) {

       // generateGnk(4,3);
      // generateGnp(4, 0.5);
        transformEtoA(4,3);
    }
    public static void generateGnp(int n, double p){
        boolean[][] result = GraphGnp.generateGnp(n,p);
        PrintStructures.printA(result);

    }
    public static void generateGnk(int n, int k){
        Edge[] result = GraphGnk.generetaGnk(n,k);
        PrintStructures.print(result);
    }
    public static void transformEtoA(int n, int k) {
        Edge[]graphGnk= GraphGnk.generetaGnk(n,k);
        PrintStructures.print(graphGnk);
        boolean[][] result = Transforms.transformEtoA(n,k,graphGnk);
        PrintStructures.printA(result);
    }
}
