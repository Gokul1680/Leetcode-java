HashSet<Integer> set;
    int count;
    public int arrayNesting(int[] nums) {

    int max_count = 0;
        set  = new HashSet();
        for(int i = 0 ; i < nums.length ; i++){
            int j = i;
            if(!set.contains(nums[j])) {
                count = 0;
                dfs(nums, j);
                if (count > max_count) {
                    max_count = count;
                }
            }
        }
        return max_count;
    }
    
    private void dfs(int[] nums , int j){
        set.add(nums[j]);
        j = nums[j];
        count++;
        if(!set.contains(nums[j])){
            dfs(nums,j);
        }
    }
