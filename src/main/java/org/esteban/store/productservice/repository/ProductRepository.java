package org.esteban.store.productservice.repository;

import org.esteban.store.productservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository  extends MongoRepository<ProductEntity, String> {

}
