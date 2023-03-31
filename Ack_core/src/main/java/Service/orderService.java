package Service;

import org.springframework.stereotype.Service;

import com.elementsoftech.core.entity.ADdocuments;
import com.elementsoftech.core.entity.OrderHeader;
import com.elementsoftech.core.entity.ProductInfo;

@Service
public interface orderService {
public OrderHeader addOrder(OrderHeader order);
public ProductInfo addProduct(ProductInfo product);
public ADdocuments ADDocumentGenerateAndPersist(OrderHeader order);
public ADdocuments RDDocumentGenerateAndPersist(OrderHeader order);
OrderHeader updateOrderHeader(OrderHeader order, Long pOnumber);

}
