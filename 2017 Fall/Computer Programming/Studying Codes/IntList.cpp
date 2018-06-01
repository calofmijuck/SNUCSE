#include <iostream>
#include <assert.h>
using namespace std;

class IntList {
  public:
    IntList(int n = 10, int val = 0) {
        assert(n > 0);
        NumberValues = n;
        Values = new int [n];
        assert(Values);
        for(int i = 0; i < n; i++) {
	Values[i] = val;
        }
    }
    IntList(const int A[], int n);
    IntList(const IntList &A) {
        NumberValues = A.size();
        Values = new int [size()];
        assert(Values);
        for(int i = 0; i < size(); ++i) {
	Values[i] = A[i];
        }
    }

    ~IntList() {
        delete [] Values;
    }
    
    int size() const {
        return this->NumberValues;
    }
    
    IntList& operator=(const IntList &A) {
        if(this != &A) {
	delete [] Values;
	NumberValues = A.size();
	Values = new int [A.size()];
	assert(Values);
	for(int i = 0; i < A.size(); i++) {
	    Values[i] = A[i];
	}
        }
        return *this;
    }

    const int& operator[](int i) const {
        assert((i >= 0) && (i < size()));
        return Values[i];
    }

    int& operator[](int i) {
        assert((i >= 0) && (i < size()));
        return Values[i];
    }
    
    
  private:
    int *Values;
    int NumberValues;
    
};


int main() {
    IntList A(3, 1);
    A[2] = 2;
    for(int i = 0; i < A.size(); i++) {
        cout << A[i] << " ";
    }
    cout << endl;
    IntList B(10, 2);
    A = B;
    for(int i = 0; i < A.size(); i++) {
        cout << A[i] << " ";
    }
}

 
