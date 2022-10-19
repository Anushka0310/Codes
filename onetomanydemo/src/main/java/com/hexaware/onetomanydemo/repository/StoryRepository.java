package com.hexaware.onetomanydemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.onetomanydemo.entity.Story;

public interface StoryRepository extends JpaRepository<Story, Long> {

}
