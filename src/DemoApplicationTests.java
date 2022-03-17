package com.Nekit.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

@Test
public void testSearch() throws Exception {
	mockMvc.perform(get("/search/"))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(status().isOk());
@Test
	public void users/index:() throws Exception {
		mockMvc.perform(post("/users/").content("      { \n" +
								"        \"date_of_birth\": \"1999-12-11\",\n" +
								"        \"email\": \" qwerty123@mail.ru \",\n" +
								"        \"language\": \"RU\",\n" +
								"        \"password\": \"123\",\n" +
								"        \"fullName\": \"PPP\",\n" +
								"        \"verify\": \"1\",\n" +
								"        \"id\": \"52\"\n" +						"  }").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());

@Test
	public void addCarPart() throws Exception {
		mockMvc.perform(post("/basket/").content("      { \n" +
								"        \"name\": \" Тормозной шланг УАЗ \",\n" +
								"        \"id\": \"14\",\n" +
								"        \"orders\": \"1\",\n" +
								"        \"price\": \"120\" \n" +
								"  }").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	}



	
@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
@Retention(RetentionPolicy.RUNTIME)
@interface MockMvcTest {}