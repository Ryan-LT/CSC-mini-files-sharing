package com.fresherfinal.dto;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ranks")
public class Ranks {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String rankname;
	private int sizedownload;
	private int sizeupload;
	private int sizerank;
	public Ranks() {
		// TODO Auto-generated constructor stub
	}
	public Ranks(String rankname, int sizedownload, int sizeupload, int sizerank) {
		this.rankname = rankname;
		this.sizedownload = sizedownload;
		this.sizeupload = sizeupload;
		this.sizerank = sizerank;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRankname() {
		return rankname;
	}
	public void setRankname(String rankname) {
		this.rankname = rankname;
	}
	public int getSizedownload() {
		return sizedownload;
	}
	public void setSizedownload(int sizedownload) {
		this.sizedownload = sizedownload;
	}
	public int getSizeupload() {
		return sizeupload;
	}
	public void setSizeupload(int sizeupload) {
		this.sizeupload = sizeupload;
	}
	public int getSizerank() {
		return sizerank;
	}
	public void setSizerank(int sizerank) {
		this.sizerank = sizerank;
	}
	
}
