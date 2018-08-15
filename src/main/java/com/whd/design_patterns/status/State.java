package com.whd.design_patterns.status;

public abstract class State {
	
	private State s;
	
	public State(){
		
	}
	
	public State(State s){
		this.s = s;
	}
	
	public abstract void state(int state);

}
