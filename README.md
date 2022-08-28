# Spring Boot by P'Us -> Java Version 11

### agenda

- create server side with spring CRUD
- search api

### keyword
- Bean คลาสที่สร้างขึ้นมาแล้ว, Bean = Class
- Spring = Framework
- Spring Boot = tools
- Layer แบางเป็น Controller, Service, Repository
- Controller ทำหน้าที่ รับ request และ ส่ง request
- Service ทำหน้าที่ Process และไปเรียก Service อื่น ๆ ใช้เก็บ Business logic จะไม่ทำเรื่องเก็บข้อมูล
- Repository ทำหน้าที่ เชื่อมต่อกับฐานข้อมูล
- @Autowire เป็นการทำ Dependency Injection โดยไม่ต้องเขียน constructor ใหม่
- @Data สร้าง Getter Setter ให้อัตโนมัติ
- @Component ทำให้ Class กลายเป็น Bean ให้ Spring อ่านได้
- @Entity ทำ mapping class ที่เป็น Data ไปลง database (ใน kotlin อาจจะใช้ dataclass แทน)
- JpaRepository เป็น interface ของ spring data สำหรับทำ naming convention ทำให้ไม่ต้องเขียน query methods พื้นฐาน (เช่น find, findAll, findById)
- 

### Run
- build jar file (maven clean, maven install)
- run jar file (default, uat, prod)

```bash 
java -jar -Dspring.profiles.active=<env>
```



