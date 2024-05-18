package dto;

import entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponseDTO {
    private int id;
    private String title;
    private double price;
    private String desc;
    private String category;
    private String image;
    private double rating;

}
