#include <stdio.h>

int main() {
    int arr[] = {1,2,5,8,14,7,8,2,1,5,2};
    int n = sizeof(arr) / sizeof(arr[0]);
    int freq[n];
    int i, j, count;

    for(i=0; i<n; i++) {
        freq[i] = -1;
    }

    for(i=0; i<n; i++) {
        count = 1;
        for(j=i+1; j<n; j++) {
            if(arr[i] == arr[j]) {
                count++;
                freq[j] = 0;
            }
        }
        if(freq[i] != 0) {
            freq[i] = count;
        }
    }

    printf("Frequency of elements in the array:\n");
    for(i=0; i<n; i++) {
        if(freq[i] != 0) {
            printf("%d occurs %d times\n", arr[i], freq[i]);
        }
    }

    return 0;
}
