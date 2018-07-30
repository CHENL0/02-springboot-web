package test.com.test.springboot.springboot.controller; 

import com.jayway.jsonpath.JsonPath;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/** 
* GreetingController Tester. 
* 
* @author <Authors name> 
* @since <pre>ÆßÔÂ 30, 2018</pre> 
* @version 1.0 
*/ 
@RunWith(value = SpringJUnit4ClassRunner.class)
@WebMvcTest£¨GreetingController.class£©
@AutoConfigureRestDocs

public class GreetingControllerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: greeting(@RequestParam(value="name",defaultValue = "World")String name) 
* 
*/ 
@Autowired
private MockMvc mvc;

@Test
public void testGreeting() throws Exception { 
//TODO: Test goes here... 
    this.mvc.perform(get("/greeting").param("name","worlds"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.length()").value(2))
            .andDo()
} 


} 
