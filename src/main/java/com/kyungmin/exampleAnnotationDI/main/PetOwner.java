package com.kyungmin.exampleAnnotationDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PetOwner {
	
	@Autowired //의존성 주입(wiring by type)
	@Qualifier(value="qf_dog") //AnimalType의 Bean이 2개 이상(cat, dog)이기 떄문에 이를 정확하게 구분하기 위해
	private AnimalType animal;
	
	public void play() {
		animal.sound();
	}
	
}
