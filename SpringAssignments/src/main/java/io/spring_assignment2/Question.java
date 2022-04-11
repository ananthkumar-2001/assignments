package io.spring_assignment2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	private int questionId;
	
	private String question;
	
	private List<String> answersList;
	
	private Set<String> answersSet;
	
	private Map<Integer, String> answersMap;
 
	public List<String> getAnswersList() {
		return answersList;
	}

	public void setAnswersList(List<String> answersList) {
		this.answersList = answersList;
	}

	public Set<String> getAnswersSet() {
		return answersSet;
	}

	public void setAnswersSet(Set<String> answersSet) {
		this.answersSet = answersSet;
	}

	public Map<Integer, String> getAnswersMap() {
		return answersMap;
	}

	public void setAnswersMap(Map<Integer, String> answersMap) {
		this.answersMap = answersMap;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public void getAnswers() {
		System.out.println(getQuestionId()+" "+getQuestion());
		for(String str : answersList) {
			System.out.println(str);
		}
		System.out.println(getQuestionId()+" "+getQuestion());
		for(String str : answersSet) {
			System.out.println(str);
		}
		System.out.println(getQuestionId()+" "+getQuestion());
		for(Map.Entry<Integer, String> map : answersMap.entrySet()) {
			System.out.println(map);
		}
	}
	
	
}
