package com.test;

import org.junit.Test;

/**
 * Created by soniiatm on 5/18/2017.
 */
public class TestInnerClass {

    @Test
    public void testLocalInnerClass(){
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();
    }

    @Test
    public void testAnnoumousClass(){
        TestAnonymousClass testAnonymousClass = new TestAnonymousClass();
        testAnonymousClass.anonymousMethod();
    }

    @Test
    public void testMemberInnerClass(){
        TeamMemberOuter1 teamMemberOuter1 = new TeamMemberOuter1();
        TeamMemberOuter1.InnerClass1 innerClass1 = teamMemberOuter1.new InnerClass1();
        innerClass1.msg();
    }

    @Test
    public void testStaticInnerClass(){
        StaticInnerClasss.InnerClass1 innerClass1 = new StaticInnerClasss.InnerClass1();
        innerClass1.msg();
    }
}
