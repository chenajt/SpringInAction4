package com.silence.forest.advancedFit;

/**
 * 会写诗的魔术师
 * @modificationHistory.  
 * <ul>
 * <li>clb 2017年8月7日上午11:50:06 TODO</li>
 * </ul> 
 */
public class PoeticJuggler extends Juggler{
	private Poem poem;

	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags,Poem poem){
		super(beanBags);
		this.poem = poem;
	}
	
	@Override
	public void perform() throws PerformanceException {
		super.perform();
		System.out.println("while reciting...");
		poem.recite();
	}
}
