package com.week.two.dddprac.board;

import java.util.HashMap;

public interface BoardInterface {
    public HashMap getBoardList(HashMap param); //리스트 조회
    public HashMap getArticle(Integer articleId); //글보기(개당)
    public boolean writeArticle(HashMap param); // 글 쓰기
    public boolean writeReply(HashMap param); // 댓글 쓰기
    public boolean articleOnoff(Integer articleId); // 글 숨기기
    public boolean replyOnoff(Integer replyId); // 게시글 숨기기
}
