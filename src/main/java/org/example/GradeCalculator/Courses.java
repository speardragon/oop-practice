package org.example.GradeCalculator;

import java.util.List;

public class Courses {
    // Course를 여러개 가진 리스트 형태로 된 정보만을 인스턴스 변수로 가지는 클래스(즉, 변수가 하나 더 있으면 안 됨)
    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
//        double multipliedCreditAndCourseGrade = 0;
//        for (Course course : courses) {
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCourseGrade;

        // 리팩토링 후 코드
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
        return totalCompletedCredit;
    }
}
