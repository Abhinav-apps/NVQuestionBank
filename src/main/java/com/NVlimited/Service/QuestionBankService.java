package com.NVlimited.Service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NVlimited.Beans.Question;
import com.NVlimited.Dao.QuestionBankReopistory;



@Service
public class QuestionBankService {

	@Autowired
	private QuestionBankReopistory questionBankReopistory;
	
	public List<Question> getAllQuestions(){
		
		List<Question> questions = new ArrayList<Question>();
		questionBankReopistory.findAll()
							  .forEach(question -> questions.add(question));
		return questions;
	}
	
	
	public void updateQuestion(Question question){
		questionBankReopistory.save(question);
	}
	
}
