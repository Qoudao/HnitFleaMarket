package org.hnitacm.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Leo
 * @since 2020-05-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;

    /**
     * 订单编号
     */
    private Integer orderNumber;

    /**
     * 订单金额
     */
    private Float orderPrice;

    /**
     * 商品id 外键关系(good_info.good_id)
     */
    private Long goodId;

    /**
     * 用户id 外键关系(user_info.user_id)
     */
    private Long userId;

    /**
     * 卖家id 外键关系(seller_info.seller-id)
     */
    private Long sellerId;

    /**
     * 订单状态
     */
    private Integer orderStatus;

    /**
     * 地址id 外键关系(address_info.address_id
     */
    private Long addressId;

    private LocalDateTime created;

    private LocalDateTime modified;


}
