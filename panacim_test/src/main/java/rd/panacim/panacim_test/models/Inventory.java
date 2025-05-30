package rd.panacim.panacim_test.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "inventory")
@Getter
@Setter
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Inventory_Id\"")
    private Long inventoryId;

    @Column(name = "\"Inventory_PartId\"")
    private Long partId;

    @Column(name = "\"Inventory_PartNumber\"")
    private String partNumber;

    @Column(name = "\"Inventory_TrackingType\"")
    private String trackingType;

    @Column(name = "\"Inventory_MaterialTraceId\"")
    private String materialTraceId;

    @Column(name = "\"Inventory_Quantity\"")
    private Integer quantity;

    @Column(name = "\"Inventory_LocationId\"")
    private Long locationId;

    @Column(name = "\"Inventory_ParentLocationId\"")
    private Long parentLocationId;

    @Column(name = "\"Inventory_LastLocationId\"")
    private Long lastLocationId;

    @Column(name = "\"Inventory_MaterialControl\"")
    private String materialControl;

    @Column(name = "\"Inventory_MaterialIdentifier\"")
    private String materialIdentifier;

    @Column(name = "\"Inventory_Status\"")
    private String status;

    @Column(name = "\"Inventory_ReservationReference\"")
    private String reservationReference;

    @Column(name = "\"Inventory_ExpirationDate\"")
                 private String expirationDate;

    @Column(name = "\"Inventory_ReceivedDate\"")
    private String receivedDate;

    @Column(name = "\"Inventory_UOMId\"")
    private Long uomId;

    @Column(name = "\"Inventory_UOMName\"")
    private String uomName;

    @Column(name = "\"Inventory_UpdatedDate\"")
    private String updatedDate;

    @Column(name = "\"Inventory_UpdatedBy\"")
    private String updatedBy;

    @Column(name = "\"Inventory_LabelingStatus\"")
    private String labelingStatus;

    @Column(name = "\"Inventory_Printer\"")
    private String printer;

    @Column(name = "\"Inventory_SplicedMaterialIdentifier\"")
    private String splicedMaterialIdentifier;

    @Column(name = "\"Inventory_SplicedInventoryId\"")
    private Long splicedInventoryId;

    @Column(name = "\"Inventory_CarrierId\"")
    private Long carrierId;

    @Column(name = "\"Inventory_CarrierNumber\"")
    private String carrierNumber;

    @Column(name = "\"Inventory_ReservedQuantity\"")
    private Integer reservedQuantity;

    @Column(name = "\"Inventory_CalculatedStatus\"")
    private String calculatedStatus;

    @Column(name = "\"Inventory_InitialQuantity\"")
    private Integer initialQuantity;

    @Column(name = "\"Inventory_AvailableQuantity\"", insertable = false, updatable = false)
    private Integer availableQuantity;

    @Column(name = "\"Inventory_ConsumedQuantity\"")
    private Integer consumedQuantity;

    @Column(name = "\"Inventory_ScrappedQuantity\"")
    private Integer scrappedQuantity;

    @Column(name = "\"Inventory_ParentInventory_Id\"")
    private Long parentInventoryId;

    @Column(name = "\"Inventory_ParentMaterialIdentifier\"")
    private String parentMaterialIdentifier;

    @Column(name = "\"Inventroy_MaterialName\"")
    private String materialName;

    @Column(name = "\"Inventory_PU_Location\"")
    private String puLocation;

    @Column(name = "\"Inventory_LifetimeCount\"")
    private Integer lifetimeCount;

    @Column(name = "\"Inventory_Bulk_Barcode\"")
    private String bulkBarcode;

    @Column(name = "\"Inventory_Is_Bulk\"")
    private Boolean isBulk;

    @Column(name = "\"Inventory_ManufacturingDate\"")
    private String manufacturingDate;

    @Column(name = "\"Inventory_PartClass\"")
    private String partClass;

    @Column(name = "\"Inventory_MaterialType\"")
    private String materialType;

    @Column(name = "\"Inventory_CheckinDate\"")
    private String checkinDate;

    @Column(name = "\"Inventory_UsageCount\"")
    private Integer usageCount;

    @Column(name = "\"Inventory_PartAlternateNumbers_Id\"")
    private Long partAlternateNumbersId;

    @Column(name = "\"Inventory_ReelNumber\"")
    private String reelNumber;

    @Column(name = "\"Inventory_MainReelId\"")
    private Long mainReelId;

    @Column(name = "\"Inventory_ReasonCode\"")
    private String reasonCode;

    @Column(name = "\"Inventory_LastCarrierNumber\"")
    private String lastCarrierNumber;

    // Getters and Setters

}
