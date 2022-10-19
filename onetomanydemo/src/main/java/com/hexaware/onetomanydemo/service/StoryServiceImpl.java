package com.hexaware.onetomanydemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.hexaware.onetomanydemo.entity.Story;
import com.hexaware.onetomanydemo.exception.ResourceNotFoundException;
import com.hexaware.onetomanydemo.repository.StoryRepository;

public class StoryServiceImpl implements IStoryService{

	@Autowired
	private StoryRepository storyRepo;

	@Override
	public List<Story> findAllStories() {
		return storyRepo.findAll();
	}

	@Override
	public Optional<Story> getStoryById(Long storyid) throws ResourceNotFoundException {
		return storyRepo.findById(storyid);
	}

	@Override
	public void deleteStoryById(Long storyid) throws ResourceNotFoundException {
		storyRepo.deleteById(storyid);		
	}

	@Override
	public Story updateStoryById(Story newstory, Long storyid) throws ResourceNotFoundException {
		Story oldStorydetails = getStoryById(storyid)
				.orElseThrow(() -> new ResourceNotFoundException("story with id" + storyid + " not found"));
		oldStorydetails.setStoryName(newstory.getStoryName());
		return storyRepo.save(oldStorydetails);
	}

	@Override
	public Story saveStoryById(Story story) {
		return storyRepo.save(story);
	}
}
