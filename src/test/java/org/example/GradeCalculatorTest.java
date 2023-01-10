package org.example;

import org.example.GradeCalculator.Course;
import org.example.GradeCalculator.GradeCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
 * MVC패턴(Model-View-Controller) 기반으로 구현한다.
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    // 학점계산기 도메인: 이수한 과목, 학점 계산기 -> 생각나는 대로 적기
    // 객체지향프로그래밍, 자료구조, 중국어 회화 --> 과목(코스) 클래스로 표현 가능(동적인 객체를 -> 정적인 클래스로 추상화)

    /**
     * 핵심 포인트
     */
    // 이수한 과목을 전달하여 평균학점 계산 요청 ----> 학점계산기 ---> (학점수x교과목 평점)의 합계 ---> 과목(코스)에게 요청
    //                                                   ----> 수강신청 총학점 수        ---> 과목(코스)


    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
