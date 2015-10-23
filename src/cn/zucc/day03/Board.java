package cn.zucc.day03;

public class Board {
	private int boardid;
	private String boardName;
	private int parentid;
	
	
	public void setboardid(int boardid){
		this.boardid=boardid;
	}
	public int getboardid(){
		return boardid;
	}
	public void setboardName(String boardName){
		this.boardName=boardName;
	}
	public String getboardName(){
		return boardName;
	}
	public void setparentid(int parentid){
		this.parentid=parentid;
	}
	public int getparentid(){
		return parentid;
	}
	public void getBoardInfo(){
		System.out.println("====°å¿éĞÅÏ¢====");
		System.out.println("°å¿éÃû³Æ£º"+boardName);
	}
}
