package com.sy.test.demo.test;

import java.net.URL;

import com.sy.test.demo.Application;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by sun on 2016/4/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class SampleControllerTest {

    private URL base;
    private RestTemplate template;

    @Before
    public void setUp() throws Exception {
        Application.main(new String[]{""});
        this.base = new URL("http://localhost:8080/sample/hello/sun");
        template = new TestRestTemplate();
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);
        assertThat(response.getBody(), equalTo("Hello user sun"));
    }
}
