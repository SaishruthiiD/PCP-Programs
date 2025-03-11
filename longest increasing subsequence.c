int lengthOfLIS(int* nums, int numsSize) {
    if(numsSize == 0)
    return 0; 

    int dp[numsSize];
    int len = 1;

    for (int i = 0; i< numsSize; i++) {
        dp[i] = 1;
    }

    for (int i = 1; i<numsSize; i++) {
        for (int j = 0; j < i; j++) {
            if(nums[j]<nums[i] && dp[i] < dp[j]+1) {
                dp[i] = dp[j]+1;
            }
        }
        if(dp[i] > len)
        len = dp[i];
    }
    return len; 
}
