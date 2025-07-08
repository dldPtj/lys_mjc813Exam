
CREATE TABLE contact_tb1 (
	id INT UNSIGNED auto_increment NOT NULL
	, name varchar(20) NOT NULL
	, phoneNumber varchar(20) NOT NULL
	, zipNumber varchar(5) NOT NULL
	, email varchar(100) NOT NULL
	, addr varchar(500) not null
);

CREATE TABLE saled_tb1 (
	id INT UNSIGNED auto_increment NOT NULL
	, sale_dt DATE 
	, price INT UNSIGNED
	, qty INT UNSIGNED
	, product VARCHAR(100)
	, location VARCHAR(100)
	, discount INT UNSIGNED
	, sale_user VARCHAR(10) 
	, sellerAddress VARCHAR(100) 
	, CONSTRAINT sale_tb_pk PRIMARY KEY (id)
	, CONSTRAINT sale_tb_fk FOREIGN KEY (id) REFERENCES contact_tb2 (id)
);

INSERT INTO sale_tb (
	date
	, salePrice
	, count
	, goods
	, deliveryLocation
	, discountPrice
	, sellerName
	, sellerAddress
	)
	VALUES (
	'2025-06-30'
	, 50000
	, 2
	, '블루투스 스피커'
 	, '서울 강남구'
 	, 5000
 	, '홍길동'
 	, '서울 마포구'),
	('2025-06-25'
	, 120000
	, 1
	, '무선 헤드폰'
 	, '부산 해운대구'
 	, 10000
 	, '김철수'
 	, '부산 수영구'),
 	('2025-07-02'
	, 30000
	, 3
	, '폰케이스'
 	, '인천 남동구'
 	, 3000
 	, '김영희'
 	, '인천 부평구');

SELECT * FROM sale_tb;

CREATE TABLE course_tb (
	id INT UNSIGNED auto_increment NOT NULL
	, courseName VARCHAR(20) NOT NULL
	, studentName VARCHAR(20) NOT NULL
	, professorName VARCHAR(20) NOT NULL
	, classroomNumber INT NOT NULL
	, courseStartDate DATE NOT NULL
	, courseEndDate DATE NOT NULL
	, score INT CHECK (score > 0 AND score < 100) NOT NULL
	, CONSTRAINT course_tb_pk PRIMARY KEY (id)
	, CONSTRAINT course_tb_fk FOREIGN KEY (id) REFERENCES contact_tb2 (id)
);

INSERT INTO course_tb (
	courseName
	, professorName
	, classroomNumber
	, courseStartDate
	, courseEndDate
	, score
	)
	VALUES (
	'Java 기초'
	, '김철수'
	, 101
	, '2025-06-01'
	, '2025-07-15'
	, 85),
	('UI/UX 디자인'
	, '박지연'
	, 202
	, '2025-05-20'
	, '2025-07-10'
	, 92),
	('데이터 분석'
	, '이민호'
	, 303
	, '2025-06-10'
	, '2025-08-01'
	, 78);

SELECT * FROM course_tb;