# 2017-18570 Sungchan Yi

# 1
tv <- c(16,19,25,22,21,15,16,22,21,18)
news <- c(13,14,15,16,15,13,19,16,20,14,11)
radio <- c(18,18,15,14,14,10,18,15,15)
mag <- c(11,15,11,17,17,13,14,16,13,11)
data <- c(tv, news, radio, mag)
A <- factor(rep(1:4, c(10, 11, 9, 10)))
res <- data.frame(data, A)
fit <- lm(data ~ A, data = res)            
anova(fit)

