-- 조건 : score점수를 임의로 저장하세요, 더 많은 insert 문장으로 데이터 추가하고
select * from learn_tbl lt;
select * from lecture_tbl lt2;
-- 첫번째는 판매정보를 출력하는 select 쿼리문장과 두번째는 수강정보를 출력하는 select 쿼리문장을 본인만의 뷰 이름을 이용하여 생성
create view saled_info_tbl 
as
	select * 
	from saled_tbl
;

create or replace view saled_info_tbl
as
	select st.id, st.product, st.qty, st.price, st.discount, ct.name as customer_name
	from saled_tbl as st
	join contact_tbl as ct on st.contact_id = ct.id;
;

create view learn_info_tbl
as
	select lt.id, lt2.subject as subject_name, lt.score, ct.name as student_name
	from learn_tbl as lt
	join lecture_tbl as lt2 on lt.lecture_id = lt2.id
	join contact_tbl as ct on lt.contact_id = ct.id
;

create or replace view learn_info_tbl
as
	select lt.id, lt2.subject as subject_name, lt.score, ct.name as student_name, lt2.start_dt, lt2.end_dt
	from learn_tbl as lt
	join lecture_tbl as lt2 on lt.lecture_id = lt2.id
	join contact_tbl as ct on lt.contact_id = ct.id
;

-- 수강정보에 대한 쿼리
select * from learn_info_tbl lit;
select * from learn_tbl lt;
select * from lecture_tbl lt2;
-- 수강학생별로 수강중인 과목의 가장빠른 시작일자와 가능 늦은 끝일자를 출력하세요
select lit.id, lit.subject_name, min(lit.start_dt) as start_dt, max(lit.end_dt) as end_dt
from learn_info_tbl as lit
	group by lit.student_name;
-- 각 과목별로 수강하는 학생 인원 수를 출력하세요
-- 각 과목별로 최우수점수 학생 이름과 score를 출력
select subject, max(score)
from learn_info_tbl lit 
-- 각 과목별로 최하위점수 학생 이름과 score를 출력

-- 판매정보에 대한 쿼리
SELECT * from saled_info_tbl sit;
-- 각 고객별로 판매 총 금액을 내림차순으로 출력하세요.
select ct.name as customer_name, SUM(st.price * st.qty - st.discount) as final_price
from saled_tbl as st
join contact_tbl as ct on st.contact_id = ct.id
group by ct.name
order by SUM(st.price * st.qty - st.discount) desc;
-- 각 상품별로 판매 총 금액을 내림차순으로 출력하세요.
select st.product, (st.price * st.qty - st.discount) as final_price
from saled_tbl as st
order by (st.price * st.qty - st.discount) desc;

-- 지금까지 배웠던 INNER JOIN을 활용하고 그외 JOIN도 실습해보세요