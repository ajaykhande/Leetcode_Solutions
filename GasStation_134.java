public class GasStation_134 {
  public static int  canCompleteCircuit(int[] gas,int [] cost) {
          int totalgas = 0,totalcost=0;
          int tank = 0;
          int start = 0;
        //Unique solution always exists
          for (int i = 0; i < cost.length; i++) {
              totalgas += gas[i];
              totalcost += cost[i];
              tank += gas[i]-cost[i];

            if(tank<0){
                start = i+1;
                tank =0;
            }
                
               }
            
               return totalgas<totalcost? -1 : start;
            }
    
    public static void main(String[] args) { 
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
         System.out.println(canCompleteCircuit(gas, cost));
        
    }
}
