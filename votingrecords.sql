create database if not exists votingrecords;
use votingrecords;
create table if not exists votes (
votername varchar(50),
pollid int,
voterid int,
candidate varchar(50),
primary key (voterid)
);


