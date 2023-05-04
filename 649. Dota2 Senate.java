class Solution {
    public String predictPartyVictory(String senate) {
        int size = senate.length();

        Queue<Integer> RQ = new LinkedList<>();
        Queue<Integer> DQ = new LinkedList<>();

        for(int i = 0; i<size; i++){
            if(senate.charAt(i) == 'R'){
                RQ.add(i);
            }
            else{
                DQ.add(i);
            }
        }

        while(!RQ.isEmpty()  &&  !DQ.isEmpty()){

            int Rturn = RQ.poll();
            int Dturn = DQ.poll();

            if(Dturn < Rturn ){
                DQ.add(Dturn + size);
            }
            else{
                RQ.add(Rturn + size);
            }
        }

        return RQ.isEmpty() ? "Dire" : "Radiant";        

    }
}