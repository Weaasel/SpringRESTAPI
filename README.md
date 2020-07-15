# Spring REST API

Spting REST API를 이용한 간단한 CRUD 실습입니다.



## Download

```
$git clone https://github.com/Weaasel/SpringRESTAPI/tree/master/src/main
```



## Install

```
$./mvnw spring-boot:run
```



## Class

### Main

* DemoApplication
  * spring application을 Run 해주는 SpringBootApplication 클래스입니다.



### VO

* Product
  * id, name, price 세 필드를 가지는 variable object



### DAO

* ProductManager
  * Product들의 List를 관리하는 data access object
  * method
    * addProduct
    * getDatas
    * getProduct
    * removeProduct



### Controller

* WeaselRestController
  * 간단한 인사말을 출력하는 controller입니다.
  * URI : "/greeting"
  * method
    * hello : "/hello" 를 통해 GET 형식으로 name을 입력받아 "Hello %name" 을 출력합니다.
* WeaselProductController
  * Product 객체에 대한 요청을 처리하는 controller입니다.
  * URI : "/product"
  * method
    * getAll : 현재 가지고 있는 모든 Product의 정보를 출력
    * addProductByGet : Product 정보를 GET 형식으로 입력받아 ProductManager에 추가
    * addProductBtPost : Product 정보를 POST 형식으로 입력받아 ProductManager에 추가
    * getProduct : id 를 입력받아 해당하는 Product의 정보를 출력
    * delProduct : id 를 입력받아 해당하는 Product를 삭제