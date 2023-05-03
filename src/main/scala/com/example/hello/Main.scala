package com.example.hello

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp.Simple:
  val run = HelloServer.run[IO]
