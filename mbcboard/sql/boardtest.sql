drop table board; --기존에 board 테이블 삭제
drop sequence board_seq; -- 자동번호 생성 제거

create table board(  --테이블 만들기
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache --시퀀스 만들기

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

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id='kkw';


-----------------------------------------ㅡmember 테이블 부모로 생성하기------------------------------------------------------------
create table member(
mno number(5) not null,
bwriter nvarchar2 (10) not null, 
id nvarchar2(10) primary key, --board 테이블의 bwriter와 fk로 관계설정 하려고 함 (타입일치)
pw nvarchar2 (10) not null,
regidate date default sysdate not null --등록일
)

create sequence board_seq increment by 1 start with 1 nocycle nocache

alter table board add constraint board_member_fk foreign key (bwriter) references member(id)
--board 테이블은 member의 자식 테이블로 member에 id와 board에 bwriter를 관계 설정(외래키) -> 서로 타입이 맞아야 함
--ORA-02267: column type incompatible with referenced column type -> pk와 fk를 붙여야 함
-- pk와 fk를 확인하고 연결 -> 자식테이블에 더미데이터를 삭제하고 실행해보자
--자식 테이블에 더미데이터를 삭제하고 실행 해보자

--board에 더미데이터를 넣어보면
--ORA-02291: integrity constraint (BOARDTEST.BOARD_MEMBER_FK) violated - parent key not found
--부모 테이블에 김기원이라는 값이 없다

delete from board -- 조건없이 delete를 실행하면 모든 데이터가 삭제 됨 -> 외래키를 다시 지정해보자


--------------시퀀스 객체는 이미 1개가 있으니 board_seq를 같이 사용하겠다

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


select * from member

drop table member -- member 테이블 삭제용

------------------------------------------member의 자식 board 외래키 생성 필수------------------------------------------------------


