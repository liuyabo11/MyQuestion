package cn.pb.dao;

import cn.pb.pojo.Answer;

public interface AnswerMapper {
	/**
	 * 给question新增answer
	 * 
	 * @param answer
	 * @return
	 */
	int add(Answer answer);
}
