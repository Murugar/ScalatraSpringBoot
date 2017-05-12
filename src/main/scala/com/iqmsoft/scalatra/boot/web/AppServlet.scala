package com.iqmsoft.scalatra.boot.web

import com.iqmsoft.scalatra.boot.domain._
import org.scalatra.ScalatraServlet
import org.scalatra.json.JacksonJsonSupport


class AppServlet extends ScalatraServlet with JacksonJsonSupport {
  import org.json4s.{DefaultFormats, Formats}

  protected implicit val jsonFormats: Formats = DefaultFormats.withBigDecimal

  
  get("/api/addresses") {
    contentType = formats("json")
    List(
      new Address(1, "12 First Street", "CA", "99999"),
      new Address(2, "12 Second Street", "CA", "88888"),
      new Address(3, "12 Third Street", "CA", "77777"),
      new Address(4, "12 Four Street", "CA", "66666")
    )
  }
  
  
  get("/api/persons") {
    contentType = formats("json")
    List(
      new Person(1, "Bob", "Williams"),
      new Person(2, "Jack", "Spooner"),
      new Person(3, "Rob", "Hood"),
      new Person(4, "Meg", "Ryan")
    )
  }
  
  get("/api/prices") {
    contentType = formats("json")
    List(
      new Price(1, 12.00f),
      new Price(2, 10.00f),
      new Price(3, 5.00f),
      new Price(4, 7.00f)
    )
  }

  get("/") {
    contentType = formats("html5")
    <html lang="en">
      <head>
        <meta charset="UTF-8"/>
        <title>Scalatra Spring Boot Web</title>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
      
 </head>
      <body>
        <nav class="navbar navbar-inverse">

           <a href="#" class="navbar-header navbar-brand">Spring Boot Scalatra</a>

           <ul class="nav navbar-nav">
              <li class="active"><a href="#">Home</a></li>
              <li><a href="#">Contact</a></li>
           </ul>
           
            <ul class="nav navbar-nav navbar-right">
      				<li><a href="#">Sign Up</a></li>
      				<li><a href="#">Login</a></li>
    			 </ul>

        </nav>

        <div class="container">
             <div class="panel panel-primary">
             <div class="panel-heading"><h2>Spring Boot Scalatra</h2></div>
             <div class="panel-body"> 
                 <h1 class="text-danger">Greetings from Spring Boot Scalatra</h1>
                 <br/>
                  <a href="/api/persons"><h2 class="text-success">Click Me For Persons!!!!</h2></a>
                 <br/>
                  <a href="/api/addresses"><h2 class="text-warning">Click Me For Addresses!!!!</h2></a>
                <br/>
                  <a href="/api/prices"><h2 class="text-primary">Click Me For Prices!!!!</h2></a>
             </div> 
             </div> 
        </div>
       
      </body>
    </html>
  }
}
