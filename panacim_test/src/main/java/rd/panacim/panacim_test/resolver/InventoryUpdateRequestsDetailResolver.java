package rd.panacim.panacim_test.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.Arguments;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsDetail;
import rd.panacim.panacim_test.services.InventoryUpdateRequestsDetailService;

import java.util.List;

@Controller
public class InventoryUpdateRequestsDetailResolver {
@Autowired
    InventoryUpdateRequestsDetailService inventoryUpdateRequestsDetailService;
    @QueryMapping
    public List<InventoryUpdateRequestsDetail>getInventoryUpdateRequestsDetailByRequestId(@Argument Long requestId){
    System.out.println("request id :: "+ requestId);
    return this.inventoryUpdateRequestsDetailService.getByRequestId(requestId);
    }
}
