package springboot.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="topic_tbl")
public class Topic{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="topic_id")
	private Integer id;
	
	@Column(name="topic_name")
	private String topicName;
	
	@Column(name="topic_description")
	private String topicDescription;
	
	@JsonBackReference
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany
	@JoinColumn(name="topic_id")
	private List<Question> questionlist;
	
	@Column(name="topic_type")
	private String topicType;
	
	@Column(name="topic_difficulty_level")
	private float topicDifficultyLevel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
	public List<Question> getQuestionlist() {
		return questionlist;
	}

	public void setQuestionlist(List<Question> questionlist) {
		this.questionlist = questionlist;
	}

	public String getTopicType() {
		return topicType;
	}

	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}

	public float getTopicDifficultyLevel() {
		return topicDifficultyLevel;
	}

	public void setTopicDifficultyLevel(float topicDifficultyLevel) {
		this.topicDifficultyLevel = topicDifficultyLevel;
	}

	@Override
	public String toString() {
		return "Topic [id=" + id + ", topicName=" + topicName + ", topicDescription=" + topicDescription
				+ ", questionlist=" + questionlist + ", topicType=" + topicType + ", topicDifficultyLevel="
				+ topicDifficultyLevel + "]";
	}
}
