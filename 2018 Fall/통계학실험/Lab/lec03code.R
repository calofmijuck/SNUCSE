# 2017-18570 Sungchan Yi
# Department of Computer Science and Engineering

# 1
# Sample 40 integers from 1 to 100
x <- 1:100
sampled <- sample(x, 40, replace=F)

# 1-1
a1 <- sampled[1:8]
a2 <- sampled[9:16]
a3 <- sampled[17:24]
a4 <- sampled[25:32]
a5 <- sampled[33:40]
ans <- rbind(a1, a2, a3, a4, a5)

# 1-2
a2 <- ans[2,]
a3 <- ans[3,]

# 1-3
ans3 <- ans[, c(1, 4, 7, 8)]

# 1-4
col7 <- ans[, 7]
mean <- mean(col7)
var <- var(col7)

# 2
x <- sample(1:20, 1, replace=F)
if(x >= 10) {
    print("P")
} else {
    print("NP")
}

# 3
x <- sample(1:20, 8, replace=F)
for(i in 1:8) {
    if(x[i] >= 10) {
        print("P")
    } else {
        print("NP")
    }
}
