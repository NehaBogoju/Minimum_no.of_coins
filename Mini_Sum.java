package DSA;
import java.io.*;
import java.util.*;
@SuppressWarnings("unused")
public class Mini_Sum {
	public int minCoins(int coins[], int M, int V) 
	{ 
	    int m=0;
	    int[] b=new int[M];
	    Arrays.sort(coins);
	    int min=coins[0];
	    //System.out.println("min : "+min);
	    int max=coins[M-1];
	    //System.out.println("max : "+max);
	    for(int i=M-1;i>0;i--) {
	    	int sum=0,count=0;
	    	sum +=coins[i];
	    	//System.out.println("sum : "+sum);
	    	count++;
	    	//System.out.println("count : "+count);
	    	while(sum<V) {
	    		for(int j=i-1;j>=0;j--) {
	    			if((sum+coins[j])<=V) {
	    				sum +=coins[j];
	    				//System.out.println("sum : "+sum);
	    				count++;
	    				//System.out.println("count : "+count);
	    				if((sum)==V) {
		    				//insert in to b[]
		    				b[m]=count;
		    				//System.out.println("b[m] : "+b[m]);
		    				m++;
		    				break;
		    				
		    			}
	    			}
	    		}
	    	}
	    	
	    }
	    Arrays.sort(b);
	    return b[1];
	    //return -1;
	} 
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Mini_Sum ob = new Mini_Sum();
                    System.out.println(ob.minCoins(coins, m, v));
                }
//    		int v=11;
//    		int m=4;
//    		int[] a= {9,5,6,1};
//    		Mini_Sum ob = new Mini_Sum();
//            System.out.println("Min coins : "+ob.minCoins(a, m, v));
        }
}    

