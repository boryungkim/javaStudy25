create user boardtest identified by boardtest
grant resource, connect to boardtest
grant dba, connect to boardtest
alter user boardtest default tablespace users
alter user boardtest temporary tablespace temp

