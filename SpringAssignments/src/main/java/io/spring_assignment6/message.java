package io.spring_assignment6;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class message {
	
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void display() {
		
		System.out.println(this.messageSource.getMessage("dburl",null,"www.*.com",null));
		System.out.println(this.messageSource.getMessage("username",null,"no username",null));
		System.out.println(this.messageSource.getMessage("password",null,"no password",null));
		
	}

}
