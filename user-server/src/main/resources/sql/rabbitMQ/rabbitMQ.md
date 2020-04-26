## rabbitMQ结构设计
rabbitMQ我们主要希望实现的消息队列的"消息存入和消息取出"
具体表现为:
- 一个位置存入手机验证码，另外一个位置取出消息验证码
- 一个位置清空了购物车，另外一个位置生成了订单（当然也可以使用feign调用完成）

对于验证码功能：
1.选择服务模式：直接模式，分裂模式，主题模式，在这里选择直接模式就可以
2.设计交换器: registration_verification_code_exchange
3.设计消息队列： registration_verification_code_queue
4.routing_key: