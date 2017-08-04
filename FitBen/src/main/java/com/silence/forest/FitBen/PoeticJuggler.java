package com.silence.forest.FitBen;

/**
 * 会朗诵诗歌的杂技人
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月4日下午3:15:42 TODO</li>
 * </ul> 
 */
public class PoeticJuggler extends Juggler{
	private Poem poem;
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
