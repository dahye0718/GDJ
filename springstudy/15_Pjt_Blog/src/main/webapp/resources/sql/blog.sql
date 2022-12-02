DROP TABLE COMMENTS;
DROP TABLE BLOG;

-- 블로그
CREATE TABLE BLOG
(
    BLOG_NO NUMBER NOT NULL,
    TITLE VARCHAR2(500 BYTE) NOT NULL,
    CONTENT CLOB,
    HIT NUMBER NOT NULL,
    IP VARCHAR2(32 BYTE) NOT NULL,
    CREATE_DATE DATE NOT NULL,
    MODIFY_DATE DATE NOT NULL
);

-- 댓글(1단 계층형)
CREATE TABLE COMMENTS
(
    COMMENT_NO NUMBER NOT NULL,
    BLOG_NO NUMBER,				-- 외래키 (ON DELETE SET NULL을 위해 NOT NULL 처리하면 안 됨)
    CONTENT VARCHAR2(4000 BYTE) NOT NULL,
    STATE NUMBER NOT NULL,      -- 정상 1, 삭제 -1
    DEPTH NUMBER NOT NULL,      -- 게시글 0, 댓글의 답글 1
    GROUP_NO NUMBER NOT NULL,   -- 댓글과 해당 게시글에 달린 댓글은 같은 그룹(GROUP_NO은 current.val(번호표 새로 뽑는거 아님)사용
    CREATE_DATE DATE NOT NULL
);

-- 블로그 기본키
ALTER TABLE BLOG
    ADD CONSTRAINT PK_BLOG
        PRIMARY KEY(BLOG_NO);

-- 댓글 기본키
ALTER TABLE COMMENTS
    ADD CONSTRAINT PK_COMMENTS
        PRIMARY KEY(COMMENT_NO);

-- 댓글 외래키 : 댓글이 존재하는 블로그를 삭제하면 댓글의 BLOG_NO가 NULL 처리된다.
ALTER TABLE COMMENTS
    ADD CONSTRAINT FK_COMMENTS_BLOG
        FOREIGN KEY(BLOG_NO) REFERENCES BLOG(BLOG_NO)
            ON DELETE SET NULL;

-- 시퀀스
DROP SEQUENCE BLOG_SEQ;
DROP SEQUENCE COMMENTS_SEQ;
CREATE SEQUENCE BLOG_SEQ NOCACHE;
CREATE SEQUENCE COMMENTS_SEQ NOCACHE;
