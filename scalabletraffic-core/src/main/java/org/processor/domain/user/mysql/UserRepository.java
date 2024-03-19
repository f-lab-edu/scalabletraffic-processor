package org.processor.domain.user.mysql;

import org.processor.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> , UserCustomRepository {
}
