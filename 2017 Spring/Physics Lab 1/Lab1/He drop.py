s =[-2.589, -3.265, -4.616, -7.093, -10.246, -14.413, -20.043, -26.461, -33.893, -42.45, -52.022]
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
