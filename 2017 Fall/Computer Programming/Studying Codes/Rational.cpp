#include <iostream>
#include <cassert>
#include "Rational.h"
using namespace std;

Rational::Rational() {
    SetNumerator(0);
    SetDenominator(1);
}

Rational::Rational(int numer, int denom) {
    SetNumerator(numer);
    SetDenominator(denom);
}

Rational::Rational(const Rational &r) {
    SetDenominator(r.GetNumerator());
    SetDenominator(r.GetDenominator());
}

Rational::~Rational() {
    
}

int Rational::GetNumerator() const {
    return NumeratorValue;
}

int Rational::GetDenominator() const {
    return DenominatorValue;
}

void Rational::SetNumerator(int numer) {
    NumeratorValue= numer;
}

void Rational::SetDenominator(int denom) {
    if(denom != 0) {
        DenominatorValue = denom;
    } else {
        cout << "Illegal denominator: " << denom << "using 1" << endl;
        DenominatorValue = 1;
    }
}

Rational Rational::Add(const Rational &r) const {
    int a = GetNumerator();
    int b = GetDenominator();
    int c = r.GetNumerator();
    int d = r.GetDenominator();
    return Rational(a * d + b * c, b * d);
}

Rational Rational::Multiply(const Rational &r) const {
    int a = GetNumerator();
    int b = GetDenominator();
    int c = r.GetNumerator();
    int d = r.GetDenominator();
    return Rational(a * c, b * d);
}

void Rational::Insert(ostream &sout) const {
    sout << GetNumerator() << "/" << GetDenominator();
}

void Rational::Extract(istream &sin) {
    int numer;
    int denom;
    char slash;
    sin >> numer >> slash >> denom;
    assert(slash == '/');
    SetNumerator(numer);
    SetDenominator(denom);
}

Rational operator+(const Rational &r, const Rational &s) {
    return r.Add(s);
}

Rational operator*(const Rational &r, const Rational &s) {
    return r.Multiply(s);
}

Rational& Rational::operator=(const Rational &r) {
    SetNumerator(r.GetNumerator());
    SetDenominator(r.GetDenominator());
    return *this;
}

ostream& operator<<(ostream &sout, const Rational &r) {
    r.Insert(sout);
    return sout;
}

istream& operator>>(istream &sin, Rational &r) {
    r.Extract(sin);
    return sin;
}
