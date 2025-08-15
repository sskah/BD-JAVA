-- dropar tabela
drop table java_despesa;
drop table java_categoria;

create table java_categoria (
    id_categoria number, 
    categoria varchar2(50),
    primary key (id_categoria)
);

select * from java_categoria;

insert into java_categoria values (2, 'transporte');