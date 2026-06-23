class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0 ; 
        int current_gas = 0 ;
        int start = 0 ; 

        for( int i=0; i<gas.length; i++){ 
            int diff = gas[i] - cost[i];
            total_gas += diff; 
            current_gas += diff ; 
    
        if ( current_gas < 0){ 
            start = i + 1 ; 
            current_gas = 0 ; 
        }
        }
        return total_gas >= 0 ? start : -1 ; 
        
    }
}
