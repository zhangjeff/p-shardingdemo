package com.jeff.template.model.base;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Order implements Serializable {
    /**
     * 主键，自增长，步长＝1
     */
    private Long id;

    /**
     * sharding_key
     */
    private String shardingKey;

    /**
     * 渠道号标识（线上或者线下）
     */
    private Long channel;

    /**
     * 平台标识 1：B端PC，2：B端App，3：C端App
     */
    private Long plantform;

    /**
     * 客户端标示 1：商户开单pc客户端，2：商户开单app客户端，
     */
    private Long client;

    /**
     * 订单序列号
     */
    private String serialNumber;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 订单类型
     */
    private Integer orderType;

    /**
     * 商场id
     */
    private String marketId;

    /**
     * 商场名称
     */
    private String marketName;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 订单总金额
     */
    private BigDecimal totalAmount;

    /**
     * 促销总金额
     */
    private BigDecimal promotionTotalAmount;

    /**
     * 抹零金额
     */
    private BigDecimal exceptedChangeAmount;

    /**
     * 订单应付金额
     */
    private BigDecimal payableAmount;

    /**
     * 服务费
     */
    private BigDecimal serviceAmount;

    /**
     * 订单已付金额
     */
    private BigDecimal paidAmount;

    /**
     * 订单已退金额
     */
    private BigDecimal refundedAmount;

    /**
     * 创建人id，可以从用户系统获取创建人id
     */
    private String createUserId;

    /**
     * 创建人名称，从用户系统获取
     */
    private String createUserName;

    /**
     * 订单创建时间yyyy-mm-dd hh24:mi:ss
     */
    private Date createDate;

    /**
     * 最后更新人信息，可从用户系统获取最后更新人
     */
    private String lastUpdateUserId;

    /**
     * 最后更新人名称，从用户系统获取
     */
    private String lastUpdateUserName;

    /**
     * 最后更新日期
     */
    private Date lastUpdateDate;

    /**
     * 区域id
     */
    private Long areaId;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 购买人id
     */
    private String purchaserId;

    /**
     * 购买人名称
     */
    private String purchaserName;

    /**
     * 收货人id
     */
    private String receiverId;

    /**
     * 收货人名称
     */
    private String receiverName;

    /**
     * 收货人手机号
     */
    private String receiverMobile;

    /**
     * 移动电话
     */
    private String mobile;

    /**
     * 送货地址
     */
    private String address;

    /**
     * 运费
     */
    private BigDecimal carriage;

    /**
     * 备注
     */
    private String remark;

    /**
     * 
     */
    private Boolean deleteFlag;

    /**
     * 订金订单对应订单id
     */
    private Long referenceId;

    /**
     * 物流类型
     */
    private Integer deliverType;

    /**
     * 物流状态
     */
    private Integer deliverStatus;

    /**
     * 退单原因
     */
    private String refundReason;

    /**
     * 是否可以退款
     */
    private Boolean canRefund;

    /**
     * 合同号，龙果提供
     */
    private String contractNumber;

    /**
     * 系列编码，龙果提供
     */
    private String serialCode;

    /**
     * 系列名称，龙果提供
     */
    private String serialName;

    /**
     * 首付金额
     */
    private BigDecimal firstPayment;

    /**
     * 约定送货日期yyyy-mm-dd
     */
    private Date agreedDeliveryDate;

    /**
     * 经销商id
     */
    private String dealerId;

    /**
     * 商户名称
     */
    private String dealerName;

    /**
     * 实际送货日期
     */
    private Date realDeliverDate;

    /**
     * 确认收货日期
     */
    private Date realReceivedDate;

    /**
     * 省id
     */
    private String provinceId;

    /**
     * 省名称
     */
    private String provinceName;

    /**
     * 市id
     */
    private String cityId;

    /**
     * 市名称
     */
    private String cityName;

    /**
     * 区id
     */
    private String districtId;

    /**
     * 区名称
     */
    private String districtName;

    /**
     * 是否阶段订单
     */
    private Boolean isStage;

    /**
     * 结算状态
     */
    private Integer settlementStatus;

    /**
     * 结算时间
     */
    private Date settlementDate;

    /**
     * 结算金额
     */
    private BigDecimal settlementAmount;

    /**
     * 计划结算时间
     */
    private Date planedSettlementDate;

    /**
     * 评论状态
     */
    private Integer reviewStatus;

    /**
     * 退款状态
     */
    private Integer refundStatus;

    /**
     * 售后状态
     */
    private Integer afterSaleStatus;

    /**
     * oms商场uuid
     */
    private String omsUuid;

    /**
     * 评价时间
     */
    private Date reviewDate;

    /**
     * 对应评价系统的评价id
     */
    private String reviewId;

    /**
     * 按位存储状体,从左自右，高金额回访，撤场回访，真实性回访
     */
    private String returnVisitStatus;

    /**
     * 扩展订单类型状态：0未付费，1已付订金，2 已付尾款，3 未使用，4 已使用，5 已退款，6 未成团，7 已成团
     */
    private Boolean extendStatus;

    /**
     * 扩展订单类型：0 默认，1 预付费类型订单，2 付费券订单，3 停车费订单，4 拼团购订单
     */
    private Boolean extendType;

    /**
     * 主键，自增长，步长＝1
     * @return id 主键，自增长，步长＝1
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键，自增长，步长＝1
     * @param id 主键，自增长，步长＝1
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * sharding_key
     * @return sharding_key sharding_key
     */
    public String getShardingKey() {
        return shardingKey;
    }

    /**
     * sharding_key
     * @param shardingKey sharding_key
     */
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey == null ? null : shardingKey.trim();
    }

    /**
     * 渠道号标识（线上或者线下）
     * @return channel 渠道号标识（线上或者线下）
     */
    public Long getChannel() {
        return channel;
    }

    /**
     * 渠道号标识（线上或者线下）
     * @param channel 渠道号标识（线上或者线下）
     */
    public void setChannel(Long channel) {
        this.channel = channel;
    }

    /**
     * 平台标识 1：B端PC，2：B端App，3：C端App
     * @return plantform 平台标识 1：B端PC，2：B端App，3：C端App
     */
    public Long getPlantform() {
        return plantform;
    }

    /**
     * 平台标识 1：B端PC，2：B端App，3：C端App
     * @param plantform 平台标识 1：B端PC，2：B端App，3：C端App
     */
    public void setPlantform(Long plantform) {
        this.plantform = plantform;
    }

    /**
     * 客户端标示 1：商户开单pc客户端，2：商户开单app客户端，
     * @return client 客户端标示 1：商户开单pc客户端，2：商户开单app客户端，
     */
    public Long getClient() {
        return client;
    }

    /**
     * 客户端标示 1：商户开单pc客户端，2：商户开单app客户端，
     * @param client 客户端标示 1：商户开单pc客户端，2：商户开单app客户端，
     */
    public void setClient(Long client) {
        this.client = client;
    }

    /**
     * 订单序列号
     * @return serial_number 订单序列号
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * 订单序列号
     * @param serialNumber 订单序列号
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    /**
     * 订单状态
     * @return order_status 订单状态
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 订单类型
     * @return order_type 订单类型
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 订单类型
     * @param orderType 订单类型
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 商场id
     * @return market_id 商场id
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * 商场id
     * @param marketId 商场id
     */
    public void setMarketId(String marketId) {
        this.marketId = marketId == null ? null : marketId.trim();
    }

    /**
     * 商场名称
     * @return market_name 商场名称
     */
    public String getMarketName() {
        return marketName;
    }

    /**
     * 商场名称
     * @param marketName 商场名称
     */
    public void setMarketName(String marketName) {
        this.marketName = marketName == null ? null : marketName.trim();
    }

    /**
     * 店铺id
     * @return shop_id 店铺id
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 店铺id
     * @param shopId 店铺id
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * 店铺名称
     * @return shop_name 店铺名称
     */
    public String getShopName() {
        return shopName;
    }

    /**
     * 店铺名称
     * @param shopName 店铺名称
     */
    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    /**
     * 订单总金额
     * @return total_amount 订单总金额
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * 订单总金额
     * @param totalAmount 订单总金额
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 促销总金额
     * @return promotion_total_amount 促销总金额
     */
    public BigDecimal getPromotionTotalAmount() {
        return promotionTotalAmount;
    }

    /**
     * 促销总金额
     * @param promotionTotalAmount 促销总金额
     */
    public void setPromotionTotalAmount(BigDecimal promotionTotalAmount) {
        this.promotionTotalAmount = promotionTotalAmount;
    }

    /**
     * 抹零金额
     * @return excepted_change_amount 抹零金额
     */
    public BigDecimal getExceptedChangeAmount() {
        return exceptedChangeAmount;
    }

    /**
     * 抹零金额
     * @param exceptedChangeAmount 抹零金额
     */
    public void setExceptedChangeAmount(BigDecimal exceptedChangeAmount) {
        this.exceptedChangeAmount = exceptedChangeAmount;
    }

    /**
     * 订单应付金额
     * @return payable_amount 订单应付金额
     */
    public BigDecimal getPayableAmount() {
        return payableAmount;
    }

    /**
     * 订单应付金额
     * @param payableAmount 订单应付金额
     */
    public void setPayableAmount(BigDecimal payableAmount) {
        this.payableAmount = payableAmount;
    }

    /**
     * 服务费
     * @return service_amount 服务费
     */
    public BigDecimal getServiceAmount() {
        return serviceAmount;
    }

    /**
     * 服务费
     * @param serviceAmount 服务费
     */
    public void setServiceAmount(BigDecimal serviceAmount) {
        this.serviceAmount = serviceAmount;
    }

    /**
     * 订单已付金额
     * @return paid_amount 订单已付金额
     */
    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    /**
     * 订单已付金额
     * @param paidAmount 订单已付金额
     */
    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    /**
     * 订单已退金额
     * @return refunded_amount 订单已退金额
     */
    public BigDecimal getRefundedAmount() {
        return refundedAmount;
    }

    /**
     * 订单已退金额
     * @param refundedAmount 订单已退金额
     */
    public void setRefundedAmount(BigDecimal refundedAmount) {
        this.refundedAmount = refundedAmount;
    }

    /**
     * 创建人id，可以从用户系统获取创建人id
     * @return create_user_id 创建人id，可以从用户系统获取创建人id
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * 创建人id，可以从用户系统获取创建人id
     * @param createUserId 创建人id，可以从用户系统获取创建人id
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
    }

    /**
     * 创建人名称，从用户系统获取
     * @return create_user_name 创建人名称，从用户系统获取
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建人名称，从用户系统获取
     * @param createUserName 创建人名称，从用户系统获取
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    /**
     * 订单创建时间yyyy-mm-dd hh24:mi:ss
     * @return create_date 订单创建时间yyyy-mm-dd hh24:mi:ss
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 订单创建时间yyyy-mm-dd hh24:mi:ss
     * @param createDate 订单创建时间yyyy-mm-dd hh24:mi:ss
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 最后更新人信息，可从用户系统获取最后更新人
     * @return last_update_user_id 最后更新人信息，可从用户系统获取最后更新人
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * 最后更新人信息，可从用户系统获取最后更新人
     * @param lastUpdateUserId 最后更新人信息，可从用户系统获取最后更新人
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId == null ? null : lastUpdateUserId.trim();
    }

    /**
     * 最后更新人名称，从用户系统获取
     * @return last_update_user_name 最后更新人名称，从用户系统获取
     */
    public String getLastUpdateUserName() {
        return lastUpdateUserName;
    }

    /**
     * 最后更新人名称，从用户系统获取
     * @param lastUpdateUserName 最后更新人名称，从用户系统获取
     */
    public void setLastUpdateUserName(String lastUpdateUserName) {
        this.lastUpdateUserName = lastUpdateUserName == null ? null : lastUpdateUserName.trim();
    }

    /**
     * 最后更新日期
     * @return last_update_date 最后更新日期
     */
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * 最后更新日期
     * @param lastUpdateDate 最后更新日期
     */
    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    /**
     * 区域id
     * @return area_id 区域id
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * 区域id
     * @param areaId 区域id
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * 区域名称
     * @return area_name 区域名称
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 区域名称
     * @param areaName 区域名称
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 购买人id
     * @return purchaser_id 购买人id
     */
    public String getPurchaserId() {
        return purchaserId;
    }

    /**
     * 购买人id
     * @param purchaserId 购买人id
     */
    public void setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId == null ? null : purchaserId.trim();
    }

    /**
     * 购买人名称
     * @return purchaser_name 购买人名称
     */
    public String getPurchaserName() {
        return purchaserName;
    }

    /**
     * 购买人名称
     * @param purchaserName 购买人名称
     */
    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName == null ? null : purchaserName.trim();
    }

    /**
     * 收货人id
     * @return receiver_id 收货人id
     */
    public String getReceiverId() {
        return receiverId;
    }

    /**
     * 收货人id
     * @param receiverId 收货人id
     */
    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId == null ? null : receiverId.trim();
    }

    /**
     * 收货人名称
     * @return receiver_name 收货人名称
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * 收货人名称
     * @param receiverName 收货人名称
     */
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName == null ? null : receiverName.trim();
    }

    /**
     * 收货人手机号
     * @return receiver_mobile 收货人手机号
     */
    public String getReceiverMobile() {
        return receiverMobile;
    }

    /**
     * 收货人手机号
     * @param receiverMobile 收货人手机号
     */
    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile == null ? null : receiverMobile.trim();
    }

    /**
     * 移动电话
     * @return mobile 移动电话
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 移动电话
     * @param mobile 移动电话
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 送货地址
     * @return address 送货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 送货地址
     * @param address 送货地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 运费
     * @return carriage 运费
     */
    public BigDecimal getCarriage() {
        return carriage;
    }

    /**
     * 运费
     * @param carriage 运费
     */
    public void setCarriage(BigDecimal carriage) {
        this.carriage = carriage;
    }

    /**
     * 备注
     * @return remark 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 
     * @return delete_flag 
     */
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * 
     * @param deleteFlag 
     */
    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * 订金订单对应订单id
     * @return reference_id 订金订单对应订单id
     */
    public Long getReferenceId() {
        return referenceId;
    }

    /**
     * 订金订单对应订单id
     * @param referenceId 订金订单对应订单id
     */
    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * 物流类型
     * @return deliver_type 物流类型
     */
    public Integer getDeliverType() {
        return deliverType;
    }

    /**
     * 物流类型
     * @param deliverType 物流类型
     */
    public void setDeliverType(Integer deliverType) {
        this.deliverType = deliverType;
    }

    /**
     * 物流状态
     * @return deliver_status 物流状态
     */
    public Integer getDeliverStatus() {
        return deliverStatus;
    }

    /**
     * 物流状态
     * @param deliverStatus 物流状态
     */
    public void setDeliverStatus(Integer deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    /**
     * 退单原因
     * @return refund_reason 退单原因
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * 退单原因
     * @param refundReason 退单原因
     */
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    /**
     * 是否可以退款
     * @return can_refund 是否可以退款
     */
    public Boolean getCanRefund() {
        return canRefund;
    }

    /**
     * 是否可以退款
     * @param canRefund 是否可以退款
     */
    public void setCanRefund(Boolean canRefund) {
        this.canRefund = canRefund;
    }

    /**
     * 合同号，龙果提供
     * @return contract_number 合同号，龙果提供
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * 合同号，龙果提供
     * @param contractNumber 合同号，龙果提供
     */
    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber == null ? null : contractNumber.trim();
    }

    /**
     * 系列编码，龙果提供
     * @return serial_code 系列编码，龙果提供
     */
    public String getSerialCode() {
        return serialCode;
    }

    /**
     * 系列编码，龙果提供
     * @param serialCode 系列编码，龙果提供
     */
    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode == null ? null : serialCode.trim();
    }

    /**
     * 系列名称，龙果提供
     * @return serial_name 系列名称，龙果提供
     */
    public String getSerialName() {
        return serialName;
    }

    /**
     * 系列名称，龙果提供
     * @param serialName 系列名称，龙果提供
     */
    public void setSerialName(String serialName) {
        this.serialName = serialName == null ? null : serialName.trim();
    }

    /**
     * 首付金额
     * @return first_payment 首付金额
     */
    public BigDecimal getFirstPayment() {
        return firstPayment;
    }

    /**
     * 首付金额
     * @param firstPayment 首付金额
     */
    public void setFirstPayment(BigDecimal firstPayment) {
        this.firstPayment = firstPayment;
    }

    /**
     * 约定送货日期yyyy-mm-dd
     * @return agreed_delivery_date 约定送货日期yyyy-mm-dd
     */
    public Date getAgreedDeliveryDate() {
        return agreedDeliveryDate;
    }

    /**
     * 约定送货日期yyyy-mm-dd
     * @param agreedDeliveryDate 约定送货日期yyyy-mm-dd
     */
    public void setAgreedDeliveryDate(Date agreedDeliveryDate) {
        this.agreedDeliveryDate = agreedDeliveryDate;
    }

    /**
     * 经销商id
     * @return dealer_id 经销商id
     */
    public String getDealerId() {
        return dealerId;
    }

    /**
     * 经销商id
     * @param dealerId 经销商id
     */
    public void setDealerId(String dealerId) {
        this.dealerId = dealerId == null ? null : dealerId.trim();
    }

    /**
     * 商户名称
     * @return dealer_name 商户名称
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * 商户名称
     * @param dealerName 商户名称
     */
    public void setDealerName(String dealerName) {
        this.dealerName = dealerName == null ? null : dealerName.trim();
    }

    /**
     * 实际送货日期
     * @return real_deliver_date 实际送货日期
     */
    public Date getRealDeliverDate() {
        return realDeliverDate;
    }

    /**
     * 实际送货日期
     * @param realDeliverDate 实际送货日期
     */
    public void setRealDeliverDate(Date realDeliverDate) {
        this.realDeliverDate = realDeliverDate;
    }

    /**
     * 确认收货日期
     * @return real_received_date 确认收货日期
     */
    public Date getRealReceivedDate() {
        return realReceivedDate;
    }

    /**
     * 确认收货日期
     * @param realReceivedDate 确认收货日期
     */
    public void setRealReceivedDate(Date realReceivedDate) {
        this.realReceivedDate = realReceivedDate;
    }

    /**
     * 省id
     * @return province_id 省id
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 省id
     * @param provinceId 省id
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 省名称
     * @return province_name 省名称
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * 省名称
     * @param provinceName 省名称
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }

    /**
     * 市id
     * @return city_id 市id
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 市id
     * @param cityId 市id
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 市名称
     * @return city_name 市名称
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * 市名称
     * @param cityName 市名称
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * 区id
     * @return district_id 区id
     */
    public String getDistrictId() {
        return districtId;
    }

    /**
     * 区id
     * @param districtId 区id
     */
    public void setDistrictId(String districtId) {
        this.districtId = districtId == null ? null : districtId.trim();
    }

    /**
     * 区名称
     * @return district_name 区名称
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 区名称
     * @param districtName 区名称
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName == null ? null : districtName.trim();
    }

    /**
     * 是否阶段订单
     * @return is_stage 是否阶段订单
     */
    public Boolean getIsStage() {
        return isStage;
    }

    /**
     * 是否阶段订单
     * @param isStage 是否阶段订单
     */
    public void setIsStage(Boolean isStage) {
        this.isStage = isStage;
    }

    /**
     * 结算状态
     * @return settlement_status 结算状态
     */
    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    /**
     * 结算状态
     * @param settlementStatus 结算状态
     */
    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    /**
     * 结算时间
     * @return settlement_date 结算时间
     */
    public Date getSettlementDate() {
        return settlementDate;
    }

    /**
     * 结算时间
     * @param settlementDate 结算时间
     */
    public void setSettlementDate(Date settlementDate) {
        this.settlementDate = settlementDate;
    }

    /**
     * 结算金额
     * @return settlement_amount 结算金额
     */
    public BigDecimal getSettlementAmount() {
        return settlementAmount;
    }

    /**
     * 结算金额
     * @param settlementAmount 结算金额
     */
    public void setSettlementAmount(BigDecimal settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    /**
     * 计划结算时间
     * @return planed_settlement_date 计划结算时间
     */
    public Date getPlanedSettlementDate() {
        return planedSettlementDate;
    }

    /**
     * 计划结算时间
     * @param planedSettlementDate 计划结算时间
     */
    public void setPlanedSettlementDate(Date planedSettlementDate) {
        this.planedSettlementDate = planedSettlementDate;
    }

    /**
     * 评论状态
     * @return review_status 评论状态
     */
    public Integer getReviewStatus() {
        return reviewStatus;
    }

    /**
     * 评论状态
     * @param reviewStatus 评论状态
     */
    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    /**
     * 退款状态
     * @return refund_status 退款状态
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * 退款状态
     * @param refundStatus 退款状态
     */
    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * 售后状态
     * @return after_sale_status 售后状态
     */
    public Integer getAfterSaleStatus() {
        return afterSaleStatus;
    }

    /**
     * 售后状态
     * @param afterSaleStatus 售后状态
     */
    public void setAfterSaleStatus(Integer afterSaleStatus) {
        this.afterSaleStatus = afterSaleStatus;
    }

    /**
     * oms商场uuid
     * @return oms_uuid oms商场uuid
     */
    public String getOmsUuid() {
        return omsUuid;
    }

    /**
     * oms商场uuid
     * @param omsUuid oms商场uuid
     */
    public void setOmsUuid(String omsUuid) {
        this.omsUuid = omsUuid == null ? null : omsUuid.trim();
    }

    /**
     * 评价时间
     * @return review_date 评价时间
     */
    public Date getReviewDate() {
        return reviewDate;
    }

    /**
     * 评价时间
     * @param reviewDate 评价时间
     */
    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    /**
     * 对应评价系统的评价id
     * @return review_id 对应评价系统的评价id
     */
    public String getReviewId() {
        return reviewId;
    }

    /**
     * 对应评价系统的评价id
     * @param reviewId 对应评价系统的评价id
     */
    public void setReviewId(String reviewId) {
        this.reviewId = reviewId == null ? null : reviewId.trim();
    }

    /**
     * 按位存储状体,从左自右，高金额回访，撤场回访，真实性回访
     * @return return_visit_status 按位存储状体,从左自右，高金额回访，撤场回访，真实性回访
     */
    public String getReturnVisitStatus() {
        return returnVisitStatus;
    }

    /**
     * 按位存储状体,从左自右，高金额回访，撤场回访，真实性回访
     * @param returnVisitStatus 按位存储状体,从左自右，高金额回访，撤场回访，真实性回访
     */
    public void setReturnVisitStatus(String returnVisitStatus) {
        this.returnVisitStatus = returnVisitStatus == null ? null : returnVisitStatus.trim();
    }

    /**
     * 扩展订单类型状态：0未付费，1已付订金，2 已付尾款，3 未使用，4 已使用，5 已退款，6 未成团，7 已成团
     * @return extend_status 扩展订单类型状态：0未付费，1已付订金，2 已付尾款，3 未使用，4 已使用，5 已退款，6 未成团，7 已成团
     */
    public Boolean getExtendStatus() {
        return extendStatus;
    }

    /**
     * 扩展订单类型状态：0未付费，1已付订金，2 已付尾款，3 未使用，4 已使用，5 已退款，6 未成团，7 已成团
     * @param extendStatus 扩展订单类型状态：0未付费，1已付订金，2 已付尾款，3 未使用，4 已使用，5 已退款，6 未成团，7 已成团
     */
    public void setExtendStatus(Boolean extendStatus) {
        this.extendStatus = extendStatus;
    }

    /**
     * 扩展订单类型：0 默认，1 预付费类型订单，2 付费券订单，3 停车费订单，4 拼团购订单
     * @return extend_type 扩展订单类型：0 默认，1 预付费类型订单，2 付费券订单，3 停车费订单，4 拼团购订单
     */
    public Boolean getExtendType() {
        return extendType;
    }

    /**
     * 扩展订单类型：0 默认，1 预付费类型订单，2 付费券订单，3 停车费订单，4 拼团购订单
     * @param extendType 扩展订单类型：0 默认，1 预付费类型订单，2 付费券订单，3 停车费订单，4 拼团购订单
     */
    public void setExtendType(Boolean extendType) {
        this.extendType = extendType;
    }
}