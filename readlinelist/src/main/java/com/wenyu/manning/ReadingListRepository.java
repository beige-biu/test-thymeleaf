package com.wenyu.manning;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Author:wenyu
 * 2020/2/13
 */
public interface ReadingListRepository extends JpaRepository<Book,Long> {
    List<Book> findByReader(String reader);
}
