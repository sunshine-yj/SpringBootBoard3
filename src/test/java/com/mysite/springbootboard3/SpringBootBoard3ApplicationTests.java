package com.mysite.springbootboard3;

import static org.junit.jupiter.api.Assertions.*;

import com.mysite.springbootboard3.answer.Answer;
import com.mysite.springbootboard3.answer.AnswerRepository;
import com.mysite.springbootboard3.question.Question;
import com.mysite.springbootboard3.question.QuestionRepository;
import com.mysite.springbootboard3.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
class SpringBootBoard3ApplicationTests {

//    @Autowired
//    private QuestionRepository questionRepository;
//
//    @Autowired
//    private AnswerRepository answerRepository;

    @Autowired
    private QuestionService questionService;


    @Test
    void contextLoads() {
//        Question q1 = new Question();
//        q1.setSubject("sbb가 무엇인가요?");
//        q1.setContent("sbb에 대해서 알고싶습니다.");
//        q1.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q1);
//
//        Question q2 = new Question();
//        q2.setSubject("스프링부트 모델 질문입니다.");
//        q2.setContent("id는 자동으로 생성되나요?.");
//        q2.setCreateDate(LocalDateTime.now());
//        this.questionRepository.save(q2);

//        Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//        assertEquals(1, q.getId());

//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        q.setSubject("수정된 제목");
//        this.questionRepository.save(q);

//        assertEquals(2, this.questionRepository.count());
//        Optional<Question> oq = this.questionRepository.findById(1);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//        this.questionRepository.delete(q);
//        assertEquals(1, this.questionRepository.count());

//        Optional<Question> oq = this.questionRepository.findById(2);
//        assertTrue(oq.isPresent());
//        Question q = oq.get();
//
//        Answer a = new Answer();
//        a.setContent("네 자동으로 생성됩니다.");
//        a.setQuestion(q);
//        a.setCreateDate(LocalDateTime.now());
//        this.answerRepository.save(a);

        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다.:[%03d]", i);
            String content = "내용무";
            this.questionService.create(subject, content);
        }

    }

}
