package com.hexaware.onetomanydemo.service;


import java.util.List;
import java.util.Optional;

import com.hexaware.onetomanydemo.entity.Story;
import com.hexaware.onetomanydemo.exception.ResourceNotFoundException;

public interface IStoryService {
	public List<Story> findAllStories();
	public Optional<Story> getStoryById(Long StoryId)throws ResourceNotFoundException;
	public void deleteStoryById(Long StoryId)throws ResourceNotFoundException;
	public Story updateStoryById(Story story,Long StoryId)throws ResourceNotFoundException;
	public Story saveStoryById(Story story);
	

}
