s =[42.394, 41.93, 40.351, 37.651, 33.929, 29.311, 23.443, 16.683, 8.677, 0, -9.685]
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
