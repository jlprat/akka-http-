package io.github.jlprat.akka.http.workshop.ex1

import akka.http.scaladsl.server.{HttpApp, Route}

/**
  * This class showcases some useful Path directives
  * Created by @jlprat on 19/04/2017.
  */
class PathExample extends HttpApp {
  override protected[ex1] def route: Route = pathPrefix("foo") {
    pathEndOrSingleSlash {
      complete("got foo")
    } ~
    path("bar") {
      complete("got bar")
    }
  } ~ get {
    path("other") {
      complete("OK")
    }
  }
}

object PathExample extends App {
  new PathExample().startServer("localhost", 9000)
}
