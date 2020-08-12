package com.lzw.controller;

import org.springframework.stereotype.Controller;

import java.io.File;

@Controller
public class BaseController {

    public static final String FOODIE_SHOPCART = "shopcart";

    public static final Integer COMMON_PAGE_SIZE = 10;
    public static final Integer PAGE_SIZE = 20;

    public static final String REDIS_USER_TOKEN = "redis_user_token";

//    @Autowired
//    private RedisOperator redisOperator;

    // 支付中心的调用地址
    String paymentUrl = "http://payment.t.mukewang.com/foodie-payment/payment/createMerchantOrder";        // produce


    //微信支付成功->支付中心->天天吃货平台
    String payReturnUrl = "http://106.54.132.212:8088/foodie-dev-api/orders/notifyMerchantOrderPaid";

    //用户上传头像地址F:\imooc\images\foodie\faces
    public static final String IMAGE_USER_FACE_LOCATION = File.separator
            + "workspaces" + File.separator + "images" + File.separator + "foodie" +
            File.separator + "faces";

//    @Autowired
//    public MyOrdersService myOrdersService;

    //fixme 下面的逻辑移植到订单中心
//    @Autowired
//    /**
//     * 用于验证用户和订单是否有关联关系，避免非法用户调用
//     * @return
//     */
//    public JSONResult checkUserOrder(String userId, String orderId) {
//        Orders order = myOrdersService.queryMyOrder(userId, orderId);
//        if (order == null) {
//            return JSONResult.errorMsg("订单不存在！");
//        }
//        return JSONResult.ok(order);
//    }


}
