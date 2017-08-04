package com.silence.forest.knights;

/**
 * 风流骑士
 * 
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日上午11:17:17 TODO</li>
 * </ul>
 */
public class DamselResuingKnight implements Knight{
	private RescueDamselQuest quest;
	public DamselResuingKnight(){
		quest = new RescueDamselQuest();
	}
	public void embarkQuest() throws QuestException {
		quest.embark();
	}

}
