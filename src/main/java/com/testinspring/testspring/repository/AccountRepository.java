package com.testinspring.testspring.repository;

import com.testinspring.testspring.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
