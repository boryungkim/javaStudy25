--�� �پ� ������ �� alt + c ����
create user boardtest identified by boardtest
grant resource, connect to boardtest
alter user boardtest default tablespace users
alter user boardtest temporary tablepace temp

drop table board; --������ board ���̺� ����
drop sequence board_seq; -- �ڵ���ȣ ���� ����

create table board(
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
)