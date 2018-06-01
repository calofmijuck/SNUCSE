s =[-1.013, -1.126, -2.139, -3.941, -6.981, -11.034, -16.214, -22.52, -29.952, -38.509, -48.869]
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
