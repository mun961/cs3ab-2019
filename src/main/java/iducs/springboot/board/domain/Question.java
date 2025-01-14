package iducs.springboot.board.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Question {
	private long id; // primary key
	private String title; 
	private User writer;
	private List<Answer> answers;
	private String contents;
	private LocalDateTime createTime;	
	
	public Question() {}
	public Question(String title, User writer, String contents) {
		super();
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.createTime = LocalDateTime.now();
	}

	public List<Answer> getAnswer() {
		return answers;
	}
	public void setAnswer(List<Answer> answer) {
		this.answers = answer;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public User getWriter() {
		return writer;
	}

	public void setWriter(User writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
	public void setAnswers(List<Answer> answerList) {
		// TODO Auto-generated method stub
		
	}
	
}
