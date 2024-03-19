package com.dxl.mysqlstudy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SellOrder {

    private Long id;

    /**
     * 签订日期
     */
    private Date signingTime;

    private String signingTimeString;

    /**
     * 合同编号
     */
    private String contractNo;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * CAS号
     */
    private String casOrder;

    /**
     * 规格属性
     */
    private String attributeSpecification;

    /**
     * 单位
     */
    private String unit;

    /**
     * 数量
     */
    private BigDecimal amount;

    /**
     * 单价
     */
    private BigDecimal unitPrice;

    /**
     * 总价
     */
    private BigDecimal totalPrice;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 销售员
     */
    private String salesPerson;

    /**
     * 合同
     */
    private String contract;

    /**
     * 发货日期
     */
    private Date shipmentsTime;

    private String shipmentsTimeString;

    /**
     * 开票日期
     */
    private Date billingTime;

    private String billingTimeString;

    /**
     * 应收款日期
     */
    private Date accountsDueTime;

    private String accountsDueTimeString;

    /**
     * 收款日期
     */
    private Date accountsTime;

    private String accountsTimeString;

    /**
     * 收款金额
     */
    private BigDecimal accountsMoney;

    private Date createTime;

    private String createTimeString;

    private Date updateTime;

    private String updateTimeString;

    private Long userId;

    private String status;

    private String payType;

    /**
     * 数量+批次号+单位
     */
    private String accountBatchNumberUnit;

    /**
     * 发票金额
     */
    private BigDecimal billingMoney;

    /**
     * 发票号码
     */
    private String billingOrder;

    private String remark;

    private String signingBeginTime;
    private String signingEndTime;
    private String billingBeginTime;
    private String billingEndTime;
    private String accountsDueBeginTime;
    private String accountsDueEndTime;
    private String accountsBeginTime;
    private String accountsEndTime;
    private String shipmentsBeginTime;
    private String shipmentsEndTime;

    private String coin;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }


    public String getSigningBeginTime() {
        return signingBeginTime;
    }

    public void setSigningBeginTime(String signingBeginTime) {
        this.signingBeginTime = signingBeginTime;
    }

    public String getSigningEndTime() {
        return signingEndTime;
    }

    public void setSigningEndTime(String signingEndTime) {
        this.signingEndTime = signingEndTime;
    }

    public String getBillingBeginTime() {
        return billingBeginTime;
    }

    public void setBillingBeginTime(String billingBeginTime) {
        this.billingBeginTime = billingBeginTime;
    }

    public String getBillingEndTime() {
        return billingEndTime;
    }

    public void setBillingEndTime(String billingEndTime) {
        this.billingEndTime = billingEndTime;
    }

    public String getAccountsDueBeginTime() {
        return accountsDueBeginTime;
    }

    public void setAccountsDueBeginTime(String accountsDueBeginTime) {
        this.accountsDueBeginTime = accountsDueBeginTime;
    }

    public String getAccountsDueEndTime() {
        return accountsDueEndTime;
    }

    public void setAccountsDueEndTime(String accountsDueEndTime) {
        this.accountsDueEndTime = accountsDueEndTime;
    }

    public String getAccountsBeginTime() {
        return accountsBeginTime;
    }

    public void setAccountsBeginTime(String accountsBeginTime) {
        this.accountsBeginTime = accountsBeginTime;
    }

    public String getAccountsEndTime() {
        return accountsEndTime;
    }

    public void setAccountsEndTime(String accountsEndTime) {
        this.accountsEndTime = accountsEndTime;
    }

    public String getShipmentsBeginTime() {
        return shipmentsBeginTime;
    }

    public void setShipmentsBeginTime(String shipmentsBeginTime) {
        this.shipmentsBeginTime = shipmentsBeginTime;
    }

    public String getShipmentsEndTime() {
        return shipmentsEndTime;
    }

    public void setShipmentsEndTime(String shipmentsEndTime) {
        this.shipmentsEndTime = shipmentsEndTime;
    }


    public String getAccountBatchNumberUnit(String s) {
        return accountBatchNumberUnit;
    }

    public void setAccountBatchNumberUnit(String accountBatchNumberUnit) {
        this.accountBatchNumberUnit = accountBatchNumberUnit;
    }

    public BigDecimal getBillingMoney() {
        return billingMoney;
    }

    public void setBillingMoney(BigDecimal billingMoney) {
        this.billingMoney = billingMoney;
    }

    public String getBillingOrder() {
        return billingOrder;
    }

    public void setBillingOrder(String billingOrder) {
        this.billingOrder = billingOrder;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSigningTime() {
        return signingTime;
    }

    public void setSigningTime(Date signingTime) {
        this.signingTime = signingTime;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCasOrder() {
        return casOrder;
    }

    public void setCasOrder(String casOrder) {
        this.casOrder = casOrder;
    }

    public String getAttributeSpecification() {
        return attributeSpecification;
    }

    public void setAttributeSpecification(String attributeSpecification) {
        this.attributeSpecification = attributeSpecification;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        this.salesPerson = salesPerson;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Date getShipmentsTime() {
        return shipmentsTime;
    }

    public void setShipmentsTime(Date shipmentsTime) {
        this.shipmentsTime = shipmentsTime;
    }

    public Date getBillingTime() {
        return billingTime;
    }

    public void setBillingTime(Date billingTime) {
        this.billingTime = billingTime;
    }

    public Date getAccountsDueTime() {
        return accountsDueTime;
    }

    public void setAccountsDueTime(Date accountsDueTime) {
        this.accountsDueTime = accountsDueTime;
    }

    public Date getAccountsTime() {
        return accountsTime;
    }

    public void setAccountsTime(Date accountsTime) {
        this.accountsTime = accountsTime;
    }

    public BigDecimal getAccountsMoney() {
        return accountsMoney;
    }

    public void setAccountsMoney(BigDecimal accountsMoney) {
        this.accountsMoney = accountsMoney;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSigningTimeString() {
        return signingTimeString;
    }

    public void setSigningTimeString(String signingTimeString) {
        this.signingTimeString = signingTimeString;
    }

    public String getShipmentsTimeString() {
        return shipmentsTimeString;
    }

    public void setShipmentsTimeString(String shipmentsTimeString) {
        this.shipmentsTimeString = shipmentsTimeString;
    }

    public String getBillingTimeString() {
        return billingTimeString;
    }

    public void setBillingTimeString(String billingTimeString) {
        this.billingTimeString = billingTimeString;
    }

    public String getAccountsDueTimeString() {
        return accountsDueTimeString;
    }

    public void setAccountsDueTimeString(String accountsDueTimeString) {
        this.accountsDueTimeString = accountsDueTimeString;
    }

    public String getAccountsTimeString() {
        return accountsTimeString;
    }

    public void setAccountsTimeString(String accountsTimeString) {
        this.accountsTimeString = accountsTimeString;
    }

    public String getCreateTimeString() {
        return createTimeString;
    }

    public void setCreateTimeString(String createTimeString) {
        this.createTimeString = createTimeString;
    }

    public String getUpdateTimeString() {
        return updateTimeString;
    }

    public void setUpdateTimeString(String updateTimeString) {
        this.updateTimeString = updateTimeString;
    }
}
