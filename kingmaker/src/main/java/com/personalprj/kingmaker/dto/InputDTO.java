package com.personalprj.kingmaker.dto;

public class InputDTO {
	
	private Long id;
	private String text;
	private Long userId;
	
	public InputDTO() {
		super();
	}

	public InputDTO(Long id, String text, Long userId) {
		super();
		this.id = id;
		this.text = text;
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "InputDTO [id=" + id + ", text=" + text + ", userId=" + userId + "]";
	}

}
