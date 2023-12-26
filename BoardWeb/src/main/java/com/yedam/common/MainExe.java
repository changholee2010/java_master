package com.yedam.common;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.board.mapper.BoardMapper;
import com.yedam.board.vo.BoardVO;

public class MainExe {
	public static void main(String[] args) {

		SqlSessionFactory factory = DataSource.getInstance();
		SqlSession session = factory.openSession(true);

		BoardMapper mapper = session.getMapper(BoardMapper.class);
		BoardVO vo = new BoardVO();
		vo.setTitle("tttttt");
		vo.setContent("cdcdcdcdcdcd");
		vo.setWriter("wwwww");
		vo.setBoardNo(4);

		if (mapper.updateCnt(2) == 1) {
			System.out.println("조회수 증가 성공.");
		} else {
			System.out.println("조회수 증가 성공X.");
		}

	}
}
