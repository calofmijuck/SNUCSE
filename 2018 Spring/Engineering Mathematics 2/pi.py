import random

## Total number of iterations
iter = 100000000

## How many iterations satisfy the constraint
count = 0

for i in range(0, iter):
    ## Generate two random values from [0, 1)
    x = random.random()
    y = random.random()

    if x **2 + y ** 2 <= 1:
        count += 1

print("pi is approximately {0:.11f}".format(4 * count / iter))
