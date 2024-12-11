package sustech.java2finalproject.feature.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sustech.java2finalproject.domain.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}