s =[-1.576, -3.265, -6.08, -10.021, -14.863, -21.169, -28.15, -36.708, -46.054]
v =[]
a =[]

for i in range(0, len(s)-1):
    v.append((s[i+1]-s[i]) / 0.033 )

for i in range(0, len(v)-1):
    a.append((v[i+1]-v[i]) / 0.033 )

print v
print a

S = sum(a) / len(a)

print S
