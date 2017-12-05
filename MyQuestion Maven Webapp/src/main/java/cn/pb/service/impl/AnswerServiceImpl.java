package cn.pb.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import cn.pb.dao.AnswerMapper;
import cn.pb.dao.QuestionMapper;
import cn.pb.pojo.Answer;
import cn.pb.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {
	@Resource
	private AnswerMapper answerMapper;
	@Resource
	private QuestionMapper questionMapper;

	Logger logger = Logger.getLogger(AnswerServiceImpl.class);

	/**
	 * 给question新增answer
	 */
	public boolean add(Answer answer) {
		logger.debug("要新增的answer：" + answer);
		// 新增answer
		int i = answerMapper.add(answer);
		// 修改question

		if (i > 0) {
			return true;
		}
		return false;
	}
}
