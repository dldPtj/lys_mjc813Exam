-- 여행이름, 기차이름, 좌석 수
select twt.name, tt.name, tt.qty, tt.seat_count
from train_way_tbl as twt
join train_tbl as tt on tt.id = twt.train_id
;

select twt.name as '여행제목'
	, tt.name as '기차명'
	, tt.qty as '차량개수'
	, tt.seat_count '좌석 수'
	, sta.name as '출발역'
	, sta.lat as '출발역 위도'
	, sta.lng as '출발역 경도'
	, stb.name as '도착역 이름'
	, stb.lat as '도착역 위도'
	, stb.lng as '도착역 경도'
from train_way_tbl as twt
inner join train_tbl as tt on tt.id = twt.train_id
inner join station_tbl sta on sta.id = twt.start_station_id
inner join station_tbl stb on stb.id = twt.end_station_id
;
-- 여행이름, 기차이름, 출발역, 도착역
select twt.id, twt.name, tt.name, (st.name) as start_station, (st1.name) as end_station 
from train_way_tbl twt 
join train_tbl tt on tt.id = twt.train_id 
join station_tbl st on st.id = twt.start_station_id
join station_tbl st1 on st1.id = twt.end_station_id
;

-- select * from 원하는 문장이 나오게 하고 싶은 테이블(보통 값이 id로 입력이 많이 되어있는 테이블을 적음)
-- join 마스터테이블 as 별명 on 마스터테이블.id = 외래테이블.id;

-- inner join은 교집합
-- left join와 right join은 값이 다 있는 값들만 출력하는게 아니라 null을 가지고 있는 행도 나옴
-- right join을 마지막에 사용하면 그 전에 사용했던 join들은 다 묻히고 right join에서 오른쪽에 해당하는 행만 출력됨
-- join 뒤에 where절 작성