package com.whd.designpatterns.status;

public abstract class State {
	
	private State s;
	
	public State(){
		
	}
	
	public State(State s){
		this.s = s;
	}
	
	public abstract void state(int state);

}
