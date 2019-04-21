# Java Servlet & JDBC - Contact Book
[![Build Status](https://dev.azure.com/MXD615/java-contact-book/_apis/build/status/Matei207.contact-book?branchName=master)](https://dev.azure.com/MXD615/java-contact-book/_build/latest?definitionId=4&branchName=master)

## use servlet & jdbc 

```
Write a simple contact book web application using servlets and jdbc. You will then understand the underpinnings of the stateless request/response model of the web and direct SQL. Once you've gone though that pain you will have a deep understanding of why certain frameworks like Spring and ORM etc... exist
```


##  Netty/Jetty/Tomcat
```
If you want to do Java web dev I would recommend you to start with servlets and tomcat as servlet container. It'll help you to understand how a client-server communication works and how work most of legacy web apps. Then take a look at Spring MVC. it's a useful abstraction based on servlets (or Netty/Jetty). Finally try Spring Boot which is based on Spring and helps to build you application fast which is great for prototyping.
```

# Java Servlet + JDBC
---

## Contact Book App //TO-DO//

### Pages
---

* /*Landing Page*/
	* big picture (un splash?)
	* some deets
	* login/register
* */Sign in/*
	* Just the e-mail, password & whatever (maybe 0auth?)
* */Register/* : same as sign in
* */Members Area/*
	* should contain all of your contact books
	* ability to CRUD contact books
* */Contact Book/*
	* Able to view 10 random contacts (plus pages to go further?)
	* Add a contact to the book (CRUD): multiple things such as FB, gmail, etc. (not just phone number) & pic
	*  Sort/Search contacts (maybe elastic search or smth?)
* */Contact/* : see individual contact with all formatted details n stuff I suppose + EDIT/REMOVE option

* JS animations + JSP would be interesting? At least when deleting or listing contacts and stuff (such as smooth scroll)
* */ _DON’T FORGET CI/CD  TRAVIS V JENKINS + KUBE HELM CHART + SKAFFOLD MAYBE (ALTHOUGH IT WILL BE HARDER BECAUSE OF EMBEDDED TOMCAT)_ /*

### Testing
---
* TDD, need to look into how to test the persistence API and how to test servlets before I start
* 

### Servlet
---


### POJOs&DAOs
---
* Will use PSQL, need to see how to map data and how to serialize objects in the db
* Session tracking for AUTH?


