package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class ReplyVO {

	private int rno;
	private int bno;
	
	private String reply;
	private String replyId;
	private String replyPw;
	private LocalDateTime replyDate;
	private LocalDateTime updateDate;
	
}
