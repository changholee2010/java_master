package com.yedam.common;

import com.yedam.student.service.StudentService;
import com.yedam.student.serviceImpl.StudentServiceMybatis;

public class MainExe {
	public static void main(String[] args) {
		StudentService svc = new StudentServiceMybatis();
		String sno = "23-001";
		// SM.xml => 추가.
		if (svc.remStudent(sno)) {
			System.out.println("삭제됨.");
		} else {
			System.out.println("삭제실패.");
		}
	}
}
