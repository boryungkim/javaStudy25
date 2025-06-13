--한 줄씩 블럭설정 후 alt + c 실행
create user boardtest identified by boardtest
grant resource, connect to boardtest
alter user boardtest default tablespace users
alter user boardtest temporary tablepace temp

drop table board; --기존에 board 테이블 삭제
drop sequence board_seq; -- 자동번호 생성 제거

create table board(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
)