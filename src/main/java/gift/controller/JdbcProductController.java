package gift.controller;

import gift.dto.CreateProduct;
import gift.dto.EditProduct;
import gift.dto.ProductDTO;
import gift.repository.ProductDao;
import gift.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JdbcProductController {

    private final ProductService productService;
    public JdbcProductController(ProductDao productDao, ProductService productService) {
        this.productService = productService;
    }

    //insert
    @PostMapping("/product/jdbc")
    public String createProduct(@RequestBody CreateProduct.Request request) {
//        boolean isValid = productService.checkValidProductName(request.getName());
        productService.createProduct(request);
        return "product 가 생성되었습니다.";
    }

    //get one by id
//    @GetMapping("/product/jdbc/{id}")
//    public ProductDTO getProductById(@PathVariable("id") long id) {
//        return productDao.selectProduct(id);
//    }
//
//    //update
//    @PutMapping("/product/jdbc/{id}")
//    public void updateProduct(@PathVariable("id") long id, @RequestBody EditProduct.Request request) {
//        productDao.updateProduct(id, request);
//    }
//
//
//    //delete
//    @DeleteMapping("/product/jdbc/{id}")
//    public void deleteProduct(@PathVariable("id") long id) {
//        productDao.deleteProduct(id);
//    }
}

