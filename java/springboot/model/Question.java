package springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="question_tbl")
public class Question {	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="question_id")
	private Integer questionId;
	
	@Column(name="question_name")
	private String questionName;
	
	@Column(name="option1")
	private String option1;
	
	@Column(name="option2")
	private String option2;
	
	@Column(name="option3")
	private String option3;
	
	@Column(name="option4")
	private String option4;
	
	@ManyToOne
	@JoinColumn(name="topic_id")
	@JsonBackReference	
	private Topic topic;
	
	@Column(name="question_difficulty_level")
	private float questionDifficultyLevel;
	
	@Column(name="question_type")
	private String questionType;	
	

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public float getQuestionDifficultyLevel() {
		return questionDifficultyLevel;
	}

	public void setQuestionDifficultyLevel(float questionDifficultyLevel) {
		this.questionDifficultyLevel = questionDifficultyLevel;
	}

	
}
