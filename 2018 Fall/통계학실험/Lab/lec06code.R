# 2017-18570 Sungchan Yi
# 1

textbook <- read.table("C:/Users/?΄?±μ°?/Desktop/2018 SNU/Fall 2018/?΅κ³ν?€?/textbooks.txt",header=T)

# κ·λ¬΄κ??€: ~ μ°¨μ΄κ° ?μ§ ???€
# ??λ¦½κ??€: ~ μ°¨μ΄κ° ??€.

t.test(textbook$diff, mu = 0)

# ?°?Ό? μ°¨μ΄κ° ??€

# 2

run <- read.table("C:/Users/?΄?±μ°?/Desktop/2018 SNU/Fall 2018/?΅κ³ν?€?/run10samp.txt",header=T)

# κ·λ¬΄κ??€: ?±λ³μ ?°?Ό μ°¨μ΄κ° ?μ§ ???€.
# ??λ¦½κ??€: ?±λ³μ ?°?Ό μ°¨μ΄κ° ??€.

# ?±λΆμ° κ²? 
var.test(run$time ~ run$gender)

# κ·λ¬΄κ??€? μ±ν??¬ ?±λΆμ°.

t.test(run$time ~ run$gender, var.equal = T, alternative = "two.sided")

# ??λ¦½κ??€? μ±ν. ?±λ³μ ?°?Ό μ°¨μ΄κ° ??€.