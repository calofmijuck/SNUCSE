#include <iostream>
using namespace std;

#ifndef RATIONAL_H
#define RATIONAL_H


class Rational {
  public:
    Rational();
    Rational(int numer, int denom = 1);
    Rational(const Rational &r);
    ~Rational();

    Rational Add(const Rational &r) const;
    Rational Multiply(const Rational &r) const;

    int GetNumerator() const;
    int GetDenominator() const;

    void Insert(ostream &sout) const;
    void Extract(istream &sin);
    Rational& operator=(const Rational &r);
    
  protected:
    void SetNumerator(int numer);
    void SetDenominator(int denom);

  private:
    int NumeratorValue;
    int DenominatorValue;
};

Rational operator+(const Rational &r, const Rational &s);
Rational operator*(const Rational &r, const Rational &s);
ostream& operator<<(ostream &sout, const Rational &s);
istream& operator>>(istream &sin, Rational &r);



#endif

