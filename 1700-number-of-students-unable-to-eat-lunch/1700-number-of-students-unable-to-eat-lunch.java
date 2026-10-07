class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue <Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 0;i<students.length;i++){
            q.add(students[i]);
            q2.add(sandwiches[i]);
        }
        int j ;
        for(int i = 0;i<sandwiches.length;i++){
            j = q.size();
            while(j!=0){
                if(q.peek() == q2.peek()){
                    q.remove();
                    q2.remove();
                    break;
                }
                else{
                  int a=  q.remove();
                  q.add(a);
                }
                j--;
            }
            
            }
        
       
        if(!q.isEmpty()){
            return q.size();
        }
        else
        return 0;
    }
}