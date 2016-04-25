scalaVersion := "2.11.8"

val nettyVersion = "4.1.0.CR7"

libraryDependencies ++= (
  ("io.netty" % "netty-codec-http2" % nettyVersion) ::
  ("io.netty" % "netty-handler-proxy" % nettyVersion) ::
  ("com.google.code.gson" % "gson" % "2.6.2") ::
  ("org.slf4j" % "slf4j-api" % "1.7.6") ::
  ("org.eclipse.jetty.alpn" % "alpn-api" % "1.1.2.v20150522" % "provided") ::
  ("org.slf4j" % "slf4j-simple" % "1.7.6" % "test") ::
  ("org.bouncycastle" % "bcpkix-jdk15on" % "1.53" % "test") ::
  Nil
)

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

libraryDependencies ++= List("linux-x86_64", "osx-x86_64", "windows-x86_64").map{ c =>
  "io.netty" % "netty-tcnative-boringssl-static" % "1.1.33.Fork15" % "test" classifier c
}

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")
