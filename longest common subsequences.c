int longestCommonSubsequence(char* a, char* b) {
    int m = strlen(a);
    int n = strlen(b);
    int arr[m+1][n+1];
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0 || j == 0) {
                arr[i][j] = 0; 
            }
            else if (a[i-1] == b[j-1])
            {
                arr[i][j] = arr[i-1][j-1] +1;
            }
            else {
                arr[i][j] = arr[i-1][j] > arr[i][j-1] ? arr[i-1][j] : arr[i][j-1];
            }
        }
    }
    return arr[m][n];
}
