package com.testinspring.testspring.repository;

import com.testinspring.testspring.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
