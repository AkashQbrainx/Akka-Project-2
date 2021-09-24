package com.qbrainx.main

import akka.actor.{ActorRef, ActorSystem, Props}
import com.qbrainx.actor.MyActor
import com.qbrainx.actor.MyActor.{EnterJson, Stop, StopActor}


object main extends App {
  val system: ActorSystem = ActorSystem("myActorSystem")
  val actorJson: ActorRef = system.actorOf(Props[MyActor], "myActor")

  actorJson! EnterJson
  Thread.sleep(10000)
  system.terminate()

}
