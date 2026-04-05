Features
Entities: Product with fields:
java
@Id
@GeneratedValue
private Long id;
private String name;
private String price;
Lombok: Used for getters, setters, constructors (@Data, @NoArgsConstructor, @AllArgsConstructor) to avoid boilerplate.

Repository: Extends JpaRepository with custom query:
java
List<Product> findByName(String name);

Controller: REST endpoints for CRUD operations:
GET /products → Fetch all products
POST /products → Add new product
GET /search-product?name=xyz → Search product by name

H2 Database
In-memory database (data stored in RAM, cleared when app terminate).
I find it Perfect for testing and development.

Console enabled at:
Code
http://localhost:8080/h2-console
Default JDBC URL:

Code

Tables auto-created by Hibernate from @Entity classes.

How to Run
Clone the repo:
git clone https://github.com/your-username/cart-kart.git
cd cart-kart

Build and run:
bash
mvn spring-boot:run

Test endpoints with Postman or browser:
GET http://localhost:8080/products
POST http://localhost:8080/products
GET http://localhost:8080/search-product?name=Laptop (AS REQUESTPARAM )

Tech Stack
1. Spring Boot
2. Spring Data JPA
3. H2 Database
4. Lombok
5. Maven
