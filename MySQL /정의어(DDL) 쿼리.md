# `정의어(DDL) 쿼리`

## `CREATE - 테이블 또는 데이터베이스를 생성`
문법
```
CREATE DATABASE 데이터베이스이름;
CREATE TABLE 테이블이름 (
        필드명1 필드타입1 (제약조건),
        필드명2 필드타입2 (제약조건),
        ...); 
```
예시
```
CREATE TABLE test(
id INT AUTO_INCREMENT, 
name VARCHAR(10) NOT NULL,
age INT DEFAULT 20,
address VARCHAR(20),
PRIMARY KEY(id));
```
- 기본키가 되면 자동 not null
- 계산해야 하는 것이 아니면 int 안 줌
<br>

테이블 복사 문법
```
CREATE TABLE (if not exists) 새테이블명 LIKE 복사할 테이블명;
```
예시
```
CREATE TABLE if not exists student2 LIKE student;
```
- 원본 테이블의 구조를 복사하여 새 테이블을 생성
- if not exists : 테이블이 없다면 생성, 있는지 없는지 확인, 테이블명 중복 안되도록
<br>

## `ALTER - 테이블의 내용을 수정`
ADD(추가), MODIFY(속성수정), CHANGE(수정-이름도 수정), DROP(삭제) <br> <br>
문법
```
ALTER TABLE 테이블명 ADD 필드명 필드타입;
ALTER TABLE 테이블명 DROP 필드명;
ALTER TABLE 테이블명 MODIFY 필드명 필드타입;
ALTER TABLE 테이블명 CHANGE 기존필드명 변경필드명 필드타입;
```
예시
```
컬럼 추가
ALTER TABLE test ADD phone VARCHAR(10);

기본키 추가
ALTER TABLE student ADD PRIMARY KEY(num);

컬럼 수정
ALTER TABLE table_name MODIFY ex_column varchar(16) NULL;

위치 수정
ALTER TABLE test MODIFY age INT DEFAULT 20 AFTER address;

컬럼 이름까지 수정
ALTER TABLE table_name CHANGE ex_column ex_column2 varchar(16) NULL;

컬럼 삭제 
ALTER TABLE table_name DROP ex_column;
```
<br>

## `DROP - 테이블 또는 데이터베이스를 삭제`
문법
```
DROP DATABASE 데이터베이스이름;
DROP TABLE 테이블이름 [CASCADE|RESTRICT];
```
- CASCADE: 참조하는 테이블도 모두 제거
- RESTRICT: 참조하는 테이블이 있을 경우 제거하지 않음
<br>

## `RENAME - 테이블의 이름을 변경`
문법
```
RENAME TABLE 테이블명(전) TO 테이블명(후)
```
