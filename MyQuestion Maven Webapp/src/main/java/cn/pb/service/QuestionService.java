package cn.pb.service;

import java.util.List;

import cn.pb.pojo.Question;

public interface QuestionService {
	/**
	 * 查询所有的question
	 * 
	 * @return
	 */
	List<Question> findAll();

	/**
	 * 新增question
	 * 
	 * @param question
	 * @return
	 */
	boolean add(Question question);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	Question findById(Integer id);

}
