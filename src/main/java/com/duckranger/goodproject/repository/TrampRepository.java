package com.duckranger.goodproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duckranger.goodproject.domain.Tramp;

public interface TrampRepository extends JpaRepository<Tramp, Long> {
}
