package com.test.springboot.springboot;

import com.jayway.jsonpath.JsonPath;
import com.test.springboot.springboot.controller.GreetingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import javax.swing.text.Document;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
@AutoConfigureRestDocs

public class ApplicationTests {

   @Autowired
    private MockMvc mvc;
    @Test
    public void contextLoads() throws Exception {
        this.mvc.perform(get("/greeting").param("name","worlds"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()"))
                .andDo(document("list-users"));
      
                
    }
    
}
