package cn.pb.pojo;

/**
 * 问题实体类
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question {
	private Integer id;// 问题编号 主键
	private String title;// 问题名
	private String detailDesc;// 问题描述
	private Integer answerCount;// 回答次数
	private Date lastModified;// 修改时间
	// 问题的回答
	private List<Answer> answers = new ArrayList<Answer>();

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(Integer id, String title, String detailDesc,
			Integer answerCount, Date lastModified, List<Answer> answers) {
		super();
		this.id = id;
		this.title = title;
		this.detailDesc = detailDesc;
		this.answerCount = answerCount;
		this.lastModified = lastModified;
		this.answers = answers;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetailDesc() {
		return detailDesc;
	}

	public void setDetailDesc(String detailDesc) {
		this.detailDesc = detailDesc;
	}

	public Integer getAnswerCount() {
		return answerCount;
	}

	public void setAnswerCount(Integer answerCount) {
		this.answerCount = answerCount;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", detailDesc="
				+ detailDesc + ", answerCount=" + answerCount
				+ ", lastModified=" + lastModified + ", answers=" + answers
				+ "]";
	}

}
