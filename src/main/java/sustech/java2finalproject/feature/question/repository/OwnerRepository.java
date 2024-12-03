package sustech.java2finalproject.feature.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sustech.java2finalproject.domain.Owner;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
    Owner findByAccountId(Integer accountId);
}