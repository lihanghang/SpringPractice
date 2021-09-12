create table annual_chairman_info
(
    ID                tinytext      null,
    uuid              tinytext      null,
    category          tinytext      null,
    stockabbr         tinytext      null,
    stockcode         tinytext      null,
    reportduedate     date          null,
    annualchairman    tinytext      null,
    officename        varchar(1024) null,
    officestartdate   varchar(1024) null,
    officeenddate     varchar(1024) null,
    ifshareholder     int           null,
    officeposition    varchar(2048) null,
    ifreward          int           null,
    validatedflag     int           null,
    errCode           varchar(1024) null,
    verifiedpersonnel tinytext      null,
    validatedcount    int           null,
    createtime        timestamp     null,
    updatetime        timestamp     null
);

create table election_info
(
    ID                   tinytext      null,
    uuid                 tinytext      null,
    category             tinytext      null,
    publishdate          date          null,
    stockabbr            tinytext      null,
    stockcode            tinytext      null,
    announcementtitle    varchar(1024) null,
    relateconferencename varchar(1024) null,
    relateconferencedate varchar(1024) null,
    voteename            tinytext      null,
    voteeposition        varchar(1024) null,
    validatedflag        int           null,
    validatedcount       int           null,
    verifiedpersonnel    tinytext      null,
    errCode              varchar(1024) null,
    createtime           timestamp     null,
    updatetime           timestamp     null
);

