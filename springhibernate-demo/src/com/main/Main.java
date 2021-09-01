package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.TraineeDao;
import com.to.Trainee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/to/beans.xml");
		TraineeDao dao = (TraineeDao) ap.getBean("dao");

		Trainee t = new Trainee("Maria", 12, 12333);
		System.out.println(dao.addTrainee(t));
		System.out.println("All trainees are");
		System.out.println(dao.getAllTrainees());
	}

}
