int longestCommonSubsequence(char* text1, char* text2) {
    int m = strlen(text1);
    int n = strlen(text2);
    int arr[m+1][n+1];
    for (int i = 0; i <= m; i++) {
        for (int j = 0; j <= n; j++) {
            if (i == 0 || j == 0) {
                arr[i][j] = 0; 
            }
            else if (text1[i-1] == text2[j-1])
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
