package cn.pb.service.impl;

/**
 * service层
 * 
 */
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.pb.dao.QuestionMapper;
import cn.pb.pojo.Question;
import cn.pb.service.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {
	@Resource
	private QuestionMapper questionMapper;

	/**
	 * 查询所有的question
	 */
	public List<Question> findAll() {
		return questionMapper.findAll();
	}

	/**
	 * 新增
	 */
	public boolean add(Question question) {
		int i = questionMapper.add(question);
		if (i > 0) {
			return true;
		}
		return false;
	}

	/**
	 * 根据id查询question
	 */
	public Question findById(Integer id) {

		return questionMapper.findById(id);
	}

}
