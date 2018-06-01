#include <iostream>
#include <cstdlib>
#include <iomanip>

using namespace std;

int main()
{
  freopen("in.txt", "r", stdin);
  string s;
  int sum = 0, n = 0;
  while( cin >> s)
    {
	sum += s.length();
	n++;
    }
  cout << "Average Length: " << setprecision(2) << fixed << (double) sum / n << endl << "# of words: " << n;
}
