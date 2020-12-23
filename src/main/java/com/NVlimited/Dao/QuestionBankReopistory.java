package com.NVlimited.Dao;

import org.springframework.data.repository.CrudRepository;

import com.NVlimited.Beans.Question;

public interface QuestionBankReopistory extends CrudRepository<Question, String> {

}
