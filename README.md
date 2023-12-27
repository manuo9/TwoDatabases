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
![Screenshot (119)](https://github.com/manuo9/Ecom_proteinz/assets/122933806/73dd1979-4c7f-42ef-b0e5-e8ede4535dee)
<hr>

![Screenshot (120)](https://github.com/manuo9/Ecom_proteinz/assets/122933806/82d4b0dd-410a-4ca1-925c-4d0d1f39dcb2)
<hr>

![Screenshot (121)](https://github.com/manuo9/Ecom_proteinz/assets/122933806/51d43223-654d-4a6c-aaf1-02ade7241a41)
<hr>

![Screenshot (122)](https://github.com/manuo9/Ecom_proteinz/assets/122933806/40f1f4dd-6b43-487d-b7d6-d4890b9054b1)
<hr>

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
 <h4> We welcome contributions to this Project Whether it's bug fixes, new features, or improvements to the documentation, your contributions help make this project better for everyone.</h4>

 ## Contributing 
 
<h4> This project is developed for demo purpose and it's not supposed to be used in real application. </h4>
