sx = [67.899, 62.719, 57.089, 51.684, 46.279, 41.1, 35.807, 30.628, 25.335, 20.043, 15.314, 10.022, 4.954]
sy = [-44.027, -41.775, -39.523, -37.946, -36.82, -36.257, -36.145, -36.595, -37.496, -38.735, -40.761, -43.013, -46.054]

vx =[]
vy =[]
a =[]

for i in range(0, len(sx)-1):
    vx.append((sx[i+1]-sx[i])/ 0.033)
    
for i in range(0, len(sy)-1):
    vy.append((sy[i+1]-sy[i]) / 0.033 )

for i in range(0, len(vy)-1):
    a.append((vy[i+1]-vy[i]) / 0.033 )

print vx
print vy
print a


S = sum(a) / len(a)

print S
