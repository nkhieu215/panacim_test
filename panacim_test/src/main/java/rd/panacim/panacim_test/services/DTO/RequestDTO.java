package rd.panacim.panacim_test.services.DTO;

import rd.panacim.panacim_test.models.InventoryUpdateRequests;
import rd.panacim.panacim_test.models.InventoryUpdateRequestsDetail;

import java.util.List;

public class RequestDTO {
    private InventoryUpdateRequests request;
    private List<InventoryUpdateRequestsDetail> detail;

    public InventoryUpdateRequests getRequest() {
        return request;
    }

    public void setRequest(InventoryUpdateRequests request) {
        this.request = request;
    }

    public List<InventoryUpdateRequestsDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<InventoryUpdateRequestsDetail> detail) {
        this.detail = detail;
    }
}
