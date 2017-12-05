package cn.pb.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.pb.pojo.Question;
import cn.pb.service.QuestionService;

/**
 * controller控制层
 * 
 * @author Administrator
 */
@Controller
@RequestMapping(value = "/question")
public class QuestionController {
	@Resource
	private QuestionService questionService;

	Logger logger = Logger.getLogger(QuestionController.class);

	/**
	 * 查询所有的question
	 * 
	 * @return
	 */
	@RequestMapping(value = "/findAll")
	public ModelAndView findAll() {
		logger.debug("进入了question的findAll方法！");
		List<Question> list = questionService.findAll();
		logger.debug("返回的所有的question集合：" + list);
		ModelAndView mv = new ModelAndView();
		mv.addObject("questionList", list);
		mv.setViewName("questionsList");
		return mv;
	}

	/**
	 * 跳转到add页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "/add")
	public String add() {

		return "questionadd";
	}

	/**
	 * 保存数据
	 * 
	 * @return
	 */
	@RequestMapping(value = "/save")
	public String save(Question question) {
		logger.debug("进入了save方法：要新增的对象question：" + question);
		question.setLastModified(new Date());
		question.setAnswerCount(0);
		boolean flag = questionService.add(question);
		if (flag) {
			return "redirect:/question/findAll";
		}
		return "questionadd";
	}

	/**
	 * 根据id查找question以及下面的回答
	 * 
	 * @return
	 */
	@RequestMapping(value = "/findById/{id}")
	public ModelAndView findById(@PathVariable Integer id) {
		logger.debug("要查询的question的id：" + id);
		Question question = questionService.findById(id);
		logger.debug("根据id查询到的question：" + question);
		ModelAndView mv = new ModelAndView();
		mv.addObject("question", question);
		mv.setViewName("questiondetail");
		return mv;
	}

}
