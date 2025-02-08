package org.hyeonqz.springlab.exceptionEx.infrastructure;

import org.hyeonqz.dddstart.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
