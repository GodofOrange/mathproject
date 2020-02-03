# 江苏科技大学精互同项目后端
## 简介
精互同大学生数学电子竞技平台是一款基于Java EE技术以及Unity技术开发的竞技教育类平台。

我们实现了江科大理学院叶慧老师的精益求精，互学互助，同心共济的教学理念。

教师可以通过此平台详细了解每个知识点学生的掌握情况，同时此平台以竞技的方式刺激学生学习兴趣，更好的掌握大学数学


## 技术栈

### 游戏及前端开发

>前端总体结合了Vue渐进式框架，并结合Element组件库来设计前端页面。
开发上我们使用了NPM对模块管理，并使用了webpack打包发布。
游戏模块采用了Unity3D WebGL技术开发。
前端模块包含了Apache Echarts(数据可视化模块)，markdown解析器，Tiny MCE富文本编辑器，以及对MathType数学公式编辑软件的支持。
另外也支持微信小程序端（数学建模）。
前端页面整体采用了简约式的布局。


### 服务端设计

>服务端主开发语言为Java，总体上使用了Spring技术栈来解决业务复杂问题。

1. 整个项目基于Spring Boot作为项目的基础。
2. 使用Spring MVC + Jackson做接口开发
3. 使用Spring Data JPA (ORM框架) 做数据库交互操作。
4. 使用Spring Security做http授权认证管理
5. 使用Redis 作为缓存数据库。
6. 使用MySQL作为后台数据库。
7. 使用Swagger作为接口文档。
8. 使用maven + Git管理项目开发。
9. 使用WebSocket向用户端做消息推送。
10. 使用docker对后端做打包发布。


