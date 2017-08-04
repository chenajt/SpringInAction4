package com.silence.forest.knights;

/**
 * 勇敢无畏骑士
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日上午11:27:19 TODO</li>
 * </ul>
 */
public class BraveKnight implements Knight{
	private Quest quest ;
	public BraveKnight(Quest quest){
		this.quest = quest;
	}
	public void embarkQuest() throws QuestException {
		quest.embark();
	}

}
