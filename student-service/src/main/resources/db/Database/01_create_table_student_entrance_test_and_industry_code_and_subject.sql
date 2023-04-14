create table student_entrance_test
(
    id                SERIAL  not null,
    check_total_score bigint,
    school_year       bigint,
    create_at_time    date   not null,
    update_at_time    date   not null,
    primary key (id)
);

create table industry_code
(
    id                       SERIAL  not null,
    name_industry            varchar(255),
    total_industry_code_score bigint,
    create_at_time           date   not null,
    update_at_time           date   not null,

    primary key (id)

);

create table subject
(
    id               SERIAL not null,
    code_subject     bigint  ,

    create_at_time   date   not null,
    update_at_time   date   not null,

    id_industry_code SERIAL not null,
    primary key (id),

    CONSTRAINT subject_fk_industry_code
        FOREIGN KEY (id_industry_code)
            REFERENCES industry_code (id)
);