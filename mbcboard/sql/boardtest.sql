drop table board; --������ board ���̺� ����
drop sequence board_seq; -- �ڵ���ȣ ���� ����

create table board(  --���̺� �����
bno number(5) primary key,
btitle nvarchar2(30) not null,
bcontent nvarchar2(1000) not null,
bwriter nvarchar2(10) not null,
bdate date not null
)

create sequence board_seq increment by 1 start with 1 nocycle nocache --������ �����

insert into BOARD (bno, btitle, bcontent, bwriter, bdate) --���� ������ �Է�
values (board_seq.nextval, '������~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'kkw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�ȳ��ϼ���~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'kbr', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����մϴ�~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'ksb', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�����ϼ˳���~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'bhm', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, 'ȭ�����ϼ���~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'lhn', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�氩���ϴ�~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'jhj', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�氩���ϴ�~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'kjw', sysdate)
insert into BOARD (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '�氩���ϴ�~', '����� ��Ͻô���� ����ϼ̽��ϴ�', 'jmk', sysdate)

select * from board
-----------------------------------------------------------------------------------------------------------------------
--���� : 2�� ���̺��� �����Ͽ� ���� �����´�

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id='kkw';


-----------------------------------------��member ���̺� �θ�� �����ϱ�------------------------------------------------------------
create table member(
mno number(5) not null,
bwriter nvarchar2 (10) not null, 
id nvarchar2(10) primary key, --board ���̺��� bwriter�� fk�� ���輳�� �Ϸ��� �� (Ÿ����ġ)
pw nvarchar2 (10) not null,
regidate date default sysdate not null --�����
)

create sequence board_seq increment by 1 start with 1 nocycle nocache

alter table board add constraint board_member_fk foreign key (bwriter) references member(id)
--board ���̺��� member�� �ڽ� ���̺�� member�� id�� board�� bwriter�� ���� ����(�ܷ�Ű) -> ���� Ÿ���� �¾ƾ� ��
--ORA-02267: column type incompatible with referenced column type -> pk�� fk�� �ٿ��� ��
-- pk�� fk�� Ȯ���ϰ� ���� -> �ڽ����̺� ���̵����͸� �����ϰ� �����غ���
--�ڽ� ���̺� ���̵����͸� �����ϰ� ���� �غ���

--board�� ���̵����͸� �־��
--ORA-02291: integrity constraint (BOARDTEST.BOARD_MEMBER_FK) violated - parent key not found
--�θ� ���̺� �����̶�� ���� ����

delete from board -- ���Ǿ��� delete�� �����ϸ� ��� �����Ͱ� ���� �� -> �ܷ�Ű�� �ٽ� �����غ���


--------------������ ��ü�� �̹� 1���� ������ board_seq�� ���� ����ϰڴ�

insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '����', 'kkw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '�躸��', 'kbr', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '�����', 'ksb', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '������', 'bhm', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '���ϴ�', 'lhn', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '������', 'jhj', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '������', 'kjw', '1234')
insert into member (mno, bwriter, id, pw)
values (board_seq.nextval, '���α�', 'jmk', '1234')


select * from member

drop table member -- member ���̺� ������

------------------------------------------member�� �ڽ� board �ܷ�Ű ���� �ʼ�------------------------------------------------------


