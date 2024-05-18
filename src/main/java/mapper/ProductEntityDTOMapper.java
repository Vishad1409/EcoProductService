package mapper;

import dto.ProductResponseDTO;
import entity.Product;

public class ProductEntityDTOMapper {
    public static ProductResponseDTO convertProductResponseDTO(Product product){

        ProductResponseDTO responseDTO = new ProductResponseDTO();
        System.err.println(responseDTO);


        return responseDTO;
    }
}
