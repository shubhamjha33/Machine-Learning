import org.apache.commons.math3.ml.clustering.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author shubham
 */
public class DBScanClustering {
    
    static DBSCANClusterer cluster;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int num;
        cluster=new DBSCANClusterer(2,2);
        ArrayList<Point> arr=new ArrayList();
        while(n-->0){
            num=Integer.parseInt(br.readLine());
            arr.add(new Point(num));
        }
        List result=cluster.cluster(arr);
        List<Point> ls;
        int i,j;
        for(i=0;i<result.size();i++){
            ls=(List<Point>) result.get(i);
            for(j=0;j<ls.size();j++){
                System.out.println(ls);
            }
        }
    }
    
}

class Point implements Clusterable{
    int x;
    
    public Point(int x){
        this.x=x;
    }
    
    @Override
    public double[] getPoint() {
        double[] arr={x,x};
        return arr;
    }
    
}