package client;

import dto.FakeStoreProductResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class FakeStoreClient {

    private RestTemplateBuilder restTemplateBuilder;
    @Value("${fakeStore.api.base.url}")
    private String fakeStoreAPIBaseURL;
    @Value("${fakeStore.api.product.url}")
    private String fakeStoreAPIProductPath;

    @Autowired
    public List<FakeStoreProductResponseDTO> getAllProducts(){

        String fakeStoreGetAllProductsURL = fakeStoreAPIBaseURL.concat(fakeStoreAPIProductPath);
        RestTemplate restTemplate = restTemplateBuilder.build();
        ResponseEntity<FakeStoreProductResponseDTO []> productResponseList = restTemplate.getForEntity(fakeStoreGetAllProductsURL,FakeStoreProductResponseDTO[].class);
        return List.of(productResponseList.getBody());
    }
}
