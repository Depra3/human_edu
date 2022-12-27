library(dplyr)
library(ggplot2)

# 데이터 불러오기
data(iris)
str(iris)

iris %>% 
  select(Species) %>% head()
# head() 쉽게 확인 가능(데이터를 짧게 보여줌)

# 교재 rename
newdf = rename()

# 실제
iris %>% 
  rename("종"="Species") %>% 
  head() %>%
  select("종")

iris %>% head() %>%
  filter(Sepal.Length==5.1 | Sepal.Width==3.0)
# | : or, % : and, ! : not

## 그래프 종류 - 검색 "ggplot2 + 그래프"
ggplot() +
  geom_ ~~~
  
# group by 연산자
new_df = iris %>%
  group_by(Species) %>%
  summarise(avg = mean(Sepal.Length))
new_df

## new_df 막대그래프 코드 작성
ggplot(new_df,~) +~