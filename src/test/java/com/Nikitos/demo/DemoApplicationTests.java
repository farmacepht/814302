package com.Nikitos.demo;

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
	public void addSections() throws Exception {
		mockMvc.perform(post("/sections/").content("    { \n" +
						"        \"id\": \"4\",\n" +
						"        \"section_priority\": \"0\",\n" +
						"        \"number\": \"44\",\n" +
						"        \"number_of_cells\": \"44\", \n" +
						"        \"product_type\": \"Навестная\" \n" +
						"  }").contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void addWarehouses() throws Exception {
		mockMvc.perform(post("/warehouses/").content("    {\n" +
								"        \"id\" : 4,\n" +
								"        \"address\": \"Минск, Беды 1234\",\n" +
								"        \"name\": \"Склад Шоколада\",\n" +
								"        \"number_of_sections\": 12\n" +
								"}").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void addDepartments() throws Exception {
		mockMvc.perform(post("/departments/").content("    { \n" +
								"        \"office_adress\": \"Минск, Беды 1204\",\n" +
								"        \"name\": \"Отдел логистики ягод\"\n" +
								"  }").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void addProduct() throws Exception {
		mockMvc.perform(post("/products/").content("      { \n" +
								"        \"name\": \"Малина\",\n" +
								"        \"product_priority\": \"1\",\n" +
								"        \"quantity\": \"96\",\n" +
								"        \"supplier\": \"ФермТорг\" \n" +
								"  }").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void addEmployees() throws Exception {
		mockMvc.perform(post("/employees/").content("      { \n" +
								"        \"date_of_birth\": \"2000-02-04\",\n" +
								"        \"email\": \"niknik@mai.ru\",\n" +
								"        \"employment_date\": \"2021-07-08\",\n" +
								"        \"password\": \"123456\",\n" +
								"        \"full_name\": \"Никита Никитич\",\n" +
								"        \"phone_number\": \"80257379959\",\n" +
								"        \"postion_id\": \"1\"\n" +
								"  }").contentType(MediaType.APPLICATION_JSON)
						.accept(MediaType.APPLICATION_JSON))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void testWarehouses() throws Exception {
		mockMvc.perform(get("/warehouses/"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void testCell_product() throws Exception {
		mockMvc.perform(get("/cell_product/"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void testRequests() throws Exception {
		mockMvc.perform(get("/requests/"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void testTasks() throws Exception {
		mockMvc.perform(get("/tasks/"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

	@Test
	public void testEmployees() throws Exception {
		mockMvc.perform(get("/employees/"))
				.andDo(MockMvcResultHandlers.print())
				.andExpect(status().isOk());
	}

}

@SpringBootTest
@TestPropertySource(locations = "classpath:test.properties")
@Retention(RetentionPolicy.RUNTIME)
@interface MockMvcTest {}