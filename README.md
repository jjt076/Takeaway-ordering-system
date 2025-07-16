# Sky Take Out 外卖点餐系统

这是一个基于 Java 的外卖点餐系统后端项目，支持用户在线点餐、购物车、订单管理、后台菜品与员工管理、报表统计等功能。项目采用 Spring Boot、MyBatis、Redis、JWT 等主流技术，适合外卖平台后端开发学习和企业级项目实践。

## 项目简介

Sky Take Out 致力于为用户和商家提供高效、便捷的外卖点餐服务。系统分为用户端和管理端，涵盖从下单到订单管理、菜品管理、数据统计等全流程。

## 项目结构

```
sky-take-out/
├── sky-common   # 公共模块（常量、工具类、异常、配置等）
├── sky-pojo     # 实体模块（DTO、实体类、VO）
├── sky-server   # 业务模块（Controller、Service、Mapper、配置等）
└── ...
```

## 主要功能

- 用户端：
  - 用户注册与登录
  - 菜品浏览与搜索
  - 购物车管理
  - 在线下单与支付
  - 订单查询与管理
- 管理端：
  - 员工管理
  - 菜品与套餐管理
  - 订单管理与处理
  - 数据报表统计
- 其他：
  - JWT 鉴权与权限控制
  - 全局异常处理
  - AOP 自动填充
  - WebSocket 实时通知
  - 集成阿里云 OSS、微信支付等第三方服务
  - 统一接口返回格式，便于前后端联调

## 技术栈

- Spring Boot
- MyBatis
- Redis
- JWT
- WebSocket
- 阿里云 OSS
- 微信支付
- Maven
- MySQL

## 环境要求

- JDK 8 及以上
- Maven 3.6+
- MySQL 5.7/8.0
- Redis 5+
- IDEA 或 Eclipse 等 Java IDE

## 快速开始

1. 克隆本仓库：
   ```bash
   git clone <仓库地址>
   ```
2. 使用 IDE 以 Maven 项目导入
3. 配置数据库和第三方服务（修改 `sky-server/src/main/resources/application.yml`）
4. 初始化数据库（执行 SQL 脚本，如有）
5. 启动 `sky-server` 模块
6. 访问接口文档或前端页面进行体验

## 目录说明

- `sky-common`：公共模块，存放常量、工具类、异常等
- `sky-pojo`：实体模块，包含 DTO、实体类、VO
- `sky-server`：业务模块，包含 Controller、Service、Mapper、配置等

## 贡献与反馈

- 欢迎提交 Issue 反馈问题
- 欢迎 PR 贡献代码
- Star 支持项目发展

## 协议

本项目采用 MIT License 开源协议。 