# TwoDatabases

## Description
This robust application showcases the dynamic integration of two powerful databases, MySQL and PostgreSQL, offering an in-depth exploration of their functionalities within the Java environment. Leveraging the Spring framework and Hibernate, this project encapsulates the essence of modern Java development, emphasizing clean, efficient, and scalable coding practices.

The project emphasizes the seamless interplay between **MySQL** and **PostgreSQL** databases 

## Endpoints
<pre>GET /fetchall - Retrieve data from the primary database (PostgreSQL).</pre>
<pre>GET /fetchallmongo - Retrieve data from the secondary database (MySQL).</pre>
<pre>PUT /update/{id} - Update entity details based on ID for the PostgreSQL</pre>
<pre>PUT /update/mong/{id} - Update entity details based on ID for MySQL</pre>
<pre>DELETE /delete/post/{id} - Delete entity details based on ID for PostgreSQL</pre>
<pre>DELETE /delete/mong/{id} - Delete entity details based on ID for MySQL</pre>

## Database Configuration
<pre># MySQL Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=root
spring.datasource.password=root

# PostgreSQL Configuration
spring.postgresql.datasource.url=jdbc:postgresql://localhost:5432/your_database
spring.postgresql.datasource.username=postgres
spring.postgresql.datasource.password=root
</pre>

 ## Contributing 
 <h4> We welcome contributions to Proteinz! Whether it's bug fixes, new features, or improvements to the documentation, your contributions help make this project better for everyone.</h4>

 ## Contributing 
 
<h4> This project is developed for demo purpose and it's not supposed to be used in real application. </h4>
