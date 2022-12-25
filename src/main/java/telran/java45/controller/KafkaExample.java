package telran.java45.controller;



//import java.util.function.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaExample {

	@KafkaListener(topics = "dkchutgj-default")
	public void print(String str){
		System.out.println(str);
	}
	
//	public Consumer<Person> log() {
//	    return person -> {
//	        System.out.println("Received: " + person);
//	    };
//	}
//
//	public static class Person {
//		private String name;
//		public String getName() {
//			return name;
//		}
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String toString() {
//			return this.name;
//		}
//	}
}
