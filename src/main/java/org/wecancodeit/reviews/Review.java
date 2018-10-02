package org.wecancodeit.reviews;

public class Review {

	private long id;
	private String name;
	private String resortOptions;
	private String content;
	private String image;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getResortOptions() {
		return resortOptions;
	}

	public String getContent() {
		return content;
	}

	public String getImage() {
		return image;
	}

	public Review(long id, String name, String resortOptions, String content, String image) {
		this.id = id;
		this.name = name;
		this.resortOptions = resortOptions;
		this.content = content;
		this.image = image;
	}

}
