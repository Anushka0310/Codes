package com.hexaware.onetomanydemo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.onetomanydemo.entity.Story;
import com.hexaware.onetomanydemo.exception.ResourceNotFoundException;
import com.hexaware.onetomanydemo.service.IStoryService;



@RestController
@RequestMapping("/storyapi")
public class StoryController {
	
	@Autowired
	private IStoryService storyService;
	
	@GetMapping("/findallstories")
	public List<Story> findAllStories(){
		return storyService.findAllStories();
	}
	
	@GetMapping("/getstorybyid/{storyid}")
	public Optional<Story> getStoryById(@PathVariable("storyid") Long storyid) throws ResourceNotFoundException{
		return storyService.getStoryById(storyid);
	}
	
	@DeleteMapping("/deletestorybyid/{storyid}")
	public void deleteStoryById(@PathVariable("storyid") Long storyid) throws ResourceNotFoundException{
		storyService.deleteStoryById(storyid);
	}
	
	@PutMapping("/updatestorybyid/{storyid}")
	public Story updateStoryById(@RequestBody Story story,@PathVariable("storyid")  Long storyid)throws ResourceNotFoundException{
		return storyService.updateStoryById(story, storyid);
	}
	
	@PostMapping("/savestory")
	public Story saveStory(@RequestBody Story story) {
		return storyService.saveStoryById(story);
	}

}