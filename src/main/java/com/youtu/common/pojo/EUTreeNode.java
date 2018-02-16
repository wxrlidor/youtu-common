package com.youtu.common.pojo;
/**
 * 商品类目选择异步tree使用的结构pojo类
 * {
		"id" : 1,
		"text" : "显示的名称",
		"state" : “closed”     //closed表示是父节点，也就是下面有子节点，叶子节点表示为open
	}
 *@author:王贤锐
 *@date:2018年1月2日  下午4:43:14
**/
public class EUTreeNode {
	private long id;
	private String text;
	private String state;

	public EUTreeNode(long id, String text, String state) {
		this.id = id;
		this.text = text;
		this.state = state;
	}
	
	public EUTreeNode() {
		
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
