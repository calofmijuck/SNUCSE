sx = [64.521, 58.666, 52.473, 46.617, 40.649, 34.681, 28.826, 22.971, 17.341]
sy = [-43.914, -43.126, -42.901, -43.013, -43.802, -45.04, -46.617, -48.869, -51.571]

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
