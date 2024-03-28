package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Myclass {

	@Value("#{11+12+11}")
	int x;
	
	@Value("#{11+12+12}")
	int y;
	
	  @Value("#{ T(java.lang.Math).random() * 100  }")
	int random;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	@Override
	public String toString() {
		return "Myclass [x=" + x + ", y=" + y + ", random=" + random + "]";
	}
	
	
	

	


	
	
}
