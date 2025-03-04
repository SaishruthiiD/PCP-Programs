#include <stdio.h>
void activity(int begin[], int end[], int count)
{
    printf("Selected activities : \n");
    printf("Activity 1 (Start: %d, End: %d)\n", begin[0], end[0]);
    int lastEndTime = end[0];
   
    for(int i=1; i<count; i++)
    {
        if(begin[0] >= lastEndTime)
        {
            printf("Activity %d (Start: %d, End: %d)\n", i+1, begin[i], end[i]);
            lastEndTime = end[i];
        }
    }
}
