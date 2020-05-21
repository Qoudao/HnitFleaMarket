package org.hnitacm.pojo;

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
public class TalkInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long talkId;

    /**
     * 卖家id 外键关系(seller_info.seller-id)
     */
    private Long sellerId;

    /**
     * 用户id 外键关系(user_info.user_id)
     */
    private Long userId;

    /**
     * 聊天记录
     */
    private String talkContent;

    /**
     * 信息状态
     */
    private Integer talkStatus;

    private LocalDateTime created;

    private LocalDateTime modified;


}
