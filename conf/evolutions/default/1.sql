# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table rate (
  currency                  varchar(255) not null,
  rate                      float,
  constraint pk_rate primary key (currency))
;

create sequence rate_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists rate;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists rate_seq;

