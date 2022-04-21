package com.week.two.dddprac.lecture;

import java.util.HashMap;

public interface LectureInterface {
    public HashMap makeClass(HashMap param); //강의 개설
    public HashMap matchTeacher(HashMap param); //강사 매칭
    public HashMap uploadContents(HashMap param); //강의 당 컨텐츠 업로드
    public HashMap classShow(Integer classId, boolean status); //강의 노출 여부
    public HashMap takeLecture(HashMap param); //강의 수강
    public HashMap giveStar(HashMap param); //강의 별점부여
    public HashMap seeStars(HashMap param); //강의 별점 조회
    public HashMap getTook(Integer memberId); //수강했던 강의 조회
    public HashMap getUploaded(Integer memberId); //업로드한 강의 조회
    public HashMap makeTest(HashMap param); //강의 당 시험 추가
    public HashMap putScore(HashMap param); //수강자 성적 추가


}
