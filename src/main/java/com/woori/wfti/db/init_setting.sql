# show databases;

# create schema test_db default character set utf8;
# create user test_user@localhost identified by 'admin';
# grant all privileges on test_db.* to test_user@localhost;

-- user_tb
create table if not exists test_db.user_tb
(

    USER_SRNO   INT NOT NULL AUTO_INCREMENT,
    USER_EMP_NO VARCHAR(200),
    USER_NM     VARCHAR(200),
    USER_PW     VARCHAR(200),
    LST_SGIN_DH DATETIME,
    LGIN_YN     BOOL,
    RGS_DH       DATETIME,
    CHG_DH      DATETIME,
    PRIMARY KEY (USER_SRNO)

);

-- club_tb
create table if not exists test_db.club_tb
(

    CLUB_SRNO      BIGINT NOT NULL AUTO_INCREMENT,
    RGS_USER_SRNO    BIGINT NOT NULL,
    CHG_USER_SRNO    BIGINT NOT NULL,
    CLUB_NM        VARCHAR(200),
    CLUB_DESC_TXT     VARCHAR(200),
    RGS_DH          DATETIME,
    CHG_DH         DATETIME,
    PRIMARY KEY (CLUB_SRNO)

);

-- club_user_th
create table if not exists test_db.club_user_th
(
    CLUB_USER_ID    BIGINT NOT NULL AUTO_INCREMENT,
    CLUB_SRNO       BIGINT NOT NULL,
    USER_SRNO       BIGINT NOT NULL,
    USER_ROLE      VARCHAR(20),
    USER_STS_CD      VARCHAR(2),
    RGS_DH          DATETIME,
    QUIT_DH         DATETIME,
    PRIMARY KEY (CLUB_USER_ID)

);

create table if not exists test_db.calendar_th
(

    CAL_SRNO        BIGINT NOT NULL AUTO_INCREMENT,
    CLUB_SRNO       BIGINT NOT NULL,
    ST_DH           DATETIME,
    ED_DH           DATETIME,
    CLUB_PLC      VARCHAR(200),
    CLUB_CST       INT,
    CAL_DESC_TXT   VARCHAR(200),
    PUB_YN         BOOLEAN,
    RGS_DH          DATETIME,
    CHG_DH         DATETIME,
    PRIMARY KEY (CAL_SRNO)

);

-- calendar_user_th
create table if not exists test_db.calendar_user_th
(
    CAL_USER_ID    BIGINT NOT NULL AUTO_INCREMENT,
    CAL_SRNO       BIGINT NOT NULL,
    USER_SRNO        BIGINT NOT NULL,
    RGS_DH          DATETIME,
    QUIT_DH         DATETIME,
    USR_STS_CD      VARCHAR(2),
    PRIMARY KEY (CAL_USER_ID)

);


-- chat_tb
create table if not exists test_db.chat_tb
(

    CHAT_SRNO       BIGINT NOT NULL AUTO_INCREMENT,
    CLUB_SRNO       BIGINT NOT NULL,
    CAL_SRNO        BIGINT NOT NULL,
    RGS_USER_SRNO     BIGINT NOT NULL,
    CHAT_URL      VARCHAR(200),
    USE_YN         BOOLEAN,
    RGS_DH          DATETIME,
    PRIMARY KEY (CHAT_SRNO)

);

-- chat_user_th
create table if not exists test_db.chat_user_th
(
    CHAT_USER_ID    BIGINT NOT NULL AUTO_INCREMENT,
    CHAT_SRNO       BIGINT NOT NULL,
    CLUB_SRNO       BIGINT NOT NULL,
    USE_YN         BOOLEAN,
    RGS_DH          DATETIME,
    PRIMARY KEY (CHAT_USER_ID)

);

-- search_th
create table if not exists test_db.search_th
(

    SRCH_SRNO        BIGINT NOT NULL AUTO_INCREMENT,
    USER_SRNO       BIGINT NOT NULL,
    SRCH_DH         DATETIME,
    SRCH_WRD      VARCHAR(200),
    PRIMARY KEY (SRCH_SRNO)

);

-- survey_subject_th
create table if not exists test_db.survey_subject_th
(

    SUBJ_SRNO        BIGINT NOT NULL AUTO_INCREMENT,
    SUB_NM          VARCHAR(200) NOT NULL,
    PRIMARY KEY (SUBJ_SRNO)

);

-- user_survey_th
create table if not exists test_db.user_survey_th
(
    USER_SURV_ID      BIGINT NOT NULL AUTO_INCREMENT,
    USER_SRNO        BIGINT NOT NULL,
    SUBJ_SRNO        BIGINT NOT NULL,
    LIKE_SCR        BOOLEAN,
    SURV_DH         DATETIME,
    PRIMARY KEY (USER_SURV_ID)

);

-- test insert문
insert into test_db.user_tb(USER_EMP_NO, USER_NM, USER_PW, LST_SGIN_DH, LGIN_YN, RGS_DH, CHG_DH)
values ("20201467", "정투딘", "glcmwldiWkd1!", now(), true, now(), now());
insert into test_db.club_tb(RGS_USER_SRNO, CHG_USER_SRNO, CLUB_NM, CLUB_DESC_TXT, RGS_DH, CHG_DH)
values(1, 2, "히츠지야", "양고기 먹어어", now(), now());
insert into test_db.club_user_th(CLUB_SRNO, USER_SRNO, USER_ROLE, USER_STS_CD, RGS_DH, QUIT_DH)
values(1, 1, "ADMIN", "00", now(), now());
insert into test_db.calendar_th(CLUB_SRNO, ST_DH, ED_DH, CLUB_PLC, CLUB_CST, CAL_DESC_TXT, PUB_YN, RGS_DH, CHG_DH)
values(1, now(), now(), "히츠지야 연남", 37999, "히츠지야에서 죽는 날", true, now(), now());
insert into test_db.calendar_user_th(CAL_SRNO, USER_SRNO, RGS_DH, QUIT_DH, USR_STS_CD) values(1, 1, now(), now(), "00");
insert into test_db.chat_tb(CLUB_SRNO, CAL_SRNO, RGS_USER_SRNO, CHAT_URL, USE_YN, RGS_DH)
values(1, 1, 1, "10.10.10.10", true, now());
insert into test_db.chat_user_th(CHAT_SRNO, CLUB_SRNO, USE_YN, RGS_DH) values(1, 1, true, now());
insert into test_db.search_th(USER_SRNO, SRCH_DH, SRCH_WRD)
values(1, now(), "히츠지야는 언제 먹을 수 있는건가요");
insert into test_db.survey_subject_th(SUB_NM) values ("드라이브");
insert into test_db.user_survey_th(USER_SRNO, SUBJ_SRNO, LIKE_SCR, SURV_DH) values(1, 1, true, now());
