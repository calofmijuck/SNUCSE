# Example 1
ames <- read.csv( "C:/Users/이성찬/Desktop/2018 SNU/Fall 2018/통계학실험/ames.csv", header = T)
ames.price <- ames$SalePrice
hist(ames.price)
summary(ames.price)
# skewed to the left

# Example 2
sampledprice <- sample(ames.price, 50, replace = FALSE)
mean(sampledprice)

# Example 3
dev.off()
n <- 50
sample_mean50 <- c()
for (i in 1:5000) {
    x <- sample(ames.price, n, replace = FALSE)
    sample_mean50[i] <- mean(x)
}
hist(sample_mean50)
# Approximately follows the normal distribution

# Example 4
mean(sample_mean50)
mean(ames.price)
mean(sample_mean50) - mean(ames.price) ## very small so they are almost equal
var(sample_mean50)
var(ames.price)
var(sample_mean50) - var(ames.price) / 50 ## nearly equal

# Example 5
dev.off()
n <- 150
sample_mean150 <- c()
for (i in 1:5000) {
    x <- sample(ames.price, n, replace = FALSE)
    sample_mean150[i] <- mean(x)
}
hist(sample_mean150)

par(mfrow=c(1,2))
hist(sample_mean50)
hist(sample_mean150)

# As n increases, the distribution of sample mean gets closer to the normal distribution

# Extra
n <- c(50, 100, 150, 200)
par(mfrow = c(1, 4))
for (j in 1:4) {
    x.mean <- c()
    for (i in 1:5000) {
        x <- sample(ames.price, n[j], replace = FALSE)
        x.mean[i] <- mean(x)
    }
    hist(x.mean)
}
