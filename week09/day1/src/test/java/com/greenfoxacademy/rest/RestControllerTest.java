package com.greenfoxacademy.rest;

import com.greenfoxacademy.rest.controller.RESTController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@RunWith(SpringRunner.class)
@WebMvcTest(RESTController.class)
public class RestControllerTest {
    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));


    @Autowired
    MockMvc mockMvc;

    @Test
    public void doublingTest_ResultInt() throws Exception{

        mockMvc.perform(
                get("/doubling?input=2"))
                .andExpect(jsonPath("$.result", is(4)));

    }

    @Test
    public void greetingUserTest_ResultString() throws Exception{

        mockMvc.perform(
                get("/greeter?name=Viki&title=student"))
                .andExpect(jsonPath("$.name", is("Viki")))
                .andExpect(jsonPath("$.title", is("student")));

    }

    @Test
    public void appenATest_ResultInt() throws Exception{

        mockMvc.perform(
                get("/appenda/{appendable}", "kuty"))
                .andExpect(jsonPath("$.appended", is("kutya")));

    }

    @Test
    public void doUntilSumTest_ResultInt() throws Exception{

        mockMvc.perform(
                post("/dountil/{action}", "sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(jsonPath("$.result", is(15)));

    }

    @Test
    public void doUntilFactorTest_ResultInt() throws Exception{

        mockMvc.perform(
                post("/dountil/{action}", "factor")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\": 5}"))
                .andExpect(jsonPath("$.result", is(120)));

    }

    @Test
    public void arrayHandlingSumTest_ResultDouble() throws Exception{

        mockMvc.perform(
                post("/arrays")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"what\": \"sum\", \"numbers\": [1,2,5,10]}"))
                .andExpect(jsonPath("$.result", is(18)));
    }

    @Test
    public void arrayHandlingMultiplyTest_ResultDouble() throws Exception{

        mockMvc.perform(
                post("/arrays")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"what\": \"multiply\", \"numbers\": [1,2,5,10]}"))
                .andExpect(jsonPath("$.result", is(100)));
    }

    @Test
    public void arrayHandlingDoubleTest_ResultDouble() throws Exception{
        mockMvc.perform(
                post("/arrays")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"what\": \"double\", \"numbers\": [1,2,5,10]}"))
                .andExpect(jsonPath("$.result[0]", is(2)))
                .andExpect(jsonPath("$.result[1]", is(4)))
                .andExpect(jsonPath("$.result[2]", is(10)))
                .andExpect(jsonPath("$.result[3]", is(20)));
    }
}
