import java.util.*;
public class Floyd_Warshal {
    final static int INF = 99999, V = 4;
    void floyd(int [][]graph){
        int [][]dist= new int[V][V];
        int i,j,k;
        for (i = 0; i < V; i++)
            for (j = 0; j < V; j++)
                dist[i][j] = graph[i][j];

        for( k=0;k<V;k++){
//            Vertices as source
            for(i=0;i<V;i++){
//                Destination
                for(j=0;j<V;j++){
//                  vertex k - ditance from i to j
                    if(dist[i][k] + dist[k][j]<dist[i][j])
                        dist[i][j]=dist[i][k] + dist[k][j];

                }
            }
        }

    }




    public static void main(String args[]){
        int [][]graph= { {0,   5,  INF, 10},
                {INF, 0,   3, INF},
                {INF, INF, 0,   1},
                {INF, INF, INF, 0}
        };
        Floyd_Warshal obj= new Floyd_Warshal();
        obj.floyd(graph);

    }
}