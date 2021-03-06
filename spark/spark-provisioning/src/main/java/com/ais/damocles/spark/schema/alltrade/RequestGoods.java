package com.ais.damocles.spark.schema.alltrade;

import com.datastax.driver.mapping.annotations.Column;

import java.util.ArrayList;
import java.util.List;


public class RequestGoods extends com.ais.damocles.spark.schema.CommonSchema {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "transactionId")
    private String transactionId;
    @Column(name = "transactionType")
    private String transactionType;
    @Column(name = "requestNo")
    private String requestNo;
    @Column(name = "company")
    private String company;
    @Column(name = "forSubStock")
    private String forSubStock;
    @Column(name = "requestStatus")
    private String requestStatus;
    @Column(name = "fromLocationCode")
    private String fromLocationCode;
    @Column(name = "fromLocationName")
    private String fromLocationName;
    @Column(name = "fromLocationType")
    private String fromLocationType;
    @Column(name = "fromLocationSubType")
    private String fromLocationSubType;
    @Column(name = "fromLocationRegion")
    private String fromLocationRegion;
    @Column(name = "fromLocationProvince")
    private String fromLocationProvince;
    @Column(name = "toLocationCode")
    private String toLocationCode;
    @Column(name = "toLocationName")
    private String toLocationName;
    @Column(name = "toLocationType")
    private String toLocationType;
    @Column(name = "toLocationRegion")
    private String toLocationRegion;
    @Column(name = "toLocationSubType")
    private String toLocationSubType;
    @Column(name = "toLocationProvince")
    private String toLocationProvince;
    @Column(name = "pickingDateTime")
    private String pickingDateTime;
    @Column(name = "reservedNo")
    private String reservedNo;
    @Column(name = "doNo")
    private String doNo;
    @Column(name = "moveMentType")
    private String moveMentType;
    @Column(name = "createBy")
    private String createBy;
    @Column(name = "createDateTime")
    private String createDateTime;
    @Column(name = "updateBy ")
    private String updateBy;
    @Column(name = "updateDateTime ")
    private String updateDateTime;
    @Column(name = "cancelBy ")
    private String cancelBy;
    @Column(name = "cancelDateTime")
    private String cancelDateTime;
    @Column(name = "shipToCode")
    private String shipToCode;
    @Column(name = "shipToName")
    private String shipToName;
    @Column(name = "shipToProvince")
    private String shipToProvince;
    @Column(name = "shipToAddress")
    private String shipToAddress;
    @Column(name = "shipToDistributionChannel")
    private String shipToDistributionChannel;
    @Column(name = "receiveBy")
    private String receiveBy;
    @Column(name = "mobileNo")
    private String mobileNo;
    @Column(name = "routeGroup")
    private String routeGroup;
    @Column(name = "remark")
    private String remark;
    @Column(name = "reason")
    private String reason;
    @Column(name = "stampDelivery")
    private String stampDelivery;
    @Column(name = "matCode_key")
    private List<Object> matCode_key;
    @Column(name = "brand_key")
    private List<Object> brand_key;
    @Column(name = "model_key")
    private List<Object> model_key;
    @Column(name = "productType_key")
    private List<Object> productType_key;
    @Column(name = "productSubType_key")
    private List<Object> productSubType_key;
    @Column(name = "commercialName_key ")
    private List<Object> commercialName_key;
    @Column(name = "requestDetail ")
    private String requestDetail;
    @Column(name = "quotaFlag")
    private String quotaFlag;
    @Column(name = "itemNo")
    private String itemNo;
    @Column(name = "matDescription_key")
    private List<Object> matDescription_key;

    @Column(name = "deviceHandsetQty")
    private String deviceHandsetQty;

    @Column(name = "deviceHandsetBundleQty")
    private String deviceHandsetBundleQty;

    @Column(name = "simPrepaidQty")
    private String simPrepaidQty;

    @Column(name = "simPostpaidQty")
    private String simPostpaidQty;

    @Column(name = "premiumQty")
    private String premiumQty;

    @Column(name = "otherQty")
    private String otherQty;

    @Column(name = "contactNo")
    private String contactNo;

    public RequestGoods() {

    }

    public RequestGoods(String transactionId, String transactionType,
                        String requestNo, String company, String forSubStock,
                        String requestStatus, String fromLocationCode,
                        String fromLocationName, String fromLocationType,
                        String fromLocationSubType, String fromLocationRegion,
                        String fromLocationProvince, String toLocationCode,
                        String toLocationName, String toLocationType,
                        String toLocationRegion, String toLocationSubType,
                        String toLocationProvince, String pickingDateTime,
                        String reservedNo, String doNo, String moveMentType,
                        String createBy, String createDateTime, String updateBy,
                        String updateDateTime, String cancelBy, String cancelDateTime,
                        String shipToCode, String shipToName, String shipToProvince,
                        String shipToAddress, String shipToDistributionChannel,
                        String receiveBy, String mobileNo, String routeGroup,
                        String remark, String reason, String stampDelivery,
                        List<Object> matCode_key, List<Object> brand_key, List<Object> model_key,
                        List<Object> productType_key, List<Object> productSubType_key,
                        List<Object> commercialName_key, String requestDetail,
                        String quotaFlag, String itemNo,List<Object> matDescription_key,
                        String deviceHandsetQty, String deviceHandsetBundleQty, String simPrepaidQty,
                        String simPostpaidQty, String premiumQty, String otherQty, String contactNo) {

        this.deviceHandsetQty = deviceHandsetQty;
        this.columnMapper.put("deviceHandsetQty","deviceHandsetQty");

        this.deviceHandsetBundleQty = deviceHandsetBundleQty;
        this.columnMapper.put("deviceHandsetBundleQty","deviceHandsetBundleQty");

        this.simPrepaidQty = simPrepaidQty;
        this.columnMapper.put("simPrepaidQty","simPrepaidQty");

        this.simPostpaidQty = simPostpaidQty;
        this.columnMapper.put("simPostpaidQty","simPostpaidQty");

        this.premiumQty = premiumQty;
        this.columnMapper.put("premiumQty","premiumQty");

        this.otherQty = otherQty;
        this.columnMapper.put("otherQty","otherQty");

        this.contactNo = contactNo;
        this.columnMapper.put("contactNo","contactNo");

        this.transactionId = transactionId;
        this.columnMapper.put("transactionId", "transactionId");

        this.transactionType = transactionType;
        this.columnMapper.put("transactionType", "transactionType");

        this.requestNo = requestNo;
        this.columnMapper.put("requestNo", "requestNo");

        this.company = company;
        this.columnMapper.put("company", "company");

        this.forSubStock = forSubStock;
        this.columnMapper.put("forSubStock", "forSubStock");

        this.requestStatus = requestStatus;
        this.columnMapper.put("requestStatus", "requestStatus");

        this.fromLocationCode = fromLocationCode;
        this.columnMapper.put("fromLocationCode", "fromLocationCode");

        this.fromLocationName = fromLocationName;
        this.columnMapper.put("fromLocationName", "fromLocationName");

        this.fromLocationType = fromLocationType;
        this.columnMapper.put("fromLocationType", "fromLocationType");

        this.fromLocationSubType = fromLocationSubType;
        this.columnMapper.put("fromLocationSubType", "fromLocationSubType");

        this.fromLocationRegion = fromLocationRegion;
        this.columnMapper.put("fromLocationRegion", "fromLocationRegion");

        this.fromLocationProvince = fromLocationProvince;
        this.columnMapper.put("fromLocationProvince", "fromLocationProvince");

        this.toLocationCode = toLocationCode;
        this.columnMapper.put("toLocationCode", "toLocationCode");

        this.toLocationName = toLocationName;
        this.columnMapper.put("toLocationName", "toLocationName");

        this.toLocationType = toLocationType;
        this.columnMapper.put("toLocationType", "toLocationType");

        this.toLocationRegion = toLocationRegion;
        this.columnMapper.put("toLocationRegion", "toLocationRegion");

        this.toLocationSubType = toLocationSubType;
        this.columnMapper.put("toLocationSubType", "toLocationSubType");

        this.toLocationProvince = toLocationProvince;
        this.columnMapper.put("toLocationProvince", "toLocationProvince");

        this.pickingDateTime = pickingDateTime;
        this.columnMapper.put("pickingDateTime", "pickingDateTime");

        this.reservedNo = reservedNo;
        this.columnMapper.put("reservedNo", "reservedNo");

        this.doNo = doNo;
        this.columnMapper.put("doNo", "doNo");

        this.moveMentType = moveMentType;
        this.columnMapper.put("moveMentType", "moveMentType");

        this.createBy = createBy;
        this.columnMapper.put("createBy", "createBy");

        this.createDateTime = createDateTime;
        this.columnMapper.put("createDateTime", "createDateTime");

        this.updateBy = updateBy;
        this.columnMapper.put("updateBy ", "updateBy ");

        this.updateDateTime = updateDateTime;
        this.columnMapper.put("updateDateTime ", "updateDateTime ");

        this.cancelBy = cancelBy;
        this.columnMapper.put("cancelBy ", "cancelBy ");

        this.cancelDateTime = cancelDateTime;
        this.columnMapper.put("cancelDateTime", "cancelDateTime");

        this.shipToCode = shipToCode;
        this.columnMapper.put("shipToCode", "shipToCode");

        this.shipToName = shipToName;
        this.columnMapper.put("shipToName", "shipToName");

        this.shipToProvince = shipToProvince;
        this.columnMapper.put("shipToProvince", "shipToProvince");

        this.shipToAddress = shipToAddress;
        this.columnMapper.put("shipToAddress", "shipToAddress");

        this.shipToDistributionChannel = shipToDistributionChannel;
        this.columnMapper.put("shipToDistributionChannel", "shipToDistributionChannel");

        this.receiveBy = receiveBy;
        this.columnMapper.put("receiveBy", "receiveBy");

        this.mobileNo = mobileNo;
        this.columnMapper.put("mobileNo", "mobileNo");

        this.routeGroup = routeGroup;
        this.columnMapper.put("routeGroup", "routeGroup");

        this.remark = remark;
        this.columnMapper.put("remark", "remark");

        this.reason = reason;
        this.columnMapper.put("reason", "reason");

        this.stampDelivery = stampDelivery;
        this.columnMapper.put("stampDelivery", "stampDelivery");

        this.matCode_key = matCode_key;
        this.columnMapper.put("matCode_key", "matCode_key");

        this.brand_key = brand_key;
        this.columnMapper.put("brand_key", "brand_key");

        this.model_key = model_key;
        this.columnMapper.put("model_key", "model_key");

        this.productType_key = productType_key;
        this.columnMapper.put("productType_key", "productType_key");

        this.productSubType_key = productSubType_key;
        this.columnMapper.put("productSubType_key", "productSubType_key");

        this.commercialName_key = commercialName_key;
        this.columnMapper.put("commercialName_key ", "commercialName_key ");

        this.requestDetail = requestDetail;
        this.columnMapper.put("requestDetail ", "requestDetail ");

        this.quotaFlag = quotaFlag;
        this.columnMapper.put("quotaFlag", "quotaFlag");

        this.itemNo = itemNo;
        this.columnMapper.put("itemNo","itemNo");

        this.matDescription_key = matDescription_key;
        this.columnMapper.put("matDescription_key","matDescription_key");


    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getForSubStock() {
        return forSubStock;
    }

    public void setForSubStock(String forSubStock) {
        this.forSubStock = forSubStock;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getFromLocationCode() {
        return fromLocationCode;
    }

    public void setFromLocationCode(String fromLocationCode) {
        this.fromLocationCode = fromLocationCode;
    }

    public String getFromLocationName() {
        return fromLocationName;
    }

    public void setFromLocationName(String fromLocationName) {
        this.fromLocationName = fromLocationName;
    }

    public String getFromLocationType() {
        return fromLocationType;
    }

    public void setFromLocationType(String fromLocationType) {
        this.fromLocationType = fromLocationType;
    }

    public String getFromLocationSubType() {
        return fromLocationSubType;
    }

    public void setFromLocationSubType(String fromLocationSubType) {
        this.fromLocationSubType = fromLocationSubType;
    }

    public String getFromLocationRegion() {
        return fromLocationRegion;
    }

    public void setFromLocationRegion(String fromLocationRegion) {
        this.fromLocationRegion = fromLocationRegion;
    }

    public String getFromLocationProvince() {
        return fromLocationProvince;
    }

    public void setFromLocationProvince(String fromLocationProvince) {this.fromLocationProvince = fromLocationProvince;}

    public String getToLocationCode() {
        return toLocationCode;
    }

    public void setToLocationCode(String toLocationCode) {
        this.toLocationCode = toLocationCode;
    }

    public String getToLocationName() {
        return toLocationName;
    }

    public void setToLocationName(String toLocationName) {
        this.toLocationName = toLocationName;
    }

    public String getToLocationType() {
        return toLocationType;
    }

    public void setToLocationType(String toLocationType) {
        this.toLocationType = toLocationType;
    }

    public String getToLocationRegion() {
        return toLocationRegion;
    }

    public void setToLocationRegion(String toLocationRegion) {
        this.toLocationRegion = toLocationRegion;
    }

    public String getToLocationSubType() {
        return toLocationSubType;
    }

    public void setToLocationSubType(String toLocationSubType) {
        this.toLocationSubType = toLocationSubType;
    }

    public String getToLocationProvince() {
        return toLocationProvince;
    }

    public void setToLocationProvince(String toLocationProvince) {
        this.toLocationProvince = toLocationProvince;
    }

    public String getPickingDateTime() {
        return pickingDateTime;
    }

    public void setPickingDateTime(String pickingDateTime) {
        this.pickingDateTime = pickingDateTime;
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public String getDoNo() {
        return doNo;
    }

    public void setDoNo(String doNo) {
        this.doNo = doNo;
    }

    public String getMoveMentType() {
        return moveMentType;
    }

    public void setMoveMentType(String moveMentType) {
        this.moveMentType = moveMentType;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    public String getCancelBy() {
        return cancelBy;
    }

    public void setCancelBy(String cancelBy) {
        this.cancelBy = cancelBy;
    }

    public String getCancelDateTime() {
        return cancelDateTime;
    }

    public void setCancelDateTime(String cancelDateTime) {
        this.cancelDateTime = cancelDateTime;
    }

    public String getShipToCode() {
        return shipToCode;
    }

    public void setShipToCode(String shipToCode) {
        this.shipToCode = shipToCode;
    }

    public String getShipToName() {
        return shipToName;
    }

    public void setShipToName(String shipToName) {
        this.shipToName = shipToName;
    }

    public String getShipToProvince() {
        return shipToProvince;
    }

    public void setShipToProvince(String shipToProvince) {
        this.shipToProvince = shipToProvince;
    }

    public String getShipToAddress() {
        return shipToAddress;
    }

    public void setShipToAddress(String shipToAddress) {
        this.shipToAddress = shipToAddress;
    }

    public String getShipToDistributionChannel() {
        return shipToDistributionChannel;
    }

    public void setShipToDistributionChannel(String shipToDistributionChannel) {this.shipToDistributionChannel = shipToDistributionChannel;}

    public String getReceiveBy() {
        return receiveBy;
    }

    public void setReceiveBy(String receiveBy) {
        this.receiveBy = receiveBy;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getRouteGroup() {
        return routeGroup;
    }

    public void setRouteGroup(String routeGroup) {
        this.routeGroup = routeGroup;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStampDelivery() {
        return stampDelivery;
    }

    public void setStampDelivery(String stampDelivery) {
        this.stampDelivery = stampDelivery;
    }

    public List<Object> getMatCode_key() {
        return matCode_key;
    }

    public void setMatCode_key(List<Object> matCode_key) {
        this.matCode_key = matCode_key;
    }

    public List<Object> getBrand_key() {
        return brand_key;
    }

    public void setBrand_key(List<Object> brand_key) {
        this.brand_key = brand_key;
    }

    public List<Object> getModel_key() {
        return model_key;
    }

    public void setModel_key(List<Object> model_key) {
        this.model_key = model_key;
    }

    public List<Object> getProductType_key() {
        return productType_key;
    }

    public void setProductType_key(List<Object> productType_key) {
        this.productType_key = productType_key;
    }

    public List<Object> getProductSubType_key() {
        return productSubType_key;
    }

    public void setProductSubType_key(List<Object> productSubType_key) {
        this.productSubType_key = productSubType_key;
    }

    public List<Object> getCommercialName_key() {
        return commercialName_key;
    }

    public void setCommercialName_key(List<Object> commercialName_key) {
        this.commercialName_key = commercialName_key;
    }

    public String getRequestDetail() {
        return requestDetail;
    }

    public void setRequestDetail(String requestDetail) {
        this.requestDetail = requestDetail;
    }

    public String getQuotaFlag() {return quotaFlag;}

    public void setQuotaFlag(String quotaFlag) {this.quotaFlag = quotaFlag;}

    public String getItemNo() {return itemNo;}

    public void setItemNo(String itemNo) {this.itemNo = itemNo;}

    public List<Object> getMatDescription_key() {return matDescription_key;}

    public void setMatDescription_key(List<Object> matDescription_key) {this.matDescription_key = matDescription_key;}

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getDeviceHandsetQty() {
        return deviceHandsetQty;
    }

    public void setDeviceHandsetQty(String deviceHandsetQty) {
        this.deviceHandsetQty = deviceHandsetQty;
    }

    public String getDeviceHandsetBundleQty() {
        return deviceHandsetBundleQty;
    }

    public void setDeviceHandsetBundleQty(String deviceHandsetBundleQty) {
        this.deviceHandsetBundleQty = deviceHandsetBundleQty;
    }

    public String getSimPrepaidQty() {
        return simPrepaidQty;
    }

    public void setSimPrepaidQty(String simPrepaidQty) {
        this.simPrepaidQty = simPrepaidQty;
    }

    public String getSimPostpaidQty() {
        return simPostpaidQty;
    }

    public void setSimPostpaidQty(String simPostpaidQty) {
        this.simPostpaidQty = simPostpaidQty;
    }

    public String getPremiumQty() {
        return premiumQty;
    }

    public void setPremiumQty(String premiumQty) {
        this.premiumQty = premiumQty;
    }

    public String getOtherQty() {
        return otherQty;
    }

    public void setOtherQty(String otherQty) {
        this.otherQty = otherQty;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
