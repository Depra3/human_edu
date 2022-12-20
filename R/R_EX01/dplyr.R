# 데이터 가공
# sql과 문법이 매우 유사하다!
# https://dplyr.tidyverse.org/
# dplyr
# select = select
# filter = where
# arrange = order by
library(dplyr)

data(iris)
str(iris)

# filter 조건문, 행 추출
# sepal.length가 5이상인 데이터만 추출
# %>% 연결(체인) 연산자 (데이터를 연결)
# data2 = iris %>% filter(Sepal.Length >= 5)
# SELECT * FROM iris WHERE sepal.length >= 5 와 유사
data2 = iris %>% 
  filter(Sepal.Length >= 5) %>% 
  select(Sepal.Length, Petal.Length, Species) %>%
  group_by(Species) %>%
  summarise(total = sum(Sepal.Length),
            avg = mean(Sepal.Length))
data2
