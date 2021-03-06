package sample.reactivekafka

import akka.actor.{ ActorSystem, Props }

object Application extends App {

  implicit val system = ActorSystem("CurrencyWatcher")
  system.actorOf(Props(new Coordinator()))
}
