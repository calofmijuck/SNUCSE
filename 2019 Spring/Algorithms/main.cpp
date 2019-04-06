#include "./hw1_cpp.h"
#include <cstdio>

int main(){
    int a[10] = { 4, 5, 1, 3, 6, 7, 9, 10, 2, 8 };
    int n = 10;
    int k = 4;
    int ans1 = randomized_select(a, n, k);
    if(checker(a, n, k, ans1)==true){
        printf("%s","correct");
    }
    else{
        printf("%s","incorrect");
    }
    int ans2 = deterministic_select(a, n, k);
    if(checker(a, n, k, ans1)==true){
        printf("%s","correct");
    }
    else{
        printf("%s","incorrect");
    }
    return 0;
}
