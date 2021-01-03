package com.testinium.bookShop;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class EndpointTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void listAllBooksShouldReturnOK() throws Exception {
        this.mockMvc.perform(get("/book/listAll")).andExpect(status().isOk());
    }

    @Test
    public void listAllCategoriesShouldReturnOK() throws Exception {
        this.mockMvc.perform(get("/category/listAllCategories")).andExpect(status().isOk());
    }

    @Test
    public void listAllStoresShouldReturnOK() throws Exception {
        this.mockMvc.perform(get("/bookStore/listAllBookStores")).andExpect(status().isOk());
    }
}


