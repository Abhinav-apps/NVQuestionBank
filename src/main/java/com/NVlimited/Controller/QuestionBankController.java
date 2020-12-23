package com.NVlimited.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



import com.NVlimited.Beans.Question;
import com.NVlimited.Service.QuestionBankService;

@RestController
public class QuestionBankController {
	@Autowired
	private QuestionBankService questionBankService;
	
	
	@RequestMapping("/questions")
	public List<Question> getAllQuestions(){
		return questionBankService.getAllQuestions();
	}

	@RequestMapping(method=RequestMethod.PUT, value="/question/{id}")
	public void updateQuestion(@RequestBody Question question){
		questionBankService.updateQuestion(question);
	}
}
