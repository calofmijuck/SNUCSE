#include <iostream>
#include <iomanip>

using namespace std;

bool arrequal(int arr1[], int arr2[],int n);

int main()
{
  freopen("in.txt", "r", stdin);
  int n;
  cin >> n;
  int arr1[3][n], arr2[3][n]; 
  for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < n; j++)
	{
	  cin >> arr1[i][j];	  
	}
    }
  for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < n; j++)
	{
	  cin >> arr2[i][j];	  
	}
    }
  if(arr1[0][0] != arr1[2][n - 1] || arr1[0][n - 1] != arr1[1][0] || arr1[1][n - 1] != arr1[2][0] || arr2[0][0] != arr2[2][n - 1] || arr2[0][n - 1] != arr2[1][0] || arr2[1][n - 1] != arr2[2][0])
    {
      cout << "Format Error\n";
      return 0;
    } else
    {
      bool case1 = true, case2 = true, case3 = true;
      for(int i = 0; i < 3; i++)
	{
	  if(!arrequal(arr1[i], arr2[(i + 1) % 3], n))
	    {
	  //  	cout << "case1";
	      case1 = false;
	    }
	}
      for(int i = 0; i < 3; i++)
	{
	  if(!arrequal(arr1[i], arr2[(i + 2) % 3], n))
	    {
	  //  	cout << "case2";
	      case2 = false;
	    }
	}
      for(int i = 0; i < 3; i++)
	{
	  if(!arrequal(arr1[i], arr2[i], n))
	    {
//	    	cout << "case3";
	      case3 = false;
	    }
	}
      if(case1 || case2 || case3)
	{
	  cout << "True\n";
	}
      else
	{
	  cout << "False\n";
	}
    }
}


bool arrequal(int arr1[], int arr2[], int n)
{
  int len = n;
//  cout << arr1 << endl << *arr1;
  for(int i = 0; i < len; i++)
    {
 //   	cout << arr1[i] << arr2[i] << len << " "<< endl;
      if(arr1[i] != arr2[i])
	{
//		cout << "false" << endl;
	  return false;
	}
    }
 //   cout << "true" << endl;
  return true;
}

