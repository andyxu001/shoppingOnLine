用户注册:通过手机号注册(手机号接收短信验证码)

采用技术栈: springboot + nacos + sentinel + gateway + redis + mysql

网上商城(模块):
用户管理(user-manage:5001)
商品模块(commodity-manage:5002)
     |
     |
     |----商品展示
订单模块(order-manage:5003)
     |
     |
     |----订单管理(订单创建15分钟未支付自动取消)
库存模块(inventory-manage:5004)
支付模块(pay-manage:5005)
日志模块(log-manage:5006)
积分模块(score-manage:5007)
网关模块(gateway:5009)