package com.cloud.stram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.stream.entity.Message;

@RestController
public class CloudStreamController {
	
	@Autowired
	// @Output("out")nothhing just show im using output 
	private MessageChannel output ; // must be output
	
	/*
	@Autowired
	private  Source source;
	*/
	
	@PostMapping("/publish")
	public Message publisherEvent (@RequestBody Message message) {
		output.send(MessageBuilder.withPayload(message).build());
		return message;
		
	}
}
