package cn.pb.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.pb.pojo.Answer;
import cn.pb.service.AnswerService;

@Controller
@RequestMapping(value = "/answer")
public class AnswerController {
	@Resource
	private AnswerService answerService;
	Logger logger = Logger.getLogger(AnswerController.class);

	@RequestMapping(value = "/save/{id}")
	public String save(@PathVariable Integer id, Answer answer) {
		logger.debug("进入了answer的save方法：question的id为：" + id);
		answer.setAnsDate(new Date());
		answer.setQid(id);
		logger.debug("要新增的answer为：" + answer);
		boolean flag = answerService.add(answer);
		if (flag) {
			// 新增成功 重新查询所有
			return "redirect:/question/findAll";
		}
		// 新增失败 重定向到question controller中的/findById/{id}
		return "redirect:/question/findById/" + id;
	}
}
