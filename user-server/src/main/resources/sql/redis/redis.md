## redis结构设计
redis我们主要用于缓存
其作用：
- 保存临时数据，如用户登录token
- 帮助实现秒杀功能，缓存中数据处理完成后，再进行mysql处理

对于临时数据token,设计为string格式

对于秒杀功能，我们需要实现一个队列,需要两个属性(goods_id,goods_stock)
所以相对于的redis数据结构设计如下:spike('goods_id','goods_stock')，选用类型为hash类型