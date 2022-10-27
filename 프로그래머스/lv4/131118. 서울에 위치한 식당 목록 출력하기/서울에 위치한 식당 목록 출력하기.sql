-- 코드를 입력하세요
SELECT a.REST_ID,	REST_NAME,	FOOD_TYPE,	FAVORITES,	ADDRESS	, round(avg(review_score),2) SCORE from rest_info as a
join rest_review as b 
on a.rest_id = b.rest_id
where address like ('서울%')
group by a.rest_id
order by score desc, views desc;