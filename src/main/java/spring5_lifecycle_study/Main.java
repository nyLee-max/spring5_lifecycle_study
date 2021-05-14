package spring5_lifecycle_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import spring5_lifecycle_study.config.AppCtx;
import spring5_lifecycle_study.spring.Client;

public class Main {
	public static void main(String[] args) {
		try (AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);) {
			Client client = ctx.getBean(Client.class);
			client.setHost("host");
			client.send();
		}
	}
}
