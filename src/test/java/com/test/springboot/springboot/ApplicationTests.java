package com.test.springboot.springboot;

import com.jayway.jsonpath.JsonPath;
import com.test.springboot.springboot.controller.GreetingController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import sun.nio.cs.ext.MacDingbat;

import javax.swing.text.Document;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GreetingController.class)
@AutoConfigureRestDocs

public class ApplicationTests {
//.accept(MediaType:APPLICATION_JSON)
   @Autowired
    private MockMvc mvc;
 /*
 * @Author Chen
 * @Description //TODO to test all method of GreetingController.java
 * @Date 22:41 2018/7/30
 * @Param []
 * @return void
 **/
    @Test
    public void greeting() throws Exception {
        /**
         * @Description //TODO test greeting method what requestmethod of get
         */
        this.mvc.perform(get("/greeting")
                .param("name","test").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andDo(document("list-users"));
        /**
         * @Description //TODO test greeting2 method what requestmethod of post
         */
        this.mvc.perform(post("/greeting2")
                .param("name","post").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("post-hello"));
        /**
         * @Description //TODO test greeting3 method what requestmethod of get
         */
        this.mvc.perform(get("/greeting3")
                .param("name","get").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(document("get-hello"));
        /**
         * @Description //TODO test greeting4 method what requestmethod of put
         */
        this.mvc.perform(put("/greeting4").param("name","put"))
                .andExpect(status().isOk())
                .andDo(document("put-hello"));
        /**
         * @Description //TODO test greeting5 method what requestmethod of delete
         */
        this.mvc.perform(delete("/greeting5")
                .param("name","delete").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andDo(document("delete-hello"));
        /**
         * @Description //TODO test test1 method what requestmethod of get
         */
        this.mvc.perform(get("/producttest").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(3))
                .andExpect(content().json("{\"code\":1,\"msg\":\"成功\",\"productList\"" +
                        ":[{\"name\":\"热榜\",\"type\":1,\"foods\":{\"foodid\":1,\"foodname\":\"面包\"" +
                        ",\"fooddescription\":\"好吃\",\"price\":1.2,\"inco\":\"http://xxx.com\"}}," +
                        "{\"name\":\"好吃的\",\"type\":2,\"foods\":{\"foodid\":2,\"foodname\":\"面包\"," +
                        "\"fooddescription\":\"好吃\",\"price\":1.2,\"inco\":\"http://xxx.com\"}}]}"))
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }
    
}
