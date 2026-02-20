# Spring Boot 测试应用

这是一个简单的 Spring Boot 测试应用，用于测试自动 Dockerfile 生成和部署。

## 项目信息

- **语言**: Java 17
- **框架**: Spring Boot 3.2.0
- **构建工具**: Maven
- **端口**: 8080

## 功能特性

- REST API 端点
- 健康检查端点
- Spring Boot Actuator 监控

## API 端点

### 1. Hello 接口
```
GET /api/hello
```
返回欢迎消息和时间戳

### 2. 健康检查接口
```
GET /api/health
```
返回应用状态

### 3. Actuator 健康端点
```
GET /actuator/health
```
返回详细的健康检查信息

## 本地运行

### 使用 Maven 运行
```bash
mvn clean package
mvn spring-boot:run
```

### 使用 Java 运行打包后的 JAR
```bash
mvn clean package
java -jar target/test-app-1.0.0.jar
```

## 测试

启动应用后，访问以下 URL 测试：

- http://localhost:8080/api/hello
- http://localhost:8080/api/health
- http://localhost:8080/actuator/health

## Docker 部署

此项目专门用于测试自动生成 Dockerfile 的部署系统。不需要手动编写 Dockerfile。

期望的 Docker 容器配置：
- 暴露端口: 8080
- 运行命令: `java -jar target/test-app-1.0.0.jar`

## 许可证

MIT License



