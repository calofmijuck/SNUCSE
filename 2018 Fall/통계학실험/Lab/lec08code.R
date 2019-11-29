# 2017-18570 Sungchan Yi
# 
# 1
# (1)
handspan <- read.table("C:/Users/이성찬/Desktop/2018 SNU/Fall 2018/통계학실험/handspan.txt",header=T)
cor(handspan$HandSpan, handspan$Height)
plot(handspan$HandSpan, handspan$Height)

# (2)
cor.test(handspan$HandSpan, handspan$Height)

# (3)
lm(handspan$Height ~ handspan$HandSpan)
handspan.res <- lm(handspan$Height ~ handspan$HandSpan)
summary(handspan.res)
anova(handspan.res)

# (4)
par(mfrow = c(2, 2))
plot(handspan.res)

# 2
# (1)
car <- read.table("C:/Users/이성찬/Desktop/2018 SNU/Fall 2018/통계학실험/carstopping.txt",header=T)
cor.test(car$StopDist, car$Speed)

# (2)
car.res <- lm(car$StopDist ~ car$Speed)
anova(car.res)
summary(car.res)

# (3)
plot(car.res)
# No

# (4)
sqrt.dist <- sqrt(car$StopDist)
x <- car$Speed
plot(x, sqrt.dist)
# Very linear
# 
# (5)
car2.res <- lm(x ~ sqrt.dist)
summary(car2.res)

# (6)
plot(car2.res)
# Good!


# 3
# (1)
hos <- read.table("C:/Users/이성찬/Desktop/2018 SNU/Fall 2018/통계학실험/hospital.txt",header=T)
plot(hos$InfctRsk, hos$Stay) # Yes
plot(hos$InfctRsk, hos$Age)  # No
plot(hos$InfctRsk, hos$Age)  # No

cor.test(hos$InfctRsk, hos$Stay) # Yes
cor.test(hos$InfctRsk, hos$Age)  # No
cor.test(hos$InfctRsk, hos$Age)  # No

# (2)
hos.res <- lm(InfctRsk ~ Stay + Age + Xray, data = hos)
summary(hos.res)
# Model is significant  
# Stay, Xray are significant

# (3)
plot(hos.res)
