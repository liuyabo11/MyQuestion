package cn.pb.pojo;

/**
 * answer答案实体类
 */
import java.util.Date;

public class Answer {
	/**
	  还不错！
	  小样！
	  嘻嘻
	 哈哈
	*/
	private Integer id;// 答案编号 主键
	private String ansContent;// 答案内容
	private Date ansDate;// 回答时间
	private Integer qid;// 问题编号

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(Integer id, String ansContent, Date ansDate, Integer qid) {
		super();
		this.id = id;
		this.ansContent = ansContent;
		this.ansDate = ansDate;
		this.qid = qid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAnsContent() {
		return ansContent;
	}

	public void setAnsContent(String ansContent) {
		this.ansContent = ansContent;
	}

	public Date getAnsDate() {
		return ansDate;
	}

	public void setAnsDate(Date ansDate) {
		this.ansDate = ansDate;
	}

	public Integer getQid() {
		return qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", ansContent=" + ansContent + ", ansDate="
				+ ansDate + ", qid=" + qid + "]";
	}

}
