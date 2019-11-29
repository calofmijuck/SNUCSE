# 2017-18570 Sungchan Yi
# 1

textbook <- read.table("C:/Users/?´?„±ì°?/Desktop/2018 SNU/Fall 2018/?†µê³„í•™?‹¤?—˜/textbooks.txt",header=T)

# ê·€ë¬´ê?€?„¤: ~ ì°¨ì´ê°€ ?‚˜ì§€ ?•Š?Š”?‹¤
# ??€ë¦½ê?€?„¤: ~ ì°¨ì´ê°€ ?‚œ?‹¤.

t.test(textbook$diff, mu = 0)

# ?”°?¼?„œ ì°¨ì´ê°€ ?‚œ?‹¤

# 2

run <- read.table("C:/Users/?´?„±ì°?/Desktop/2018 SNU/Fall 2018/?†µê³„í•™?‹¤?—˜/run10samp.txt",header=T)

# ê·€ë¬´ê?€?„¤: ?„±ë³„ì— ?”°?¼ ì°¨ì´ê°€ ?‚˜ì§€ ?•Š?Š”?‹¤.
# ??€ë¦½ê?€?„¤: ?„±ë³„ì— ?”°?¼ ì°¨ì´ê°€ ?‚œ?‹¤.

# ?“±ë¶„ì‚° ê²€? •
var.test(run$time ~ run$gender)

# ê·€ë¬´ê?€?„¤?„ ì±„íƒ?•˜?—¬ ?“±ë¶„ì‚°.

t.test(run$time ~ run$gender, var.equal = T, alternative = "two.sided")

# ??€ë¦½ê?€?„¤?„ ì±„íƒ. ?„±ë³„ì— ?”°?¼ ì°¨ì´ê°€ ?‚œ?‹¤.