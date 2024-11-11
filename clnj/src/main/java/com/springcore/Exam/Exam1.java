package com.springcore.Exam;

import java.util.List;

public class Exam1 {

		private String question;
		private List<String> answer;
		/**
		 * @return the question
		 */
		public String getQuestion() {
			return question;
		}
		/**
		 * @param question the question to set
		 */
		public void setQuestion(String question) {
			this.question = question;
		}
		/**
		 * @return the answer
		 */
		public List<String> getAnswer() {
			return answer;
		}
		/**
		 * @param answer the answer to set
		 */
		public void setAnswer(List<String> answer) {
			this.answer = answer;
		}
		public Exam1() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Exam1(String question, List<String> answer) {
			super();
			this.question = question;
			this.answer = answer;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Exam1 [question=" + question + ", answer=" + answer + "]";
		}
		

}
