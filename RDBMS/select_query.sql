-- 판매정보 개별데이터 조회
SELECT
	st.id
	, st.product
	, st.price
	, st.qty
	, st.discount
	, st.price * st.qty - st.discount AS amount
	, ct.name
	, IFNULL(lt.location, '') loca
FROM saled_tbl st
INNER JOIN contact_tbl AS ct
	ON st.contact_id = ct.id
LEFT JOIN location_tbl AS lt
	ON st.location_id = lt.id
WHERE 1=1
-- AND IFNULL(lt.location, '') LIKE '%강%'
;

-- 수강정보 개별데이터 조회
SELECT
	ct.name
	, ct.email
	, lt.score
--	, lt.id
	, lt2.subject 
	, lt2.teacher
	, lt2.room_num 
	, lt2.start_dt
	, lt2.end_dt
FROM learn_tbl lt
INNER JOIN lecture_tbl lt2 
	ON lt.lecture_id = lt2.id
INNER JOIN contact_tbl ct 
	ON ct.id = lt.contact_id
WHERE start_dt <= '2025-08-30'
ORDER BY start_dt
;
