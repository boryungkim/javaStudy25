drop table board CASCADE CONSTRAINTS;--기존에 board 테이블 삭제
drop table member cascade constraints;
drop sequence board_seq; -- 자동번호 생성 제거 
--테이블 드랍해도 시퀀스 따로 드랍해줘야 함

create table board(  --테이블 만들기
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache

insert into BOARD (bno, btitle, bcontent, bwriter, bdate) --더미 데이터 입력
values (board_seq.nextval, '덥내용~', '무더운데 등교하시느라고 고생하셨습니다', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세용~', '무더운데 등교하시느라고 고생하셨습니다', 'kbr', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '감사합니다~', '무더운데 등교하시느라고 고생하셨습니다', 'ksb', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '수고하셧내용~', '무더운데 등교하시느라고 고생하셨습니다', 'bhm', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '화이팅하세요~', '무더운데 등교하시느라고 고생하셨습니다', 'lhn', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다~', '무더운데 등교하시느라고 고생하셨습니다', 'jhj', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다~', '무더운데 등교하시느라고 고생하셨습니다', 'kjw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방갑습니다~', '무더운데 등교하시느라고 고생하셨습니다', 'jmk', sysdate)

select * from board
-----------------------------------------------------------------------------------------------------------------------
--조인 : 2개 테이블을 연결하여 값을 가져온다

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id = 'kkw';

--------------------------member 테이블 부모로 생성하기--------------------------------

DROP TABLE member
create table member(
mno number(5) not null,
bwriter nvarchar2 (10) not null,
id nvarchar2(10) primary key,
pw nvarchar2(10) not null,S
regidate date default sysdate not null
)

create sequence member_seq increment by 1 start with 1 nocycle nocache

alter table board add constraint board_member_fk foreign key (bwriter) references member(id)

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김기원', 'kkw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김보령', 'kbr', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김샛별', 'ksb', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '배혜민', 'bhm', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '이하늘', 'lhn', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '전혜진', 'jhj', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '김진우', 'kjw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '전민기', 'jmk', '1234')

rename member to memberDTO

select * from memberDTO

