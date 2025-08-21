package rated1000;

import java.util.*;

public class shoeshuff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            solve(sc);
            t--;
        }
        sc.close();
    }
    public static void solve(Scanner sc){
        int n=sc.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        HashMap<Long,Integer> map=new HashMap<>();
        for(long a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        boolean single=false;
        for(int x:map.values()){
            if(x==1){
                single=true;
            }
        }
        if(single){
            System.out.println(-1);
            return;
        }
        List<Integer> students=new ArrayList<>();
        for(int i=0;i<n;i++){
            students.add(i+1);
        }

        int l=0;
        int r=0;
        while(r<n){
            if(arr[l]==arr[r]){
                r++;
            }
            else{
                Collections.rotate(students.subList(l,r),-1);
                l=r;
            }
        }
        Collections.rotate(students.subList(l,r),-1);

        for(int x:students){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
