# 2017-18570 Sungchan Yi

# 1
male <- c(288, 10, 61)
female <- c(378, 7, 62)
x <- rbind(male, female)
x
chisq.test(x)


# 2
live <- c(11, 14)
dead <- c(39, 26)
y <- rbind(live, dead)
y
chisq.test(y)
