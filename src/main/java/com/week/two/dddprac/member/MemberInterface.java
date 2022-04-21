package com.week.two.dddprac.member;

import java.util.HashMap;

public interface MemberInterface {
    public HashMap join(HashMap map); //계정 생성(개인/강사)
    public HashMap login(HashMap map); //로그인 기능
}
