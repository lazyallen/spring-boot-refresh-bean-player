package com.example.lazyallen.refreshbeanplayer.model;


import lombok.Builder;

/**
 * @author allen
 * @Date 2020/5/23
 */
@Builder
public class Apple {

	public Apple(String name, String color, boolean enable) {
		this.name = name;
		this.color = color;
		this.enable = enable;
	}

	String name;
	String color;
	boolean enable;

	@Override
	public String toString() {
		return "Apple{" +
				"name='" + name + '\'' +
				", color='" + color + '\'' +
				", enable=" + enable +
				'}';
	}
}
