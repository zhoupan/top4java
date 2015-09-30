## 设计原则 ##
  1. 容易维护扩展（不需要修改主类就可以添加新的API支持）
  1. 注入型解释器（依据不同的返回格式注入相应的解释器）
  1. 集中管理请求参数与参数映射
  1. 以运行时异常的方式来管理错误的响应
  1. 使用泛型来做强类型编程
  1. 多协议扩展支持（REST, RPC, SOAP, etc）
## 设计类图 ##
![http://top4java.googlecode.com/files/Top4Java.png](http://top4java.googlecode.com/files/Top4Java.png)
## 扩展方式 ##
  1. 实现TopRequest类，覆盖其中的getApiName和getTextParams方法
  1. 实现TopParser类，覆盖其中的parse方法
## 环境依赖 ##
  * JDK 1.5或以上
## 调用方式 ##
```
TopClient client = new TopRestClient("http://gw.api.tbsandbox.com/router/rest", "test", "test", "json");
UserGetRequest request = new UserGetRequest();
request.setFields("user_id,nick,sex,created,location");
request.setNick("tbtest520");
User user = client.execute(request, new ObjectJsonParser<User>(User.class));
```
```
TopJsonRestClient client = new TopJsonRestClient("http://gw.api.tbsandbox.com/router/rest", "test", "test");
UserGetRequest request = new UserGetRequest();
request.setFields("user_id,nick,sex,created,location");
request.setNick("tbtest520");
User user = client.userGet(request);
```
```
TopJsonRestClient client = new TopJsonRestClient("http://gw.api.tbsandbox.com/router/rest", "test", "test");
ItemUpdateRequest request = new ItemUpdateRequest();
request.setIid("9ce7d2a5a38c1a20346cdd4af6f90de3");
request.setTitle("Updated by Top4Java");
request.setImage(new FileItem(new File("C:/temp.jpg")));
Item item = client.itemUpdate(request, "session_key");
```

```
TopJsonRestClient client = new TopJsonRestClient("http://gw.api.tbsandbox.com/router/rest", "test", "test");
TradesSoldGetRequest req = new TradesSoldGetRequest();
req.setFields("tid,seller_nick,buyer_nick,orders.oid,orders.iid,orders.title,orders.price");
PageList<Trade> rsp = client.tradesSoldGet(req, "session_key");
List<Trade> trades = rsp.getContent();
Long totalResults = rsp.getTotalResults();
```