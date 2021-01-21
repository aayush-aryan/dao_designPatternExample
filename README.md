# dao_designPatternExample

here example of dao design pattern
DAO stands for Data Access Object. 
DAO Design Pattern is used to separate the data persistence logic in a separate layer. 
This way, the service remains completely in dark about how the low-level operations to access the database is done. 
This is known as the principle of Separation of Logic.


With DAO design pattern, we have following components on which our design depend :----
The interfaces which provides a flexible design.
The interface implementation which is a concrete implementation of the persistence logic


Implementing DAO pattern :

here we try to implement the DAO pattern. We will use 3 components here:

The  @ Book @ model which is transferred from one layer to the other.
The @ BookDao @ interface that provides a flexible design and API to implement.
@@ BookDaoImpl @@ concrete class that is an implementation of the BookDao interface.
