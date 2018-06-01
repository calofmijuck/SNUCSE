#include <iostream>
#include <string>
#include <cmath>
using namespace std;

bool checkExp(int level, int exp)
{
    int correct = 10 * pow(2, level - 1) - 1;
    if(correct >= exp)
        {
	return true;
        }
    else
        {
	return false;
        }
}

int main()
{
    int num;
    cin >> num;
    int arr[10000];
    int exp[10000];
    int val;
    for(int i = 0; i < num; i++)
        {
	cin >> val;
	exp[i] = val;
        }
    for(int i = 0; i < num; i++)
        {
	cin >> val;
	arr[i] = val;
	if(checkExp(exp[i], val))
	    {
	        continue;
	    }
	else
	    {
	        cout << "Invalid Input!\n";
	        return 0;
	    }
        }
    int inc = 0, dec = 0, cons = 0;
    for(int i = 0; i < num - 1; i++)
        {
	if(arr[i] < arr[i + 1])
	    {
	        inc++;
	    }
	else if(arr[i] > arr[i + 1])
	    {
	        dec++;
	    }
	else if(arr[i] == arr[i + 1])
	    {
	        cons++;
	    }
        }
    if(inc == num - 1)
        {
	cout << "Increasing\n";
	return 0;
        }
    if(dec == num - 1)
        {
	cout << "Decreasing\n";
	return 0;
        }
    if(cons == num - 1)
        {
	cout << "Constant\n";
	return 0;
        }
    if(inc > 0 && dec > 0 && cons == 0)
        {
	cout << "Dynamic\n";
        }
    else
        {
	cout << "Others\n";
        }
    
}
