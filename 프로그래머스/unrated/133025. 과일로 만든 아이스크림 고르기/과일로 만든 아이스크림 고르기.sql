-- 코드를 입력하세요
SELECT distinct a.flavor from first_half as a
inner join icecream_info as b on a.flavor = b.flavor
where a.total_order>=3000 and INGREDIENT_TYPE='fruit_based'
order by a.total_order desc;




# -- 코드를 입력하세요

# SELECT A.FLAVOR
# FROM FIRSTHALF AS A
# INNER JOIN ICECREAMINFO AS B
# ON A.FLAVOR=B.FLAVOR
# WHERE A.TOTALORDER>=3000 AND INGREDIENTTYPE LIKE 'fruitbased'
# ORDER BY A.TOTALORDER DESC