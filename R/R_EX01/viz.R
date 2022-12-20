# 라이브러리 설치
# install.packages("패키지명")
# load 라이브러리
# 파이썬 라이브러리 숫자가 20만개 넘음
# R, 2만개 미만
library(ggplot2)

data("mpg")
str(mpg)

# 산점도
ggplot(mpg, aes(x=displ, y=cty)) + geom_point()

# R의 강점
# 시각화가 매우 좋다!

??geom_point

p <- ggplot(mtcars, aes(wt, mpg))
p + geom_point()
p + geom_point(aes(colour = factor(cyl)))

p <- ggplot(mpg, aes(displ, cty))
p + geom_point()
p + geom_point(aes(colour = factor(cyl)))

# 분석의 끝은 보고서(Report)
# 통계 수치가 들어갔으면 좋겠다.
# 텍스트가 추가 되었으면 좋겠다.
# could not find function "ggplot" 해당 라이브러리가 없음
# 라이브러리 설치
# https://ggplot2.tidyverse.org/
# https://github.com/IndrajeetPatil/ggstatsplot
# install.packages("ggstatsplot")
library(ggstatsplot)
ggscatterstats(
  data  = mpg,
  x     = displ,
  y     = cty,
  xlab  = "REM sleep (in hours)",
  ylab  = "Amount of time spent awake (in hours)",
  title = "Understanding mammalian sleep"
)
# Package `ggside` required for this function to work. 해당 패키기를 요구함.

