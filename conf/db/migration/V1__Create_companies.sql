create table company (
  id bigserial not null primary key,
  name varchar(64) not null,
  url varchar(128),
  created_at timestamp not null,
  updated_at timestamp,
  deleted_at timestamp
);