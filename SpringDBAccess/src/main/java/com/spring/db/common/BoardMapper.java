package com.spring.db.common;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.db.model.BoardVO;

public class BoardMapper implements RowMapper<BoardVO>{

	@Override
	public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("mapRow 메서드 호출");
		System.out.println("rowNum: " + rowNum);
		
		BoardVO vo = new BoardVO(
					rs.getInt("board_no"),
					rs.getString("writer"),
					rs.getString("title"),
					rs.getString("content"),
					(rs.getTimestamp("reg_date")).toLocalDateTime()
				);
		
		return vo;
	}

}
