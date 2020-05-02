# elasticsearch结构设计
elasticsearch主要用于全文搜索功能
主要希望搜索出来特定的结构进行展示

我们希望输入关键词（在数据库中映射为商品名称，title），返回搜索结果
主要需要返回属性：img,price,intro,remark_count,sale,这些都可以根据mybatis得到

于是，我们需要在ES中存储的是，
商品id，商品tile，商品介绍，商品评价数量，商品所属店铺
对title进行检索，返回id

ES结构：索引，类型，文档
（分别对应，数据库，表，行）

因此，在结构上
索引:duomall
类型:goods
文档: 
    id:   title: