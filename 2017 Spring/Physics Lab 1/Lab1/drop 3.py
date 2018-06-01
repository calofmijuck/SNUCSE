s =[-1.689, -2.252, -4.391, -7.319, -11.598, -16.89, -23.196, -30.852, -39.635, -49.544]
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
