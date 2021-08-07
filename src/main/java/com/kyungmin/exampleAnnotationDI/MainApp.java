package com.kyungmin.exampleAnnotationDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		//Spring Container 생성
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/kyungmin/exampleAnnotationDI/conf/animal.xml");
		
		//petOwner Bean 가져오기
		PetOwner petOwner = (PetOwner) context.getBean("id_petOwner");
		petOwner.play();
		
		context.close();

	}

}
