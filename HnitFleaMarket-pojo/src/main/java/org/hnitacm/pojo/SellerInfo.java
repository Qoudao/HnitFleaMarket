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
public class SellerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "seller_id", type = IdType.AUTO)
    private Long sellerId;

    /**
     * 商家认证信息
     */
    private String sellerCertification;

    /**
     * 商家的评论数量
     */
    private Long sellerEvaluationNumber;

    /**
     * 商家的订单数量
     */
    private Long sellerOrderNumber;

    /**
     * 商家的评分
     */
    private Float sellerScore;

    private LocalDateTime created;

    private LocalDateTime modified;


}
