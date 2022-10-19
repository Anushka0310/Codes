package com.hexaware.onetomanydemo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="Story")

public class Story {
	@Id
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="story_id")
	private Long storyId;
	@Column(name="story_name")
	private String storyName;

	public Story() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Story(Long storyId, String storyName) {
		super();
		this.storyId = storyId;
		this.storyName = storyName;
	}

	public Long getStoryId() {
		return storyId;
	}

	public void setStoryId(Long storyId) {
		this.storyId = storyId;
	}

	public String getStoryName() {
		return storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}

	@Override
	public String toString() {
		return "Story [storyId=" + storyId + ", storyName=" + storyName + "]";
	}

}