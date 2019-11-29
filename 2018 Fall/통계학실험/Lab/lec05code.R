# Example 1
ames <- read.csv( "C:/Users/이성찬/Desktop/2018 SNU/Fall 2018/통계학실험/ames.csv", header = T)
area <- ames$Gr.Liv.Area
mean <- mean(area)
var <- var(area)

# Example 2
n <- 60
sampled <- sample(area, n, replace=FALSE)
sampledmean <- mean(sampled)

# Example 3
alpha <- 0.05
sigma <- sd(area)
range <- qnorm(1 - alpha / 2) * sigma / sqrt(n)
lower <- sampledmean - range
upper <- sampledmean + range
mean
if(lower <= mean && upper >= mean) print("YES") else print("NO")

# Example 4
lower <- c()
upper <- c()
range <- qnorm(1-alpha/2) * sigma / sqrt(n)
pop.mean <- mean(area)
for(i in 1:50) {
    sampled <- sample(area, n, replace=FALSE)
    sampledmean <- mean(sampled)
    lower[i] <- sampledmean - range
    upper[i] <- sampledmean + range
}
plot_ci <- function(lo, hi, m) {
    par(mar=c(2, 1, 1, 1), mgp=c(2.7, 0.7, 0))
    k <- length(lo)
    ci.max <- max(rowSums(matrix(c(-1 * lo, hi), ncol=2)))
    xR <- m + ci.max * c(-1, 1)
    yR <- c(0, 41 * k / 40)
    plot(xR, yR, type='n', xlab='', ylab='', axes=FALSE)
    abline(v=m, lty=2, col='#00000088')
    axis(1, at=m, paste("mu = ", round(m, 4)), cex.axis=1.15)
    for(i in 1:k) {
        x <- mean(c(hi[i], lo[i]))
        ci <- c(lo[i], hi[i])
        if (lo[i]>m | m>hi[i]) {
            col <- "#F05133"
            points(x, i, cex=1.4, col=col)
            lines(ci, rep(i, 2), col=col, lwd=5)
        }
        col <- 1
        points(x, i, pch=20, cex=1.2, col=col)
        lines(ci, rep(i, 2), col=col)
    }
}
plot_ci(lower, upper, pop.mean)
    