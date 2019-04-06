#include <random>
#include <cstdio>
#include <algorithm>

void swap(int a[], int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
}

int randomized_partition(int a[], int st, int ed) {
    srand(time(NULL));
    int pIdx = st + rand() % (ed - st + 1);
    swap(a, ed, pIdx);
    int x = a[ed]; // pivot element
    int i = st - 1;
    for(int j = st; j < ed; ++j) {
        if(a[j] <= x)
            swap(a, ++i, j); // increment i then swap
    }
    swap(a, ++i, ed);
    return i;
}

int randkth(int a[], int st, int ed, int k) {
    if(st == ed) return a[st];
    int pivot = randomized_partition(a, st, ed); // index of pivot
    int idx = pivot - st + 1; // index of pivot from st
    if(k < idx) return randkth(a, st, pivot - 1, k);
    else if(k > idx) return randkth(a, pivot + 1, ed, k - idx);
    else return a[pivot];
}

//find the "k"th smallest element in array "a" with "n" elements by using Randomized-select in CLRS
int randomized_select(int a[], int n, int k) {
    int* arr = (int*) malloc(1000000001);
    std::copy(a, a + n, arr);
    int ret = randkth(arr, 0, n - 1, k);
    return ret;
}

int median(int arr[], int n) {
    std::sort(arr, arr + n);
    return arr[n / 2];
}

int partition(int arr[], int st, int ed, int x) {
    // search for x in arr, and move it to the end
    int i;
    for(i = st; i < ed; ++i) {
        if(arr[i] == x) break;
    }
    swap(arr, i, ed);
    // Partition
    i = st - 1;
    for(int j = st; j < ed; ++j) {
        if(arr[j] <= x) // increment i then swap arr[i] and arr[j]
            swap(arr, ++i, j);

    }
    swap(arr, ++i, ed);
    return i;
}

int detkth(int arr[], int st, int ed, int k) {
    int n = ed - st + 1; // number of elements
    int i;
    int* med = (int*) malloc((n + 4) / 5);
    for(i = 0; i < n / 5; ++i)
        med[i] = median(arr + st + 5 * i, 5);
    if(5 * i < n) {
        med[i] = median(arr + st + 5 * i, n % 5);
        i++;
    }
    // choose median of medians
    int medOfMed = (i == 1) ? med[i - 1] : detkth(med, 0, i - 1, i / 2);
    int pivot = partition(arr, st, ed, medOfMed);
    int idx = pivot - st + 1;
    if(idx == k) return arr[pivot];
    else if(idx > k) return detkth(arr, st, pivot - 1, k);
    else return detkth(arr, pivot + 1, ed, k - idx);
}

//find the "k"th smallest element in array "a" with "n" elements by using the worst-case linear-time algorithm in CLRS
int deterministic_select(int a[], int n, int k) {
    int* arr = (int*) malloc(1000000001);
    std::copy(a, a + n, arr);
    return detkth(arr, 0, n - 1, k);
}

//check whether the "k"th smallest element in array "a" with "n" elements is the "ans"
bool checker(int a[], int n, int k, int ans){
    int cnt = 0;
    for(int i = 0; i < n; ++i) {
        if(ans > a[i]) cnt++;
    }
    if(cnt + 1 == k) return true;
    else return false;
}
